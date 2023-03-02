package org.example;

public class ResizableRectangle extends Rectangle implements IResizable{
    @Override
    public void resize(int percent) {
        setWidthLength(percent);

    }
    public ResizableRectangle(double width , double length){
       setWidthLength(width ,length);
    }

}

