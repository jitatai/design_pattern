package com.jt.design_pattern.structural.facade;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/14 11:18
 */
public class ConcreteFacade2 extends AbstractFacade {
    private System1 system1 = new System1();
    private System3 system3 = new System3();

    @Override
    public void m() {
        system1.m1();
        system3.m3();
    }
}
