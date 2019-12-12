package com.company.CarbonFootprint;

public class Bicycle implements CarbonFootprint {
    private String model;
    private double weight;
    private double riderWeight;
    private int mileage;

    public final double cyclingCO2 = 0.016; //riding bike / km

    public Bicycle(String model, double weight, double riderWeight, int mileage) {
        this.model = model;
        this.weight = weight;
        this.riderWeight = riderWeight;
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getRiderWeight() {
        return riderWeight;
    }

    public void setRiderWeight(double riderWeight) {
        this.riderWeight = riderWeight;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public double carbonEmission() {
        return (weight / 14) * (riderWeight / 62) * mileage * cyclingCO2;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "model='" + model + '\'' +
                ", weight=" + weight +
                ", riderWeight=" + riderWeight +
                ", mileage=" + mileage +
                ", cyclingCO2=" + cyclingCO2 +
                '}';
    }
}
