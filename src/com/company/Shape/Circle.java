package com.company.Shape;

public class Circle extends TwoDimensionalShape {
    public double rase;

    public Circle(double rase) {
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
        return Math.PI * Math.pow(rase, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                " rase=" + rase +
                " aria=" + getAria() +
                '}';
    }
}
