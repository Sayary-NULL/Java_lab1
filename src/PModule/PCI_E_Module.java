package PModule;

public class PCI_E_Module extends Module{
    String pci_e_type;
    String desc;
    // хз что вставить, будет только два параметра, хотя старался 3

    public PCI_E_Module() {
        pci_e_type = desc = "";
    }

    public PCI_E_Module(String name_cpu, String company_name, String pci_e_type, String desc) {
        this.pci_e_type = pci_e_type;
        this.desc = desc;
        this.name = name_cpu;
        this.company_name = company_name;
        this.type = EModule.PCI_E;
    }

    public PCI_E_Module(PCI_E_Module pm) {
        this.pci_e_type = pm.pci_e_type;
        this.desc = pm.desc;
        this.name = pm.name;
        this.company_name = pm.company_name;
        this.type = pm.type;
    }

    @Override
    public void print_info() {
        System.out.println("PCI-E Module params:");
        System.out.println("name: " + name);
        System.out.println("company_name: " + company_name);
        System.out.println("pci-e type: " + pci_e_type);
        System.out.println("описание: " + desc);
    }
}
