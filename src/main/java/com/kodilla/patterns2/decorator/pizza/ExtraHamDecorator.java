package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraHamDecorator extends AbstractPizzaOrderDecorator {

    public ExtraHamDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getAddition() {
        return super.getAddition() + "\n\twith extra ham";

    }
}
