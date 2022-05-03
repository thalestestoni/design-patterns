package factoryMethod;

public abstract class Kingdom {
    public abstract King createKing();
    public abstract  Castle createCastle();
    public abstract Army createArmy();

    public void printDescription() {
        King king = createKing();
        Castle castle = createCastle();
        Army army = createArmy();

        System.out.println(king.getDescription());
        System.out.println(castle.getDescription());
        System.out.println(army.getDescription());
    }
}
