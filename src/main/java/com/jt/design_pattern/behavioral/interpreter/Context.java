package com.jt.design_pattern.behavioral.interpreter;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/22 16:09
 */
public class Context {
    private AbstractExpression abstractExpression;
    public void operation(String info){
        abstractExpression.interpret(info);
    }
}
