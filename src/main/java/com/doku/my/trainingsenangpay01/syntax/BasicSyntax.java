package com.doku.my.trainingsenangpay01.syntax;

/**
 * @author Daniel Joi Partogi Hutapea
 */
public class BasicSyntax
{
    public static void main(String[] args)
    {
        // Single line comment.

        /*
         * Multi line comment.
         */

        var a = 1;
        int b = 2;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        System.out.println("========================================");

        for(int i=0; i<3; i++)
        {
            System.out.println("for-loop: " + i);
        }

        System.out.println("========================================");

        int counter = 0;
        int maxLoop = 3;

        do
        {
            System.out.printf("do-while-loop: %d%n", counter++);
        }
        while(counter < maxLoop);

        System.out.println("========================================");

        counter = 0;

        while(counter < maxLoop)
        {
            System.out.printf("while-loop: %d%n", counter++);
        }

        System.out.println("========================================");
        int input = 42;
        testPrintInput(++input);
        System.out.println("After testPrintInput: " + input);
        System.out.println("========================================");
        testPrintInput(input++);
        System.out.println("After testPrintInput: " + input);
        System.out.println("========================================");

        boolean isValid = true;

        if(isValid)
        {
            System.out.println("VALID");
        }
        else
        {
            System.out.println("INVALID");
        }
    }

    public static void testPrintInput(int input)
    {
        System.out.println("testInput: " + input);
    }
}
