package PModule;

import java.util.*;
// базовый класс для всех остальных классов "Компьютеров"
public abstract class Computing_Machine {
    CPU cpu;
    GPU gpu;
    RAM ram;
    Main_Plate mp;
    PCI_E_Module pm;
    Memory_Storage ms;
    // конечно можно и ограничить, но представим что мы богады и можем засунуть в пк много модулей
    ArrayList<Module> modules;
    final String OS = "Linux";

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
        // тут рекомендуют в try засунуть переопределение, но мы и так знаем изначальныый тип и мы не в питоне)
        this.modules = (ArrayList<Module>) cm.modules.clone();
    }
    // да! можно добавлять! не удалять!)
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
    // зря чтоли писали все функции?) вот их и вызовем
    public void print_info(){
        System.out.println("OS: " + OS);
        cpu.print_info();
        gpu.print_info();
        ram.print_info();
        mp.print_info();
        pm.print_info();
        ms.print_info();
        // как удобно, когда все модули лежат в одном месте)
        for(Module el: modules){
            el.print_info();
        }
    }
    // он есть, но про него никто не знает)
    protected void finalize() {
        // зачем? чтобы было, а то делать что-то мы должны, вот и симулируем что мы что-то делаем (как на работе))
        this.modules.clear();
    }
}
