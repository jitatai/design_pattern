package com.jt.design_pattern.structural.adapter.obj;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/13 9:58
 */
public class AdpterTest {
    public static void main(String[] args) {
        Target target = new Adpter(new Adptee());
        target.request();
    }
}
