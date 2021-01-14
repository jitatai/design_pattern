package com.jt.design_pattern.structural.facade;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/14 10:53
 */
public class Facade {
    private System1 system1;
    private System2 system2;

    protected Facade(){
        system1 = new System1();
        system2 = new System2();
    }

    public void m(){
        system1.m1();
        system2.m2();
        System.out.println("外观模式的m方法");
    }
}
