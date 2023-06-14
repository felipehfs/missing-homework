package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.scenes.scene2d.Action;

public class SetAnimationAction extends Action {
    protected Animation animationToDisplay;

    public SetAnimationAction(Animation a) {
        animationToDisplay = a;
    }

    @Override
    public boolean act(float delta) {
        BaseActor ba = (BaseActor) target;
        ba.setAnimation(animationToDisplay);
        return true;
    }
}
