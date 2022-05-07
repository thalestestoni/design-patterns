package prototype;

public class ElfKing implements KingPrototype {
    public ElfKing() {

    }

    public ElfKing(ElfKing elfKing) {

    }

    @Override
    public String getDescription() {
        return "This is the Elf King!";
    }

    @Override
    public KingPrototype clone() {
        return new ElfKing(this);
    }
}
