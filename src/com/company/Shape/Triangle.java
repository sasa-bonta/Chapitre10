package com.company.Shape;

public class Triangle extends TwoDimensionalShape {
    public double side;

    public Triangle(double side) {
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
        return (Math.sqrt(3) / 4) * Math.pow(side, 2);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                " side=" + side +
                " aria=" + getAria() +
                '}';
    }
}
