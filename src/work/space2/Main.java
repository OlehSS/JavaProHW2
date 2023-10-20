package work.space2;

import work.space2.project.Department;
import work.space2.project.Director;
import work.space2.project.Employee;
import work.space2.project.Organization;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(12, "Mark", 33);
        Employee employee2 = new Employee(12, "Stiven", 23);
        Employee employee3 = new Employee(12, "Bob", 46);

        Employee[] employees1 = {employee1, employee2, employee3};

        Director director1 = new Director(12, "Karl", 55, employees1);

        Department dep1 = new Department(employees1, director1);

        Department[] departments = {dep1};

        Director[] directors= {director1};

        Organization org1 = new Organization(departments, employees1, directors);
    }
}
