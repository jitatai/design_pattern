package com.jt.design_pattern.structural.adapter.clazz;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/13 9:51
 */
public class Adpter extends Adptee implements Target {

    @Override
    public void request() {
        specificRequest();
    }
}
