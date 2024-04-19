package com.ris.learnings.designpatterns.DecoratorPattern.Decorators;

import com.ris.learnings.designpatterns.DecoratorPattern.Pizzas.BasePizza;

public class Mushroom extends BaseToppingDecorator {
    private final int MUSHROOM_COST = 50;
    private final BasePizza pizza;

    public Mushroom(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + MUSHROOM_COST;
    }
}
