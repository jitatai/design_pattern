package com.jt.design_pattern.behavioral.state.thread;

import org.junit.jupiter.api.Test;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/15 17:25
 */
public class IStateTest {
    @Test
    public void iStateTest(){
        IContext context = new IContext();
        context.start();
        context.getCPU();
        context.suspend();
        context.resume();
        context.getCPU();
        context.stop();
    }
}
