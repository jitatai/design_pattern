package com.jt.design_pattern.structural.bridge;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/13 11:22
 * 桥接（Bridge）模式的定义如下：将抽象与实现分离，使它们可以独立变化。
 * 它是用组合关系代替继承关系来实现，从而降低了抽象和实现这两个可变维度的耦合度。
 *
 * 桥接（Bridge）模式包含以下主要角色。
 * 抽象化（Abstraction）角色：定义抽象类，并包含一个对实现化对象的引用。
 * 扩展抽象化（Refined Abstraction）角色：是抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法。
 * 实现化（Implementor）角色：定义实现化角色的接口，供扩展抽象化角色调用。
 * 具体实现化（Concrete Implementor）角色：给出实现化角色接口的具体实现。
 */
public class BridgeTest {
    public static void main(String[] args) {
        Abstraction abstraction = new ConcreteAbstraction(new ConcreteImplementor());
        abstraction.Operation();
    }
}