package shejimoshi.facade.facade;

import shejimoshi.facade.children.CPU;
import shejimoshi.facade.children.Disk;
import shejimoshi.facade.children.Memory;

public class Computer {
    private CPU cpu;
    private Memory memory;
    private Disk disk;
    public Computer(){
         cpu = new CPU();
         memory = new Memory();
         disk = new Disk();
    }
    public void start(){
        System.out.println("Computer start begin");
        cpu.start();
        disk.start();
        memory.start();
        System.out.println("Computer start end");
    }

    public void shutdown(){
        System.out.println("Computer shutdown begin");
        cpu.shutdown();
        disk.shutdown();
        memory.shutdown();
        System.out.println("Computer shutdown end");
    }
}
