package com.ris.learnings.designpatterns.StandardPatterns.AbstractFactoryPattern.Shapes;

public class Circle implements IShape {
    @Override
    public void draw() {
        System.out.println("CIRCLE Implemented");
    }
}
