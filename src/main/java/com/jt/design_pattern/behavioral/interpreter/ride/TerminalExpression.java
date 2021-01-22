package com.jt.design_pattern.behavioral.interpreter.ride;

import com.jt.design_pattern.behavioral.interpreter.AbstractExpression;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/22 16:07
 */
public class TerminalExpression implements Expression {
    private Set<String> terminalSet;
    TerminalExpression(String[] data){
        terminalSet = new HashSet<>();
        terminalSet.addAll(Arrays.asList(data));
    }

    @Override
    public boolean interpret(String info) {
        return terminalSet.contains(info);
    }

}
