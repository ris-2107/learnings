package com.ris.learnings.designpatterns.StandardPatterns.AbstractFactoryPattern.AbstractFactory;


import com.ris.learnings.designpatterns.StandardPatterns.AbstractFactoryPattern.Shapes.Circle;
import com.ris.learnings.designpatterns.StandardPatterns.AbstractFactoryPattern.Shapes.IShape;
import com.ris.learnings.designpatterns.StandardPatterns.AbstractFactoryPattern.Shapes.Triangle;

public class NonQuadFactory implements IShapeFactory {
    @Override
    public IShape getShape(String str) {
        if (str.length() > 2) return new Triangle();
        else return new Circle();
    }
}