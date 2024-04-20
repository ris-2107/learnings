package com.ris.practise.designPatterns.FactoryPattern;

import com.ris.practise.designPatterns.FactoryPattern.Factory.ShapeFactory;
import com.ris.practise.designPatterns.FactoryPattern.Shapes.IShape;

public class Runner {
    public static void main(String[] ar) {
        ShapeFactory factory = new ShapeFactory();
        IShape square = factory.getShape("SQ");
        IShape rectangle = factory.getShape("RECT");

        square.draw();
        rectangle.draw();

    }
}
