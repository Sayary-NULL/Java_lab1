package PModule;

public class Module {
    String name;
    String company_name;
    EModule type = EModule.OTHER;

    public void print_info() {
        System.out.println("Module " + name);
        System.out.println("Company: " + company_name);
    }
}
