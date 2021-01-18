package com.jt.design_pattern.behavioral.observer;

import java.util.EventListener;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/18 9:27
 */
public interface BellEventListener extends EventListener {
    void heardBell(RingEvent event);
}
