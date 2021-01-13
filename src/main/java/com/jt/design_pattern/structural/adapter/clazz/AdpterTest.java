package com.jt.design_pattern.structural.adapter.clazz;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/13 9:52
 */
public class AdpterTest {
    public static void main(String[] args) {
        Target target = new Adpter();
        target.request();
    }
}
