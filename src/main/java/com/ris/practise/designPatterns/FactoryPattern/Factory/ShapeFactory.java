package com.ris.practise.designPatterns.FactoryPattern.Factory;

import com.ris.practise.designPatterns.FactoryPattern.Shapes.IShape;
import com.ris.practise.designPatterns.FactoryPattern.Shapes.Rectangle;
import com.ris.practise.designPatterns.FactoryPattern.Shapes.Square;

public class ShapeFactory {
    public IShape getShape(String inp) {
        if (inp == "RECT") return new Rectangle();
        if (inp == "SQ") return new Square();
        return null;
    }

}
