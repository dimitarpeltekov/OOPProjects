package InterfacesAndAbstraction.animals;

public interface Animal  {

    default void breathe(){
        System.out.println("Animal breathes air");
    };

    void move();
    void eat();
    void reproduce();
    default void jump(){
        System.out.println("Animal is jumping");
    }




}
