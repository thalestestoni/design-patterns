package prototype;

public class MainDepois {
    public static void main(String[] args) {
        Kingdom kingdom;

        kingdom = new Kingdom(new KingdomFactory(
            new ElfKing(),
            new ElfCastle(),
            new ElfArmy()));
       kingdom.printDescription();

       kingdom = new Kingdom(new KingdomFactory(
            new OrcKing(),
            new OrcCastle(),
            new OrcArmy()));
        kingdom.printDescription();
    }
}
