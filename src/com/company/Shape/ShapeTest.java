package com.company.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(10);
        Triangle triangle = new Triangle(7);

        Sphere sphere = new Sphere(10);
        Cube cube = new Cube(15);
        Tetrahedron tetrahedron = new Tetrahedron(20);

        Shape [] figures = new Shape[6];
        figures[0] = circle;
        figures[1] = square;
        figures[2] = triangle;
        figures[3] = sphere;
        figures[4] = cube;
        figures[5] = tetrahedron;

        for (Shape i: figures) {
            System.out.println(i.toString());
        }
    }
}
