package Encapsulation;

public class Person {
    private int age;


    public Person(int age) {
        this.age = age;
    }

    public void printAge(){
        System.out.println(age);
    }

    private void birthday(){
        age++;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
