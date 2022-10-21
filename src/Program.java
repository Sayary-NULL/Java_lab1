import PModule.*;

public class Program {
    public static void main (String[] args){
        CPU cpu = new CPU("Ryzen 5 2600X", "AMD",6, 12, "AM4");
        GPU gpu = new GPU("NVIDIA 9090 TI", "NVIDIA", 9090, 33554432, "series 2");
        RAM ram = new RAM("NO NAME", "NO NAME", 33554432, "0-0-0", "DDR16");
        Main_Plate mp = new Main_Plate("ASUS ROCK B450", "ASUS", 30, "ZEN+", Boolean.TRUE);
        PCI_E_Module pm = new PCI_E_Module("MUSIC PLATE", "MUSIC INC", "PCI-E x1024", "MUCIC PLATE");
        Memory_Storage ms = new Memory_Storage("WD", "WD", 8*1024*1024, "m2", "SATA 2");

        PC pc = new PC(cpu, gpu, ram, mp, pm, ms, "IM");

        pc.print_info();
    }
}
