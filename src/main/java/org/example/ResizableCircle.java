package org.example;

public class ResizableCircle extends Circle implements IResizable{
    @Override
    public void resize(int percent) {
        this.radius *= percent / 100;
      }
    public void ResizableCircle(double radius){
           this.radius = radius;
    }


}
