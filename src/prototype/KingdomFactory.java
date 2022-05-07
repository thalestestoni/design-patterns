package prototype;

public class KingdomFactory  {
    private KingPrototype kingPrototype;
    private CastlePrototype castlePrototype;
    private ArmyPrototype armyPrototype;

    public KingdomFactory(KingPrototype kingPrototype, CastlePrototype castlePrototype, ArmyPrototype armyPrototype) {
        this.kingPrototype = kingPrototype;
        this.castlePrototype = castlePrototype;
        this.armyPrototype = armyPrototype;
    }

    public KingPrototype createKing() {
        return kingPrototype.clone();
    }

    public CastlePrototype createCastle(){
        return castlePrototype.clone();
    }

    public ArmyPrototype createArmy() {
        return armyPrototype.clone();
    }
}
