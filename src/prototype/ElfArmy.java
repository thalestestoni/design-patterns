package prototype;

public class ElfArmy implements ArmyPrototype {
    public ElfArmy() {

    }

    public ElfArmy(ElfArmy elfArmy) {

    }

    @Override
    public String getDescription() {
        return "This is the Elf Army";
    }

    @Override
    public ArmyPrototype clone() {
        return new ElfArmy(this);
    }
}
