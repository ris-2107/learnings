package com.ris.learnings.designpatterns.DecoratorPattern;

import com.ris.learnings.designpatterns.DecoratorPattern.Decorators.ExtraCheese;
import com.ris.learnings.designpatterns.DecoratorPattern.Decorators.Mushroom;
import com.ris.learnings.designpatterns.DecoratorPattern.Pizzas.BasePizza;
import com.ris.learnings.designpatterns.DecoratorPattern.Pizzas.Margherita;

public class Runner {
    public static void main(String[] args) {
        BasePizza margherita = new Margherita();
        BasePizza margheritaWithExtraCheese = new ExtraCheese(margherita);
        BasePizza margheritaWithExtraCheeseWithMushroom = new Mushroom(margheritaWithExtraCheese);

        System.out.println(margheritaWithExtraCheese.getClass().getName() + "'s cost is : " + margheritaWithExtraCheese.cost());
        System.out.println("MargheritaWithExtraCheeseWithMushroom's cost is : " + margheritaWithExtraCheeseWithMushroom.cost());
    }
}
