package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class Background extends BaseActor{

    public Animation hallway;
    public Animation classroom;
    public Animation scienceLab;
    public Animation library;

    public Background(float x, float y, Stage stage) {
        super(x, y, stage);
        hallway = loadTexture("assets/bg-hallway.jpg");
        classroom = loadTexture("assets/bg-classroom.jpg");
        scienceLab = loadTexture("assets/bg-science-lab.jpg");
        library = loadTexture("assets/bg-library.jpg");
        setSize(800, 600);
    }
}
