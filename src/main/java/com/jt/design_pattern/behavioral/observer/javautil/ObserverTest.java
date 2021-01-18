package com.jt.design_pattern.behavioral.observer.javautil;

import org.junit.jupiter.api.Test;

import java.util.Observer;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/18 10:07
 */
public class ObserverTest {
    @Test
    public void observerTest(){
        OilFutures oilFutures = new OilFutures();
        Observer observer1 = new Bull();
        Observer observer2 = new Bear();
        oilFutures.addObserver(observer1);
        oilFutures.addObserver(observer2);
        oilFutures.setPrice(10);
        oilFutures.setPrice(-1);
    }
}
