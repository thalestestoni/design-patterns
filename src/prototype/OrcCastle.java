package prototype;

public class OrcCastle implements CastlePrototype {
    public OrcCastle() {

    }

    public OrcCastle(OrcCastle orcCastle) {

    }

    @Override
    public String getDescription() {
        return "This is the Orc Castle!";
    }

    @Override
    public CastlePrototype clone() {
        return new OrcCastle(this);
    }
}
