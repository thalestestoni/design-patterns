package decorator;

public class FonteDeDadosDecorator implements FonteDeDados {
    private FonteDeDados fonte;

    public FonteDeDadosDecorator(FonteDeDados fonte) {
        this.fonte = fonte;
    }

    @Override
    public String resultado() {
        return fonte.resultado();
    }
}
