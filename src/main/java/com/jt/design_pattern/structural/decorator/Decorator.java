package com.jt.design_pattern.structural.decorator;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/13 16:24
 */
public abstract class Decorator implements Component {
    private Component component;
    protected Decorator(Component component){
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
