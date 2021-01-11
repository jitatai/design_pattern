package com.jt.design_pattern.structural.proxy.dynamic;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/11 16:34
 */
public class RealSubject implements AbstructSubject {
    @Override
    public void request() {
        System.out.println("访问真实主题方法...");
    }
}
