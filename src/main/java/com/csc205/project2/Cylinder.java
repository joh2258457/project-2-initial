package com.csc205.project2;

public class Cylinder extends Shape{
    private double height;
    private double radius;
    public Cylinder() {
        this.height = 0;
        this.radius = 0;
    }

    public Cylinder(double height, double radius) {
        this.radius = radius;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        return (2 * Math.PI * Math.pow(this.radius, 2) + (2 * Math.PI * this.radius * this.height));
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(this.radius, 2) * this.height;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cylinder {");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
