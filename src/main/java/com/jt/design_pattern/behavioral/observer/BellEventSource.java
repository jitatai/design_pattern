package com.jt.design_pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/18 9:26
 */
public class BellEventSource {
    protected List<BellEventListener> listeners;
    BellEventSource(){
        listeners = new ArrayList<>();
    }
    public void addBellEventListener(BellEventListener listener){
        listeners.add(listener);
    }
    public void removeBellEventListener(BellEventListener listener){
        listeners.remove(listener);
    }
    public void ring(boolean sound){
        String message = sound ? "上课铃声" : "下课铃声";
        System.out.println(message + "响了");
        notifies(new RingEvent(this,sound));
    }
    public void notifies(RingEvent event){
        BellEventListener listener = null;
        Iterator<BellEventListener> iterator = listeners.iterator();
        while(iterator.hasNext()){
            BellEventListener eventListener = iterator.next();
            eventListener.heardBell(event);
        }

    }
}
