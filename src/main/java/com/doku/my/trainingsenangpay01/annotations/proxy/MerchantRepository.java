package com.doku.my.trainingsenangpay01.annotations.proxy;

/**
 * @author Daniel Joi Partogi Hutapea
 */
@Table("merchant")
public interface MerchantRepository
{
    void findByClient_IdAndStatus(String clientId, String status);
}
