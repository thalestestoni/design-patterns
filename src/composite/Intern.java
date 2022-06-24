package composite;

public class Intern implements Employee {
    private int codigo;
    private String nome;
    private String cargo;

    public Intern(int codigo, String nome, String cargo) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Codigo: %s".formatted(this.codigo));
        System.out.println("Nome: %s".formatted(this.nome));
        System.out.println("Cargo: %s".formatted(this.cargo));
        System.out.println();
    }
}
