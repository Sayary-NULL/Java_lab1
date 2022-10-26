package PModule;

public class CPU extends Module {
    int core;
    int threads;
    String socket;

    public CPU() {
        core = threads = 0;
        socket = "";
    }

    public CPU(String name_cpu, String company_name, int core, int threads, String socket) {
        this.core = core;
        this.threads = threads;
        this.socket = socket;
        this.name = name_cpu;
        this.company_name = company_name;
        this.type = EModule.CPU;
    }

    public CPU(CPU cpu) {
        this.core = cpu.core;
        this.threads = cpu.threads;
        this.socket = cpu.socket;
        this.name = cpu.name;
        this.company_name = cpu.company_name;
        this.type = cpu.type;
    }

    @Override // переопределим, хотя можно для первых параметров не писать сам prln, но напишем
    public void print_info() {
        System.out.println("CPU params:");
        System.out.println("name: " + name);
        System.out.println("company_name: " + company_name);
        System.out.println("cores: " + core);
        System.out.println("threads: " + threads);
        System.out.println("socket: " + socket);
    }
}
