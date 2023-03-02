package org.example;


public class Rectangle extends GeometricOblect {

    protected double width = 1.0;
    protected double length = 1.0;

    public void Rectangle(double width , double length){
        this.width = width;
        this.length = length;
    }

      @Override
    public double getPerimeter(){
        return width * 2 + length * 2;
    }
    @Override

    public double getArea(){
        return width * length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

}
