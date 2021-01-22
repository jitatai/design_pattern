package com.jt.design_pattern.behavioral.memento;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/22 11:18
 */
public class CreateManager {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
