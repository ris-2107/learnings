package com.ris.learnings.designpatterns.DecoratorPattern.Decorators;

import com.ris.learnings.designpatterns.DecoratorPattern.Pizzas.BasePizza;

// This class extends BasePizza as well:
public abstract class BaseToppingDecorator extends BasePizza {
    public abstract int cost();

}