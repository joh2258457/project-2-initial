package com.csc205.project2;

public class Cube extends Shape {
    private double width;

    public Cube() {
        this.width = 0;
    }

    public Cube(double n){
        this.width = n;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double surfaceArea() {
        return 6 * Math.pow(this.width, 2);
    }

    @Override
    public double volume() {
        return Math.pow(this.width, 3);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cube {");
        sb.append("width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
