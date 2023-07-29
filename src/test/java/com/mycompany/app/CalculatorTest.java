package com.mycompany.app;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        double result = calculator.add(2.0, 3.0);
        assertEquals(5.0, result);
    }

    @Test
    public void testParserWithIntegerExpression() {
        Calculator calculator = new Calculator();
        String result = calculator.parseExpression("2 + 3");
        assertEquals("5", result);
    }

    @Test
    public void testParserWithDecimalExpression() {
        Calculator calculator = new Calculator();
        String result = calculator.parseExpression("2.5 + 3.5");
        assertEquals("6", result);
    }

    @Test
    public void testParserWithMultipleOperators() {
        Calculator calculator = new Calculator();
        String result = calculator.parseExpression("2 + 3 * 4 - 5 / 2");
        assertEquals("11.5", result);
    }

    @Test
    public void testParserWithExponentialExpression() {
        Calculator calculator = new Calculator();
        String result = calculator.parseExpression("3 ^ 4");
        assertEquals("81", result);
    }

    @Test
    public void testParserWithParentheses() {
        Calculator calculator = new Calculator();
        String result = calculator.parseExpression("(2 ^ 3) * 4");
        assertEquals("32", result);
    }

    @Test
    public void testParserWithNestedParentheses() {
        Calculator calculator = new Calculator();
        String result = calculator.parseExpression("((2.7 + 3.3) * 4.4) / 2.7");
        assertEquals("9.777777777777779", result);
    }

    @Test
    public void testParserWithMissingParentheses() {
        Calculator calculator = new Calculator();
        String result = calculator.parseExpression("(2 ^ 3 * 4");
        assertEquals("ERROR", result);
    }
}