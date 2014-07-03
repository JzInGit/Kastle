package com.klein.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.klein.exception.OKUtilException;

public class CipherUtil
{

    private final static String[] HEXDIGITS = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "a", "b", "c", "d", "e", "f" };

    public static String generatePwd(String cleartext)
            throws OKUtilException
    {
        return encodeByMD5(cleartext);
    }

    public static boolean validatePwd(String ciphertext, String cleartext)
            throws OKUtilException
    {
        if (ciphertext.equals(encodeByMD5(cleartext)))
        {
            return true;
        }
        return false;
    }

    private static String encodeByMD5(String cleartext)
            throws OKUtilException
    {
        if (cleartext != null)
        {
            MessageDigest md = null;
            try
            {
                md = MessageDigest.getInstance("MD5");
            }
            catch (NoSuchAlgorithmException e)
            {
                throw new OKUtilException("The MD5 cryptographic algorithm is not available.");
            }
            byte[] results = md.digest(cleartext.getBytes());
            String resultString = byteArrayToHexString(results);
            return resultString.toUpperCase();
        }
        return null;
    }

    private static String byteArrayToHexString(byte[] b)
    {
        StringBuffer md5Sb = new StringBuffer();
        for (int i = 0; i < b.length; i++)
        {
            md5Sb.append(byteToHexString(b[i]));
        }
        return md5Sb.toString();
    }

    private static String byteToHexString(byte b)
    {
        int n = b;
        if (n < 0)
        {
            n = 256 + n;
        }
        int d1 = n / 16;
        int d2 = n % 16;
        return HEXDIGITS[d1] + HEXDIGITS[d2];
    }

    public static void main(String[] args)
            throws OKUtilException
    {
        System.out.println(generatePwd("owen"));
        System.out.println(validatePwd("43996FB100428B0D99E233C3261F7187", "owen"));
    }

}
