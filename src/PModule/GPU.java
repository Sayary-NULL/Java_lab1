package PModule;

public class GPU extends Module{
    int core;
    // хотел юзать гб, чтобы использовать меньшие обьем памяти (изать больше памети для сохранения памяти))
    int memory_size;
    String series;

    public GPU() {
        core = memory_size = 0;
        series = "";
    }

    public GPU(String name_gpu, String company_name, int core, int memory_size, String series) {
        this.core = core;
        this.memory_size = memory_size;
        this.series = series;
        this.name = name_gpu;
        this.company_name = company_name;
        this.type = EModule.GPU;
    }

    public GPU(GPU gpu) {
        this.core = gpu.core;
        this.memory_size = gpu.memory_size;
        this.series = gpu.series;
        this.name = gpu.name;
        this.company_name = gpu.company_name;
        this.type = gpu.type;
    }

    @Override
    public void print_info() {
        System.out.println("GPU params:");
        System.out.println("name: " + name);
        System.out.println("company_name: " + company_name);
        System.out.println("cores: " + core);
        System.out.println("memory size: " + memory_size);
        System.out.println("series: " + series);
    }
}
