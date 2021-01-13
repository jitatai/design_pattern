package com.jt.design_pattern.structural.bridge.bridgeandadapter;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/13 11:19
 */
public abstract class Abstraction {
    protected Implementor implementor;
    protected Abstraction(Implementor implementor){
        this.implementor = implementor;
    }
    public abstract void Operation();
}
