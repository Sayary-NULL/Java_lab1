package PModule;

// базовый класс для всех модулей пк
public class Module {
    String name;
    String company_name;
    // попробуем через перечисление, но мне кажетя что надо было делать строками
    EModule type = EModule.OTHER;

    // хорошобы заставить принудительно это переопределять, но есть места где юзаются базовый класс.
    public void print_info() {
        System.out.println("Module " + name);
        System.out.println("Company: " + company_name);
    }
}
