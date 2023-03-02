package org.example;

public class ResizableCircle extends Circle implements IResizable{
    @Override
    public void resize(int percent) {
        setRadius(percent);
      }
    public void ResizableCircle(double radius){
           setRadius(radius);
    }


}
