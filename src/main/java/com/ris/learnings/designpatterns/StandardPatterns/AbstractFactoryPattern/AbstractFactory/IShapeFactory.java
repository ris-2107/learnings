package com.ris.learnings.designpatterns.StandardPatterns.AbstractFactoryPattern.AbstractFactory;

import com.ris.learnings.designpatterns.StandardPatterns.AbstractFactoryPattern.Shapes.IShape;

public interface IShapeFactory {
    IShape getShape(String str);
}
