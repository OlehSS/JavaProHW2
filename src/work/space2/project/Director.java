package work.space2.project;

public class Director extends Employee{

    public Director(int departmentId, String name, int age, Employee[] employees) {
        super(departmentId, name, age);
        this.employees = employees;
    }

    private Employee[] employees;
}
