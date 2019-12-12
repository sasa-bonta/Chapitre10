package com.company.CarbonFootprint;

public class Car implements CarbonFootprint {
    private String model;
    private String fuel;
    private double fuelConsumtion;
    private int mileage;

    public final double benzinCO2 = 0.008887 * 3.7854;
    public final double diezelCO2 = 0.010180 * 3.7854;
    public final double electricityCO2 = 0.000707; // m^3 CO2 / KWh

    public Car(String model, String fuel, double fuelConsumtion, int mileage) {
        this.model = model;
        this.fuel = fuel;
        this.fuelConsumtion = fuelConsumtion;
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public double getFuelConsumtion() {
        return fuelConsumtion;
    }

    public void setFuelConsumtion(double fuelConsumtion) {
        this.fuelConsumtion = fuelConsumtion;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public double carbonEmission() {
        double emission = 0;
        if (fuel == "benzin") {
            emission = benzinCO2 * fuelConsumtion * mileage / 100;
        }

        if (fuel == "diesel") {
            emission = diezelCO2 * fuelConsumtion * mileage / 100;
        }

        if (fuel == "gas") {
            emission = electricityCO2 * fuelConsumtion * mileage / 100;
        }

        return emission;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", fuel='" + fuel + '\'' +
                ", fuelConsumtion=" + fuelConsumtion +
                ", mileage=" + mileage +
                ", benzinCO2=" + benzinCO2 +
                ", diezelCO2=" + diezelCO2 +
                ", electricityCO2=" + electricityCO2 +
                '}';
    }
}
