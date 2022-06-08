package decorator;

public class FonteDeDadosString implements FonteDeDados {
    private String string;

    public FonteDeDadosString(String string) {
        this.string = string;
    }

    @Override
    public String resultado() {
        return this.string;
    }
}
