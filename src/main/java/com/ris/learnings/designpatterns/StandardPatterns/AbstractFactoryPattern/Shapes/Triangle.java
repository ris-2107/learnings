package com.ris.learnings.designpatterns.StandardPatterns.AbstractFactoryPattern.Shapes;

public class Triangle implements IShape {
    @Override
    public void draw() {
        System.out.println("Triangle Implemented");
    }
}
