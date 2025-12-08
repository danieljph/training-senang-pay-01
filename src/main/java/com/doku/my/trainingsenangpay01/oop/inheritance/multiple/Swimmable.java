package com.doku.my.trainingsenangpay01.oop.inheritance.multiple;

/**
 * @author Daniel Joi Partogi Hutapea
 */
public interface Swimmable
{
    default void swim()
    {
        System.out.println("Swimming...");
    }

    default void move()
    {
        System.out.println("Moving using Swimmable...");
    }
}
