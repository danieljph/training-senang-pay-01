package com.doku.my.trainingsenangpay01.annotations.proxy;

/**
 * @author Daniel Joi Partogi Hutapea
 */
@Table("person")
public interface PersonRepository
{
    void findByName(String name);
}
