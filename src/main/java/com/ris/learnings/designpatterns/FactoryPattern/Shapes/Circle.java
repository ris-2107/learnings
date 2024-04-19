package com.ris.learnings.designpatterns.FactoryPattern.Shapes;

public class Circle implements IShape {
    @Override
    public void draw() {
        System.out.println("CIRCLE drawn");
    }
}
