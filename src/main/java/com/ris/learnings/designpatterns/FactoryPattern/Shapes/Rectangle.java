package com.ris.learnings.designpatterns.FactoryPattern.Shapes;

public class Rectangle implements IShape {
    @Override
    public void draw() {
        System.out.println("RECTANGLE Drawn");
    }
}
