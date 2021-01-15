package com.jt.design_pattern.behavioral.state;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/15 16:10
 */
public class MiddleState extends AbstractState {
    MiddleState(ScoreContext scoreContext) {
        super(scoreContext);
        this.scoreContext = scoreContext;
        stateName = "中等";
        score = 90;
    }

    MiddleState(AbstractState state) {
        super(state);
        this.scoreContext = state.scoreContext;
        stateName = "中等";
        score = state.score;
    }
}
