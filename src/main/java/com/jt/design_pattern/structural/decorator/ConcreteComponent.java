package com.jt.design_pattern.structural.decorator;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/13 16:28
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("具体类的实现代码");
    }
}
