package com.jt.design_pattern.behavioral.state;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/15 16:10
 */
public class LowState extends AbstractState {

    LowState(ScoreContext scoreContext) {
        super(scoreContext);
    }

    LowState(AbstractState state) {
        super(state);
    }
}
