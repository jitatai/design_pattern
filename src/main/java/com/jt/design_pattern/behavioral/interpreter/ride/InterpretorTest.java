package com.jt.design_pattern.behavioral.interpreter.ride;

import org.junit.jupiter.api.Test;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/22 16:36
 */
public class InterpretorTest {
    @Test
    public void interpretorTest(){
        Context bus = new Context();
        bus.ride("韶关的老人");
        bus.ride("韶关的年轻人");
        bus.ride("广州的妇女");
        bus.ride("广州的儿童");
        bus.ride("山东的儿童");
    }
}
