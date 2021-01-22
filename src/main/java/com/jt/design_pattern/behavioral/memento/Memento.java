package com.jt.design_pattern.behavioral.memento;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/22 11:17
 */
public class Memento {
    private String state;
    Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
