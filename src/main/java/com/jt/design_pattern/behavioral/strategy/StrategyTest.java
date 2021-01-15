package com.jt.design_pattern.behavioral.strategy;

import org.junit.jupiter.api.Test;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/15 9:47
 */
public class StrategyTest {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void strategyMehod(){
        strategy.strategyMehtod();
    }

    @Test
    public void strategyTest(){
        StrategyTest test = new StrategyTest();
        test.setStrategy(new ConcreteStrategy1());
        test.strategyMehod();
        test.setStrategy(new ConcreteStrategy2());
        test.strategyMehod();
    }
}
