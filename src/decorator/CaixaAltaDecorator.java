package decorator;

public class CaixaAltaDecorator extends FonteDeDadosDecorator {
    public CaixaAltaDecorator(FonteDeDados fonte) {
        super(fonte);
    }

    @Override
    public String resultado() {
        return super.resultado().toUpperCase();
    }
}
