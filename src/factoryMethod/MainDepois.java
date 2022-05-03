package factoryMethod;

public class MainDepois {
    public static void main(String[] args) {
        Kingdom kingdom = new ElfKingdom();
        kingdom.printDescription();

        kingdom = new OrcKingdom();
        kingdom.printDescription();
    }
}
