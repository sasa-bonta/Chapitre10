package com.company.Shape;

public class Tetrahedron extends ThreeDimensionalShape {
    public double side;

    public Tetrahedron(double side) {
        super(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getAria() {
        return (Math.sqrt(3) / 4) * Math.pow(side, 2) * 4;
    }

    @Override
    public double getVolume() {
        return (Math.sqrt(2) * Math.pow(side, 3)) / 12;
    }

    @Override
    public String toString() {
        return "Tetrahedron{" +
                " side=" + side +
                " aria=" + getAria() +
                " volume=" + getVolume() +
                '}';
    }
}
