package com.jt.design_pattern.behavioral.templete;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/15 9:31
 */
public class ConcreteTempleteMethod extends TempleteMethod {
    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法1的实现被调用...");
    }



    @Override
    public void hookMethod1() {
        System.out.println("钩子方法1被重写...");
    }

    @Override
    public boolean hookMehtod2() {
        return true;
    }
}
