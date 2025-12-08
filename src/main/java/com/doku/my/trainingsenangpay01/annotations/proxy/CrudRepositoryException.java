package com.doku.my.trainingsenangpay01.annotations.proxy;

/**
 * @author Daniel Joi Partogi Hutapea
 */
public class CrudRepositoryException extends RuntimeException
{
    public CrudRepositoryException()
    {
    }

    public CrudRepositoryException(String message)
    {
        super(message);
    }
}
