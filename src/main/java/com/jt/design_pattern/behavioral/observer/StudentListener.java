package com.jt.design_pattern.behavioral.observer;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/18 9:30
 */
public class StudentListener implements BellEventListener {
    @Override
    public void heardBell(RingEvent event) {
        if (event.getSound()){
            System.out.println("学生上课");
            return;
        }
        System.out.println("学生下课");
    }
}
