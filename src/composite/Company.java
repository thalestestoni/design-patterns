package composite;

public class Company {
    public static void main(String[] args) {
        Developer dev1 = new Developer(200, "Joao da Silva", "Senior Developer");
        Developer dev2 = new Developer(201, "Maria Santos", "Entry Level Developer");
        Intern int1 = new Intern(300, "Pedro Martins", "Development Intern");
        Manager man1 = new Manager(400, "Ricardo Pereira", "Development Manager");
        Director dir1 = new Director(500, "Marcos Oliveira", "Development Director");

        dir1.addEmployee(man1);
        man1.addEmployee(dev1);
        man1.addEmployee(dev2);
        dev2.addEmployee(int1);

        dir1.showEmployeeDetails();
    }
}
