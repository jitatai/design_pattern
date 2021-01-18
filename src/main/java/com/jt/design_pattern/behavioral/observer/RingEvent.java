package com.jt.design_pattern.behavioral.observer;

import java.util.EventObject;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/18 9:24
 */
public class RingEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    private boolean sound;
    public RingEvent(Object source,boolean sound) {
        super(source);
        this.sound = sound;
    }

    public void setSound(boolean sound) {
        this.sound = sound;
    }

    public boolean getSound(){
        return this.sound;
    }
}
