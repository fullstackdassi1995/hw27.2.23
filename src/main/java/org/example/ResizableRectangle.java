package org.example;

public class ResizableRectangle extends Rectangle implements IResizable{
    @Override
    public void resize(int percent) {
        this.width *= percent / 100;
        this.length *= percent /100;

    }
    public ResizableRectangle(double width , double length){
        this.length = length;
        this.width = width;
    }

}

