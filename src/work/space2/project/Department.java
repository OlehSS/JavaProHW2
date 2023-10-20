package work.space2.project;

public class Department {

    private Employee[] employees;

    private Director director;

    public Department(Employee[] employees, Director director) {
        this.employees = employees;
        this.director = director;
    }
}
