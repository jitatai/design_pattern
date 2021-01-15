package com.jt.design_pattern.behavioral.chainofresponsibility;

import org.junit.jupiter.api.Test;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/15 14:13
 */
public class HandlerTest {
    @Test
    public void handlerTest(){
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);
        handler1.doFiler(new TwoCommand());
    }
}
