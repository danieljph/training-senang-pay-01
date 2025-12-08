package com.doku.my.trainingsenangpay01.util;

/**
 * @author Daniel Joi Partogi Hutapea
 */
public class CommonUtils
{
    private CommonUtils()
    {
    }

    public static void sleep(long millis)
    {
        try
        {
            Thread.sleep(millis);
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace(System.err);
        }
    }
}
