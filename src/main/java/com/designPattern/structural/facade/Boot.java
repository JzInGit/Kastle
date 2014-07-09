package com.designPattern.structural.facade;

public class Boot
{
    private CPU cpu;
    private Disk disk;
    private Memory memory;

    public Boot()
    {
        cpu = new CPU();
        disk = new Disk();
        memory = new Memory();
    }

    public void startup()
    {
        cpu.startup();
        disk.startup();
        memory.startup();
    }

    public void shutdown()
    {
        cpu.shutdown();
        disk.shutdown();
        memory.shutdown();
    }
}
