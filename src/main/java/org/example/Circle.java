package org.example;


import lombok.Getter;
import lombok.Setter;

public class Circle extends GeometricOblect{

@Getter
    private double radius = 1.0;

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

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setRadius(int percent) {
        this.radius *= percent / 100;
    }
}
