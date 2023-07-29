package com.mycompany.app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un'operazione matematica: ");
        String input = scanner.nextLine();
        String output = processInput(input);
        System.out.println(output);
    }
    public static String processInput(String input) {
        Calculator calculator = new Calculator();
        String result = calculator.parseExpression(input);

        if (result.equals("ERROR")) {
            return "Invalid input";
        } else {
            return input + " = " + calculator.parseExpression(input);
        }

    }
}
