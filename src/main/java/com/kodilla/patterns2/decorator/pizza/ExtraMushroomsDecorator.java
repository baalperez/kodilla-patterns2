package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraMushroomsDecorator extends AbstractPizzaOrderDecorator {

    public ExtraMushroomsDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getAddition() {
        return super.getAddition() + "\n\twith extra mushrooms";
    }
}
