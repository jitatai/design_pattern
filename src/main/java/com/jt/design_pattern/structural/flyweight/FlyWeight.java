package com.jt.design_pattern.structural.flyweight;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/14 14:03
 */
public interface FlyWeight {
    String operation(UnSharedConcreteFlyWeight state);
}
