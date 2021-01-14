package com.jt.design_pattern.structural.flyweight;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;

import static org.mockito.Mockito.spy;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/14 14:27
 */
public class FlyWeightTest {

    FlyWeightFactory flyWeightFactory = new FlyWeightFactory();

    @Test
    public void flyWeightTest(){
        FlyWeight flyWeight = Mockito.mock(ConcreteFlyWeight.class);

        FlyWeight flyWeight1 = flyWeightFactory.getFlyWeight("a");
        FlyWeight flyWeight2 = flyWeightFactory.getFlyWeight("a");
        FlyWeight flyWeight3 = flyWeightFactory.getFlyWeight("a");
        FlyWeight flyWeight4 = flyWeightFactory.getFlyWeight("b");
        FlyWeight flyWeight5 = flyWeightFactory.getFlyWeight("b");

        UnSharedConcreteFlyWeight a = new UnSharedConcreteFlyWeight("第1次调用a");
        Mockito.when(flyWeight.operation(a)).thenReturn("aa");
        System.out.println(flyWeight.operation(a));

        flyWeight1.operation(new UnSharedConcreteFlyWeight("第1次调用a"));
        flyWeight2.operation(new UnSharedConcreteFlyWeight("第2次调用a"));
        flyWeight3.operation(new UnSharedConcreteFlyWeight("第3次调用a"));
        flyWeight4.operation(new UnSharedConcreteFlyWeight("第1次调用b"));
        flyWeight5.operation(new UnSharedConcreteFlyWeight("第2次调用b"));
    }
}
