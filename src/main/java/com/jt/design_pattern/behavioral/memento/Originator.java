package com.jt.design_pattern.behavioral.memento;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/22 11:19
 */
public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public void reloadMemento(Memento memento){
        this.setState(memento.getState());
    }
}
