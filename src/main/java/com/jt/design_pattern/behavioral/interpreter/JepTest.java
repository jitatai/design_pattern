package com.jt.design_pattern.behavioral.interpreter;

import org.nfunk.jep.JEP;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/22 16:56
 */
public class JepTest {
    public static void main(String[] args) {
        JEP jep = new JEP();
        String 本金利息 = "本金*年份*利率";
        jep.addVariable("本金",10000);
        jep.addVariable("利率",0.05);
        jep.addVariable("年份",5);
        jep.parseExpression(本金利息);
        Object valueAsObject = jep.getValueAsObject();
        System.out.println(valueAsObject);
    }
}
