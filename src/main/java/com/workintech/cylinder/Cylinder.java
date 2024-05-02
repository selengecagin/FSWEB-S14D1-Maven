package com.workintech.cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(int radius, double height) {
        super(radius);
        this.height = height < 0 ? 0 : height;
    }
    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return super.getArea()*getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
}
