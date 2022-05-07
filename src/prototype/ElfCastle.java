package prototype;

public class ElfCastle implements CastlePrototype {
    public ElfCastle() {

    }

    public ElfCastle(ElfCastle elfCastle) {

    }

    @Override
    public String getDescription() {
        return "This is the Elf Castle!";
    }

    @Override
    public CastlePrototype clone() {
        return new ElfCastle(this);
    }
}
