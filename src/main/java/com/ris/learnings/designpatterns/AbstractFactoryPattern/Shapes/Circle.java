package com.ris.learnings.designpatterns.AbstractFactoryPattern.Shapes;

public class Circle implements IShape {
    @Override
    public void draw() {
        System.out.println("CIRCLE Implemented");
    }
}
