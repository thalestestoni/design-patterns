package decorator;

public class InverteDecorator extends FonteDeDadosDecorator {
    public InverteDecorator(FonteDeDados fonte) {
        super(fonte);
    }

    @Override
    public String resultado() {
        String string = super.resultado();
        return inverterString(string);
    }

    public String inverterString(String string) {
        StringBuilder sb = new StringBuilder(string);
        sb.reverse();
        return sb.toString();
    }
}
