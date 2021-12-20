package com.kodilla.patterns2.aop.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class CalculatorTestSuite {

    private final static Logger LOGGER = LoggerFactory.getLogger(CalculatorTestSuite.class);

    @Autowired
    private Calculator calculator;

    @Test
    void testAdd() {
        //Given
        //When
        double result = calculator.add(15, 10);
        //Then
        LOGGER.info("Testing add method");
        Assertions.assertEquals(25, result, 0);
    }

    @Test
    void testSub() {
        //Given
        //When
        double result = calculator.sub(15, 10);
        //Then
        LOGGER.info("Testing sub method");
        Assertions.assertEquals(5, result, 0);
    }

    @Test
    void testMul() {
        //Given
        //When
        double result = calculator.mul(15, 10);
        //Then
        LOGGER.info("Testing mul method");
        Assertions.assertEquals(150, result, 0);
    }

    @Test
    void testDiv() {
        //Given
        //When
        double result = calculator.div(15, 3);
        //Then
        LOGGER.info("Testing div method");
        Assertions.assertEquals(5, result, 0);
    }

    @Test
    void testFactorial() {
        //Given
        //When
        BigDecimal result = calculator.factorial(new BigDecimal("1000"));
        //Then
        LOGGER.info("Testing factorial method");
        Assertions.assertTrue(BigDecimal.ONE.compareTo(result) < 0);
    }

}
