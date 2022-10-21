import PModule.*;

public class SuperPC extends Computing_Machine {
    String company_name;

    public SuperPC() {
        super();
    }

    public SuperPC(CPU cpu, GPU gpu, RAM ram, Main_Plate mp, PCI_E_Module pm, Memory_Storage ms, String company_name) {
        super(cpu, gpu, ram, mp, pm, ms);
        this.company_name = company_name;
    }

    public SuperPC(SuperPC pc) {
        super((Computing_Machine) pc);
        this.company_name = pc.company_name;
    }

    public String get_company() {return this.company_name;}
    public void set_company(String company_name) { this.company_name = company_name; }
}
