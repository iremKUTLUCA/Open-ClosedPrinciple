package com.irem.OpenClosed.shape;

public class Rectangle implements Shape{
    private double lenght;
    private double height;

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (lenght*height);
    }
}
