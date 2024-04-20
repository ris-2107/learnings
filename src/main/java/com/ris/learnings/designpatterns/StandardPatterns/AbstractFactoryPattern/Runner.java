package com.ris.learnings.designpatterns.StandardPatterns.AbstractFactoryPattern;

import com.ris.learnings.designpatterns.StandardPatterns.AbstractFactoryPattern.AbstractFactory.IShapeFactory;
import com.ris.learnings.designpatterns.StandardPatterns.AbstractFactoryPattern.AbstractFactory.NonQuadFactory;
import com.ris.learnings.designpatterns.StandardPatterns.AbstractFactoryPattern.AbstractFactory.QuadFactory;
import com.ris.learnings.designpatterns.StandardPatterns.AbstractFactoryPattern.Shapes.IShape;

public class Runner {
    public static void main(String[] ar) {
        IShapeFactory nonQuadFactory = new NonQuadFactory();
        IShapeFactory quadFactory = new QuadFactory();

        IShape shapeNonQuad = nonQuadFactory.getShape("K");
        shapeNonQuad.draw();
        IShape shapeQuad = quadFactory.getShape("Ghpp");
        shapeQuad.draw();

    }
}
