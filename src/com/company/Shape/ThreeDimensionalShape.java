package com.company.Shape;

public abstract class ThreeDimensionalShape extends Shape {
    double characteristiOfShape;

    public ThreeDimensionalShape(double characteristiOfShape) {
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

    public abstract double getVolume();

    @Override
    public String toString() {
        return "ThreeDimensionalShape{" +
                "characteristiOfShape=" + characteristiOfShape +
                '}';
    }
}
