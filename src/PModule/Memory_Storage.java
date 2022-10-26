package PModule;

public class Memory_Storage extends Module{
    int memory_size;
    String type_storage;
    String type_connect;

    public Memory_Storage() {
        memory_size = 0;
        type_storage = type_connect = "";
    }

    public Memory_Storage(String name_mem, String company_name, int memory_size, String type_storage, String type_connect) {
        this.type_storage = type_storage;
        this.memory_size = memory_size;
        this.type_connect = type_connect;
        this.name = name_mem;
        this.company_name = company_name;
        this.type = EModule.MEMORY_STORE;
    }

    public Memory_Storage(Memory_Storage ms) {
        this.type_storage = ms.type_storage;
        this.memory_size = ms.memory_size;
        this.type_connect = ms.type_connect;
        this.name = ms.name;
        this.company_name = ms.company_name;
        this.type = ms.type;
    }

    @Override
    public void print_info() {
        System.out.println("Memory Storage params:");
        System.out.println("name: " + name);
        System.out.println("company_name: " + company_name);
        System.out.println("type storage: " + type_storage);
        System.out.println("memory size: " + memory_size);
        System.out.println("type connect: " + type_connect);
    }
}
