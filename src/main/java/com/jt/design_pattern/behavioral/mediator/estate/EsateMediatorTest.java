package com.jt.design_pattern.behavioral.mediator.estate;

import org.junit.jupiter.api.Test;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/20 11:24
 */
public class EsateMediatorTest {
    @Test
    public void esateMediatorTest(){
        Mediator mediator = new EstateMediator();

        Seller seller = new Seller("高富帅");
        Buyer buyer = new Buyer("打工人");
        mediator.register(seller);
        mediator.register(buyer);


    }

    public static void main(String[] args) {
        Mediator mediator = new EstateMediator();

        Seller seller = new Seller("高富帅");
        Buyer buyer = new Buyer("打工人");
        mediator.register(seller);
        mediator.register(buyer);
    }
}
