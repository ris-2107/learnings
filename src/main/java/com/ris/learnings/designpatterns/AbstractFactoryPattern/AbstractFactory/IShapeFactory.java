package com.ris.learnings.designpatterns.AbstractFactoryPattern.AbstractFactory;

import com.ris.learnings.designpatterns.AbstractFactoryPattern.Shapes.IShape;

public interface IShapeFactory {
    IShape getShape(String str);
}
