package inheritence.example;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ivan",32,"ivan@gmail.com");
        Employee employee = new Employee("Ivan",32,"ivan@email.com","SoftUni");
        System.out.println(employee.getInfo());
        System.out.println(person.getInfo());
    }
}
