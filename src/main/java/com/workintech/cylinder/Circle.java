package com.workintech.cylinder;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius < 0 ? 0 : radius;
    }

    public int getRadius() {
        return radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}