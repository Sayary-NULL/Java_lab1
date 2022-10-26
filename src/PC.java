import PModule.*;

public class PC extends Computing_Machine {
    // мой! и точка!
    String owner;
    // можно было бы вставить переменную про ОС, но "надо было ставить линкукс!" никуда не делся,
    // поэтому наши пк всегда юзают UNIX системму)

    public PC() {
        super();
    }

    public PC(CPU cpu, GPU gpu, RAM ram, Main_Plate mp, PCI_E_Module pm, Memory_Storage ms, String owner) {
        super(cpu, gpu, ram, mp, pm, ms);
        this.owner = owner;
    }

    public PC(PC pc) {
        super((Computing_Machine) pc);
        this.owner = pc.owner;
    }

    public String get_owner() {return this.owner;}
    public void set_owner(String owner) { this.owner = owner; }
}
