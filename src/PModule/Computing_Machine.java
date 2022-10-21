package PModule;

import java.util.*;

public abstract class Computing_Machine {
    CPU cpu;
    GPU gpu;
    RAM ram;
    Main_Plate mp;
    PCI_E_Module pm;
    Memory_Storage ms;
    ArrayList<Module> modules;

    public Computing_Machine(){
        cpu = new CPU();
        gpu = new GPU();
        ram = new RAM();
        mp = new Main_Plate();
        pm = new PCI_E_Module();
        ms = new Memory_Storage();
        modules = new ArrayList<>();
    }

    public Computing_Machine(CPU cpu, GPU gpu, RAM ram, Main_Plate mp, PCI_E_Module pm, Memory_Storage ms){
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.mp = mp;
        this.pm = pm;
        this.ms = ms;
        modules = new ArrayList<>();
    }

    public Computing_Machine(Computing_Machine cm) {
        this.cpu = cm.cpu;
        this.gpu = cm.gpu;
        this.ram = cm.ram;
        this.mp = cm.mp;
        this.pm = cm.pm;
        this.ms = cm.ms;
        this.modules = (ArrayList<Module>) cm.modules.clone();
    }

    public void add_module(Module module) {
        modules.add(module);
    }

    /*Auto-gen*/
    public void set_cpu(CPU cpu) {this.cpu = cpu;}
    public CPU get_cpu() {return cpu;}
    public void set_gpu(GPU gpu) {this.gpu = gpu;}
    public GPU get_gpu() {return gpu;}
    public void set_ram(RAM ram) {this.ram = ram;}
    public RAM get_ram() {return ram;}
    public void set_mp(Main_Plate mp) {this.mp = mp;}
    public Main_Plate get_mp() {return mp;}
    public void set_pm(PCI_E_Module pm) {this.pm = pm;}
    public PCI_E_Module get_pm() {return pm;}
    public void set_ms(Memory_Storage ms) {this.ms = ms;}
    public Memory_Storage get_ms() {return ms;}

    public void print_info(){
        cpu.print_info();
        gpu.print_info();
        ram.print_info();
        mp.print_info();
        pm.print_info();
        ms.print_info();

        for(Module el: modules){
            el.print_info();
        }
    }

    protected void finalize() {
        this.modules.clear();
    }
}
