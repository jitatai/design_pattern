package com.jt.design_pattern.structural.facade;

import org.junit.jupiter.api.Test;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/14 10:55
 */
public class FacadeTest {
    @Test
    public void facadeTest(){
        Facade facade = new Facade();
        facade.m();
    }

    @Test
    public void abstractFacadeTest(){
        AbstractFacade abstractFacade = new ConcreteFacade1();
        abstractFacade.m();

        abstractFacade = new ConcreteFacade2();
        abstractFacade.m();

    }
}
