package com.ris.learnings.designpatterns.StandardPatterns.FactoryPattern.Factory;

import com.ris.learnings.designpatterns.StandardPatterns.FactoryPattern.Shapes.Circle;
import com.ris.learnings.designpatterns.StandardPatterns.FactoryPattern.Shapes.IShape;
import com.ris.learnings.designpatterns.StandardPatterns.FactoryPattern.Shapes.Rectangle;

public class ShapeFactory {
    public IShape getShape(String input) {
        switch (input) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }
    }
}
