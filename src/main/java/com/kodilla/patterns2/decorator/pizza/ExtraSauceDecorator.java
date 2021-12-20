package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraSauceDecorator extends AbstractPizzaOrderDecorator {

    public ExtraSauceDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getAddition() {
        return super.getAddition() + "\n\twith extra sauce";
    }
}
