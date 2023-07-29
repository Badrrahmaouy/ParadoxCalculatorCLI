package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testCorrectInput() {
        String input = "2 + 3";
        String expectedOutput = "2 + 3 = 5";
        String actualOutput = App.processInput(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testInvalidInput() {
        String input = "2 + +";
        String expectedOutput = "Invalid input";
        String actualOutput = App.processInput(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testInvalidInputLetter() {
        String input = "2 + a";
        String expectedOutput = "Invalid input";
        String actualOutput = App.processInput(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testInvalidInputMissingParentheses() {
        String input = "(2 + 3 * (3)";
        String expectedOutput = "Invalid input";
        String actualOutput = App.processInput(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testFormattedOutput() {
        String input = "2 + 3";
        String expectedOutput = "2 + 3 = 5";
        String actualOutput = App.processInput(input);
        assertEquals(expectedOutput, actualOutput);
    }
}
