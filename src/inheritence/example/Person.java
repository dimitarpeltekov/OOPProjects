package inheritence.example;

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        System.out.println("Person's parametrized ctor called");
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getInfo(){
        return String.format("Hi, my name is %s. I am %d years old, if you want to talk my email is %s",name,age,email);
    }





}
