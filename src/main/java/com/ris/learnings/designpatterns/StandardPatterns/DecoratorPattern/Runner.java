package com.ris.learnings.designpatterns.StandardPatterns.DecoratorPattern;

import com.ris.learnings.designpatterns.StandardPatterns.DecoratorPattern.Decorators.ExtraCheese;
import com.ris.learnings.designpatterns.StandardPatterns.DecoratorPattern.Decorators.Mushroom;
import com.ris.learnings.designpatterns.StandardPatterns.DecoratorPattern.Pizzas.BasePizza;
import com.ris.learnings.designpatterns.StandardPatterns.DecoratorPattern.Pizzas.Margherita;

public class Runner {
    public static void main(String[] args) {
        BasePizza baseMargherita = new Margherita();
        BasePizza margheritaWithExtraCheese = new ExtraCheese(baseMargherita);
        BasePizza margheritaWithExtraCheeseWithMushroom = new Mushroom(margheritaWithExtraCheese);

        System.out.println("margheritaWithExtraCheese's cost is : " + margheritaWithExtraCheese.cost());
        System.out.println("MargheritaWithExtraCheeseWithMushroom's cost is : " + margheritaWithExtraCheeseWithMushroom.cost());
    }
}
