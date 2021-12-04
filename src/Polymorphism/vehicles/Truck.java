package Polymorphism.vehicles;

import java.text.DecimalFormat;

public class Truck extends VehicleImpl {
    private static final double AC_ADDITIONAL_CONSUMPTION = 1.6;
    private static final double REFUEL_PERCENTAGE = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }


    @Override
    public void refuel(double litters) {
       super.refuel(litters*REFUEL_PERCENTAGE);
    }

    @Override
    public void setFuelConsumption(double fuelConsumption) {
        super.setFuelConsumption(fuelConsumption+AC_ADDITIONAL_CONSUMPTION);
    }




}
