package Polymorphism.demo;

public class Main {
    public static void main(String[] args) {

        Singer mySinger = new RockSinger();

        mySinger.sing();

        if(mySinger instanceof OperaSinger){
            OperaSinger operaSinger = (OperaSinger) mySinger;
        }



    }
}
