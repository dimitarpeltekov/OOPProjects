package Polymorphism.vehicles;

import java.text.DecimalFormat;

public abstract class VehicleImpl implements Vehicle{
    private double fuelQuantity;
    private double fuelConsumption;

    public VehicleImpl(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.setFuelConsumption(fuelConsumption);
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
            return String.format("%s needs refueling",this.getClass().getName()) ;
        }
        this.setFuelQuantity(this.getFuelQuantity()-fuelNeeded);
        DecimalFormat formatter = new DecimalFormat("##.##");
        return String.format("%s travelled %s km",this.getClass().getName(),formatter.format(distance));

    }

    @Override
    public void refuel(double litters) {
       setFuelQuantity(getFuelQuantity()+litters);
    }
}
