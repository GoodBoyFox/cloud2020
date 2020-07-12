package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author Ywj
 * @version 1.0
 * @date 2020/7/3 9:23
 */
@Component
public class PaymentFallbackService implements  PaymentHystrixService{
    @Override
    public String paymentInfo_ok(Integer id) {

        return "------PaymentFallbackService fall back o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_timeout(Integer id) {

        return "------PaymentFallbackService fall back o(╥﹏╥)o";
    }
}
