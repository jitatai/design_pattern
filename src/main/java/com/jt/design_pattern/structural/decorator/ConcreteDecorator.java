package com.jt.design_pattern.structural.decorator;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/13 16:32
 */
public class ConcreteDecorator extends Decorator {
    protected ConcreteDecorator(Component component) {
        super(component);
    }
    public void extendMethod(){
        System.out.println("我是装饰器的拓展方法");
    }

    @Override
    public void operation() {
        super.operation();
        extendMethod();
    }
}
