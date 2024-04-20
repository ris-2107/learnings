package com.ris.learnings.designpatterns.StandardPatterns.FactoryPattern.Shapes;

public class Rectangle implements IShape {
    @Override
    public void draw() {
        System.out.println("RECTANGLE Drawn");
    }
}
