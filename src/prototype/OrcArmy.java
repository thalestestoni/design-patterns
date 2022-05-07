package prototype;

public class OrcArmy implements ArmyPrototype {
    public OrcArmy() {

    }

    public OrcArmy(OrcArmy orcArmy) {

    }

    @Override
    public String getDescription() {
        return "This is the Orc Army";
    }

    @Override
    public ArmyPrototype clone() {
        return new OrcArmy(this);
    }
}
