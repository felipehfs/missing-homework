package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class Kelsoe extends  BaseActor{
    public Animation normal;
    public Animation sad;
    public Animation lookLeft;
    public Animation lookRight;

    public Kelsoe(float x, float y, Stage stage) {
        super(x, y, stage);
        normal = loadTexture("assets/kelsoe-normal.png");
        sad = loadTexture("assets/kelsoe-sad.png");
        lookLeft = loadTexture("assets/kelsoe-look-left.png");
        lookRight = loadTexture("assets/kelsoe-look-right.png");
    }
}
