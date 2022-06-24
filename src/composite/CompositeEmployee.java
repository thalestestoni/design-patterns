package composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeEmployee implements Employee {
    private int codigo;
    private String nome;
    private String cargo;
    private List<Employee> employeeList;

    public CompositeEmployee(int codigo, String nome, String cargo) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Codigo: %s".formatted(this.codigo));
        System.out.println("Nome: %s".formatted(this.nome));
        System.out.println("Cargo: %s".formatted(this.cargo));
        System.out.println();

        for (Employee employee : employeeList) {
            employee.showEmployeeDetails();
        }
    }
}
