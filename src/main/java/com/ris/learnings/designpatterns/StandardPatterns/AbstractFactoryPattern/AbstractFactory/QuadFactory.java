package com.ris.learnings.designpatterns.StandardPatterns.AbstractFactoryPattern.AbstractFactory;

import com.ris.learnings.designpatterns.StandardPatterns.AbstractFactoryPattern.Shapes.IShape;
import com.ris.learnings.designpatterns.StandardPatterns.AbstractFactoryPattern.Shapes.Rectangle;
import com.ris.learnings.designpatterns.StandardPatterns.AbstractFactoryPattern.Shapes.SQUARE;

public class QuadFactory implements IShapeFactory {
    @Override
    public IShape getShape(String str) {
        if (str.length() > 2) return new Rectangle();
        else return new SQUARE();
    }
}
