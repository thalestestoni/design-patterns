package prototype;

import abstractFactory.Army;
import abstractFactory.Castle;
import abstractFactory.King;

public class Kingdom {
    private KingPrototype king;
    private CastlePrototype castle;
    private ArmyPrototype army;

    public Kingdom(KingdomFactory kingdomFactory){
        king = kingdomFactory.createKing();
        castle = kingdomFactory.createCastle();
        army = kingdomFactory.createArmy();
    }

    public void printDescription(){
        System.out.println(king.getDescription());
        System.out.println(castle.getDescription());
        System.out.println(army.getDescription());
    }
}
