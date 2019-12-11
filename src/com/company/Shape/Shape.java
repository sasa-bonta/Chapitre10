package com.company.Shape;

public abstract class Shape {
    double characteristiOfShape;

    public Shape(double characteristiOfShape) {
        this.characteristiOfShape = characteristiOfShape;
    }

    public double getCharacteristiOfShape() {
        return characteristiOfShape;
    }

    public void setCharacteristiOfShape(double characteristiOfShape) {
        this.characteristiOfShape = characteristiOfShape;
    }

    public abstract double getAria();

    @Override
    public String toString() {
        return "Shape{" +
                "characteristiOfShape=" + characteristiOfShape +
                '}';
    }
}
