package com.company.Shape;

public class Cube extends ThreeDimensionalShape {
    public double side;

    public Cube(double characteristiOfShape, double side) {
        super(characteristiOfShape);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Cube(double characteristiOfShape) {
        super(characteristiOfShape);
    }

    @Override
    public double getAria() {
        return 4 * Math.pow(side, 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public String toString() {
        return "Cube{" +
                " side=" + side +
                " aria=" + getAria() +
                " volume=" + getVolume() +
                '}';
    }
}
