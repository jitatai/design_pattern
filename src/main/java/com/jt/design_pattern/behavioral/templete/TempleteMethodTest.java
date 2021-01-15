package com.jt.design_pattern.behavioral.templete;

import org.junit.jupiter.api.Test;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/15 9:33
 */
public class TempleteMethodTest {
    @Test
    public void templeteMethodTest(){
        TempleteMethod templeteMethod = new ConcreteTempleteMethod();
        templeteMethod.templeteMethod();
    }
}
