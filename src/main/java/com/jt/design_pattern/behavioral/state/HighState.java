package com.jt.design_pattern.behavioral.state;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/15 16:10
 */
public class HighState extends AbstractState {
    HighState(ScoreContext scoreContext) {
        super(scoreContext);
        this.scoreContext = scoreContext;
        stateName = "优秀";
        score = 90;
    }

    HighState(AbstractState state) {
        super(state);
        this.scoreContext = state.scoreContext;
        stateName = "优秀";
        score = state.score;
    }
}
