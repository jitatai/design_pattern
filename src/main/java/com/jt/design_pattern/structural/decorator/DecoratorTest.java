package com.jt.design_pattern.structural.decorator;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/13 16:36
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Decorator decorator = new ConcreteDecorator(new ConcreteComponent());
        decorator.operation();
    }
}
