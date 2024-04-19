package com.ris.learnings.designpatterns.DecoratorPattern.Decorators;

import com.ris.learnings.designpatterns.DecoratorPattern.Pizzas.BasePizza;

public class ExtraCheese extends BaseToppingDecorator {
    private final int EXTRA_CHEESE_COST = 10;
    BasePizza pizza;

    public ExtraCheese(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + EXTRA_CHEESE_COST;
    }
}
