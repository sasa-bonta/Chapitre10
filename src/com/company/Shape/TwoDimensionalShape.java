package com.company.Shape;

public abstract class TwoDimensionalShape extends Shape {
    double characteristiOfShape;

    public TwoDimensionalShape(double characteristiOfShape) {
        super(characteristiOfShape);
    }

    @Override
    public double getCharacteristiOfShape() {
        return characteristiOfShape;
    }

    @Override
    public void setCharacteristiOfShape(double characteristiOfShape) {
        this.characteristiOfShape = characteristiOfShape;
    }

    @Override
    public abstract double getAria();

    @Override
    public String toString() {
        return "TwoDimensionalShape{" +
                "characteristiOfShape=" + characteristiOfShape +
                '}';
    }
}
