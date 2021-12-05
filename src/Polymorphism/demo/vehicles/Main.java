package Polymorphism.demo.vehicles;

import org.jetbrains.annotations.NotNull;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(" ");
        Vehicle car = getVehicle(tokens);

        tokens = scanner.nextLine().split(" ");
        Vehicle truck = getVehicle(tokens);

        tokens = scanner.nextLine().split(" ");
        Vehicle bus = getVehicle(tokens);

        Map<String,Vehicle> vehicles = new LinkedHashMap<>();
        vehicles.put("Car",car);
        vehicles.put("Truck",truck);
        vehicles.put("Bus",bus);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            tokens = scanner.nextLine().split(" ");
            String commandName = tokens[0];
            String vehicleType = tokens[1];
            switch (commandName){
                case "Drive":
                    double distance = Double.parseDouble(tokens[2]);

                    System.out.println(vehicles.get(vehicleType).drive(distance));

                    break;
                case "Refuel":
                    double litters = Double.parseDouble(tokens[2]);
                    vehicles.get(vehicleType).refuel(litters);
                    break;
            }



        }
        vehicles.values().forEach(System.out::println);




    }

    @NotNull
    private static Vehicle getVehicle(String[] tokens) {
      String vehicleType = tokens[0];
        double fuelAmount = Double.parseDouble(tokens[1]);
        double consumption = Double.parseDouble(tokens[2]);
        double tankCapacity = Double.parseDouble(tokens[3]);
        Vehicle vehicle = null;
        switch (vehicleType){
            case "Car":
                vehicle = new Car(fuelAmount,consumption,tankCapacity);
                break;
            case "Bus":
                vehicle = new Bus(fuelAmount,consumption,tankCapacity);
                break;
            case "Truck":
                vehicle = new Truck(fuelAmount, consumption, tankCapacity);
                break;
        }

        return vehicle;
    }
}
