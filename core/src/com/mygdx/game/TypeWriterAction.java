package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.scenes.scene2d.Action;

public class TypeWriterAction extends SetTextAction{

    private float elapsedTime;
    private float charactersPerSecond;
    public TypeWriterAction(String textToDisplay) {
        super(textToDisplay);
        elapsedTime = 0;
        charactersPerSecond = 30;
    }

    @Override
    public boolean act(float delta) {
        elapsedTime += delta;
        int numberOfCharacters = (int) (elapsedTime * charactersPerSecond);
        if (numberOfCharacters > textToDisplay.length())
            numberOfCharacters = textToDisplay.length();

        String partialText = textToDisplay.substring(0, numberOfCharacters);
        DialogBox db = (DialogBox) target;
        db.setText(partialText);

        return numberOfCharacters >= textToDisplay.length();
    }


}
