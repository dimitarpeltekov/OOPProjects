package Polymorphism.wildFarm;

public class Mouse extends Mammal{
    public Mouse(String name, String type, double weight, String livingRegion) {
        super(name, type, weight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eat(Food food) {
        if(food instanceof Meat){
            throw new IllegalArgumentException("Mouse are not eating that type of food!");
        }
        super.eat(food);

    }
}
