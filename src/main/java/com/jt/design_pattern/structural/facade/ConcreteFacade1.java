package com.jt.design_pattern.structural.facade;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/14 11:18
 */
public class ConcreteFacade1 extends AbstractFacade {
    private System1 system1 = new System1();
    private System2 system2 = new System2();

    @Override
    public void m() {
        system1.m1();
        system2.m2();
    }
}
