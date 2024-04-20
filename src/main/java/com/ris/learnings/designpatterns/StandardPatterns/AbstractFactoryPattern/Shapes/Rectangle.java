package com.ris.learnings.designpatterns.StandardPatterns.AbstractFactoryPattern.Shapes;

public class Rectangle implements IShape {

    @Override
    public void draw() {
        System.out.println("RECTANGLE DRAWN");
    }
}
