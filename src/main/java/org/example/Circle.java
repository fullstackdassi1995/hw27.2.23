package org.example;



public class Circle extends GeometricOblect{

    protected double radius = 1.0;

    public void Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getPerimeter(){
        return radius * 2 * 3.14;
    }

    @Override
    public double getArea(){
        return radius * radius * 3.14;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }


}
