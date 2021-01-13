package com.jt.design_pattern.structural.bridge.bridgeandadapter;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/13 11:18
 */
public class ConcreteImplementor implements Implementor {
    @Override
    public void OperationImpl() {
        System.out.println("具体实现化(Concrete Implementor)角色被访问");
    }
}
