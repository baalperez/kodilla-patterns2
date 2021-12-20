package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal("15"), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetAddition() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //When
        String addition = pizzaOrder.getAddition();

        //Then
        assertEquals("Standard pizza", addition);
    }

    @Test
    public void testBasicPizzaOrderWithAllAdditionsGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new ExtraHamDecorator(pizzaOrder);
        pizzaOrder = new ExtraMushroomsDecorator(pizzaOrder);
        pizzaOrder = new ExtraSauceDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getCost());

        //When
        BigDecimal theCost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(32), theCost);
    }

    @Test
    public void testBasicPizzaOrderWithAllAdditionsGetAddition() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new ExtraHamDecorator(pizzaOrder);
        pizzaOrder = new ExtraMushroomsDecorator(pizzaOrder);
        pizzaOrder = new ExtraSauceDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getAddition());

        //When
        String addition = pizzaOrder.getAddition();

        //Then
        assertEquals("""
                Standard pizza
                \twith extra cheese
                \twith extra ham
                \twith extra mushrooms
                \twith extra sauce""", addition);
    }
}
