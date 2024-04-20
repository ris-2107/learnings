package com.ris.learnings.designpatterns.StandardPatterns.FactoryPattern.Shapes;

public class Circle implements IShape {
    @Override
    public void draw() {
        System.out.println("CIRCLE drawn");
    }
}
