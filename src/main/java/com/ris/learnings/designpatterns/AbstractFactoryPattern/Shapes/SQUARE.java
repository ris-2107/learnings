package com.ris.learnings.designpatterns.AbstractFactoryPattern.Shapes;

public class SQUARE implements IShape {
    @Override
    public void draw() {
        System.out.println("SQUARE Drawn");
    }
}
