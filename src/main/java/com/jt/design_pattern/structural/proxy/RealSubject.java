package com.jt.design_pattern.structural.proxy;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/11 15:01
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("访问真实主题方法...");
    }
}
