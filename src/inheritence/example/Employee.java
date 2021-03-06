package inheritence.example;

public class Employee extends Person {

    private String companyName;

    public Employee(String companyName) {
        this(null, 0, null, companyName);
    }

    public Employee(String name, int age, String email, String companyName) {
        super(name, age, email);
        this.companyName = companyName;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + String.format(" and I am working at %s", companyName);
    }
}
