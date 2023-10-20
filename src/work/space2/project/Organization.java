package work.space2.project;

public class Organization{

    private Department[] departments;
    private Employee[] employees;
    private Director[] OrganizationDirectors;

    public Organization(Department[] departments, Employee[] employees, Director[] organizationDirectors) {
        this.departments = departments;
        this.employees = employees;
        OrganizationDirectors = organizationDirectors;
    }
}
