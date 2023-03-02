package org.example;

import lombok.Getter;
import lombok.Setter;

public class Rectangle extends GeometricOblect {
    @Getter

    private double width = 1.0;
    @Getter

    private double length = 1.0;

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

    public void setWidthLength(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public void setWidthLength(int percent) {
        this.width *= percent / 100;
        this.length *= percent / 100;
    }

}
