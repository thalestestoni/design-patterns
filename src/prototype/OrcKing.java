package prototype;

public class OrcKing implements KingPrototype {
    public OrcKing() {

    }

    public OrcKing(OrcKing orcKing) {

    }

    @Override
    public String getDescription() {
        return "This is de Orc King!";
    }

    @Override
    public KingPrototype clone() {
        return new OrcKing(this);
    }
}
