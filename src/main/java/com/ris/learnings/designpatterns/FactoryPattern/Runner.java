package com.ris.learnings.designpatterns.FactoryPattern;

import com.ris.learnings.designpatterns.FactoryPattern.Factory.ShapeFactory;
import com.ris.learnings.designpatterns.FactoryPattern.Shapes.IShape;

public class Runner {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        IShape shape = factory.getShape("CIRCLE");
        shape.draw();

        IShape _shape = factory.getShape("RECTANGLE");
        _shape.draw();
    }
}