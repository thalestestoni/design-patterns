package abstractFactory;

public class Kingdom {
    private King king;
    private Castle castle;
    private Army army;

    public Kingdom(KingdomFactory kingdomFactory){
        king = kingdomFactory.createKing();
        castle = kingdomFactory.createCastle();
        army = kingdomFactory.createArmy();
    }

    public void getDescription(){
        System.out.println(king.getDescription());
        System.out.println(castle.getDescription());
        System.out.println(army.getDescription());
    }
}
