package org.example;

import org.example.core.Shape;
import org.example.core.ShapePrinter;
import org.example.shapes.*;

// Test app
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        Shape ellipse = new Ellipse();
        Shape line = new Line();

        ShapePrinter shapePrinter = new ShapePrinter();
        shapePrinter.printShapeName(circle);
        shapePrinter.printShapeName(rectangle);
        shapePrinter.printShapeName(triangle);
        shapePrinter.printShapeName(ellipse);
        shapePrinter.printShapeName(line);
    }
}
