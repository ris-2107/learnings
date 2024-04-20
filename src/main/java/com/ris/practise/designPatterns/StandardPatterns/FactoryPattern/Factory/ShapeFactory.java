package com.ris.practise.designPatterns.StandardPatterns.FactoryPattern.Factory;

import com.ris.practise.designPatterns.StandardPatterns.FactoryPattern.Shapes.IShape;
import com.ris.practise.designPatterns.StandardPatterns.FactoryPattern.Shapes.Rectangle;
import com.ris.practise.designPatterns.StandardPatterns.FactoryPattern.Shapes.Square;

public class ShapeFactory {
    public IShape getShape(String inp) {
        if (inp == "RECT") return new Rectangle();
        if (inp == "SQ") return new Square();
        return null;
    }

}
