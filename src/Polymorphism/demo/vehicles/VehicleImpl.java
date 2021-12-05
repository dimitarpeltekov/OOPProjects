package Polymorphism.demo.vehicles;

import java.text.DecimalFormat;

public  class VehicleImpl implements Vehicle{
    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;

    protected VehicleImpl(double fuelQuantity, double fuelConsumption,double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.setFuelConsumption(fuelConsumption);
        this.tankCapacity = tankCapacity;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String drive(double distance) {
        double fuelNeeded = distance*getFuelConsumption();
        if(fuelNeeded>this.getFuelQuantity()){
            return String.format("%s needs refueling",this.getClass().getSimpleName()) ;
        }
        this.setFuelQuantity(this.getFuelQuantity()-fuelNeeded);
        DecimalFormat formatter = new DecimalFormat("##.##");
        return String.format("%s travelled %s km",this.getClass().getSimpleName(),formatter.format(distance));

    }

    @Override
    public void refuel(double litters) {
        if(litters <= 0) {
            throw  new IllegalArgumentException("Fuel must be a positive number");
        }
       double newFelQuantity = this.fuelQuantity+litters;
        if (newFelQuantity>this.tankCapacity){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }

        this.fuelQuantity+=litters;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f",this.getClass().getSimpleName(),this.fuelQuantity);
    }
}
