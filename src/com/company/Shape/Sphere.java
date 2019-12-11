package com.company.Shape;

public class Sphere extends ThreeDimensionalShape {
    private double rase;

    public Sphere(double rase) {
        super(rase);
    }

    public double getRase() {
        return rase;
    }

    public void setRase(double rase) {
        this.rase = rase;
    }

    @Override
    public double getAria() {
        return 4 * Math.PI * Math.pow(rase, 2);
    }

    @Override
    public double getVolume() {
        return (4 / 3) * Math.PI * Math.pow(rase, 3);
    }

    @Override
    public String toString() {
        return "Sphere{" +
                " rase=" + rase +
                " aria=" + getAria() +
                " volume=" + getVolume() +
                '}';
    }
}
