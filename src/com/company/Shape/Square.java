package com.company.Shape;

public class Square extends TwoDimensionalShape {
    public double side;

    public Square(double side) {
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
        return Math.pow(side, 2);
    }

    @Override
    public String toString() {
        return "Square{" +
                " side=" + side +
                " aria=" + getAria() +
                '}';
    }

}
