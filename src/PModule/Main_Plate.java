package PModule;

public class Main_Plate extends Module{
    String socket;
    int count_pci_e_port;
    // а что еще есть простое у матплаты? РГБ!
    Boolean rgb_light;

    public Main_Plate() {
        count_pci_e_port = 0;
        socket = "";
        rgb_light = Boolean.FALSE;
    }

    public Main_Plate(String name_mp, String company_name, int count_pci_e_port, String socket, Boolean rgb_light) {
        this.socket = socket;
        this.count_pci_e_port = count_pci_e_port;
        this.rgb_light = rgb_light;
        this.name = name_mp;
        this.company_name = company_name;
        this.type = EModule.MAIN_PLATE;
    }

    public Main_Plate(Main_Plate mp) {
        this.socket = mp.socket;
        this.count_pci_e_port = mp.count_pci_e_port;
        this.rgb_light = mp.rgb_light;
        this.name = mp.name;
        this.company_name = mp.company_name;
        this.type = mp.type;
    }

    @Override
    public void print_info() {
        System.out.println("Maine Plate params:");
        System.out.println("name: " + name);
        System.out.println("company_name: " + company_name);
        System.out.println("count pci_e port: " + count_pci_e_port);
        System.out.println("socket: " + socket);
        System.out.println("rgb light: " + rgb_light);
    }
}
