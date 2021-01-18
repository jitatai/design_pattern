package com.jt.design_pattern.behavioral.observer;

import org.junit.jupiter.api.Test;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/18 9:50
 */
public class ObserverTest {
    @Test
    public void observerTest(){
        BellEventListener listener1 = new TeacherListener();
        BellEventListener listener2 = new StudentListener();
        BellEventSource source = new BellEventSource();
        source.addBellEventListener(listener1);
        source.addBellEventListener(listener2);
        source.ring(true);
        source.ring(false);
    }
}
