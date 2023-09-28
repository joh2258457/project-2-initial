package com.csc205.project2;

public class Cone extends Shape {

    private double radius;
    private double height;

    public Cone() {
        this.radius = 0;
        this.height = 0;
    }

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double surfaceArea() {
        return (Math.PI * this.radius) * (this.radius + (Math.sqrt((Math.pow(this.height, 2)) + (Math.pow(this.radius, 2)))));
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(this.radius, 2) * (this.height/3.0);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cone {");
        sb.append("radius=").append(radius);
        sb.append(", height=").append(height);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
