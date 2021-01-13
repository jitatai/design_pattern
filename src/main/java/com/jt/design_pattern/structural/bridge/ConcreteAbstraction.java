package com.jt.design_pattern.structural.bridge;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/13 11:20
 */
public class ConcreteAbstraction extends Abstraction {

    public ConcreteAbstraction(Implementor implementor){
        super(implementor);
    }
    @Override
    public void Operation() {
        System.out.println("扩展抽象化(Refined Abstraction)角色被访问");
        implementor.OperationImpl();
    }
}
