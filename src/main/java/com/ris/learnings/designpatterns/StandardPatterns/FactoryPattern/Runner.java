package com.ris.learnings.designpatterns.StandardPatterns.FactoryPattern;

import com.ris.learnings.designpatterns.StandardPatterns.FactoryPattern.Factory.ShapeFactory;
import com.ris.learnings.designpatterns.StandardPatterns.FactoryPattern.Shapes.IShape;

public class Runner {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        IShape shape = factory.getShape("CIRCLE");
        shape.draw();

        IShape _shape = factory.getShape("RECTANGLE");
        _shape.draw();
    }
}