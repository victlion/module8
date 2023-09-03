package org.example.core;
public class Shape implements shapeInterface {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
       return name;
    }
}
