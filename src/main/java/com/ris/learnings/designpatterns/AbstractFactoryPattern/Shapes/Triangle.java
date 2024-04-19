package com.ris.learnings.designpatterns.AbstractFactoryPattern.Shapes;

public class Triangle implements IShape {
    @Override
    public void draw() {
        System.out.println("Triangle Implemented");
    }
}
