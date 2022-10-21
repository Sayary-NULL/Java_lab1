package PModule;

public class RAM extends Module{
    int memory_size;
    String times;
    String type_s;

    public RAM() {
        memory_size = 0;
        times = times = "";
    }

    public RAM(String name_ram, String company_name, int memory_size, String times, String type) {
        this.times = times;
        this.memory_size = memory_size;
        this.type_s = type;
        this.name = name_ram;
        this.company_name = company_name;
        this.type = EModule.GPU;
    }

    public RAM(RAM ram) {
        this.times = ram.times;
        this.memory_size = ram.memory_size;
        this.type_s = ram.type_s;
        this.name = ram.name;
        this.company_name = ram.company_name;
        this.type = ram.type;
    }

    @Override
    public void print_info() {
        System.out.println("RAM params:");
        System.out.println("name: " + name);
        System.out.println("company_name: " + company_name);
        System.out.println("times: " + times);
        System.out.println("memory size: " + memory_size);
        System.out.println("type_s: " + type_s);
    }
}
