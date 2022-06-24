package decorator;

public class Main {
    public static void main(String[] args) {
        String str = "Padroes de projeto";

        FonteDeDados fonte = new InverteDecorator(
                new CaixaAltaDecorator(new
                        FonteDeDadosString(str)));

        System.out.println(fonte.resultado());
        // Saida deve ser: OTEJORP ED SEORDAP
    }
}
