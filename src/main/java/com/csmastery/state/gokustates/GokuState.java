package com.csmastery.state.gokustates;

import com.csmastery.state.Frieza;
import com.csmastery.state.Goku;
import com.csmastery.state.TransformationLevel;

public abstract class GokuState {
    protected Goku goku;
    protected TransformationLevel transformationLevel;

    public GokuState(Goku goku, TransformationLevel transformationLevel) {
        this.goku = goku;
        this.transformationLevel = transformationLevel;
    }

    public abstract TransformationLevel powerUp();

    public abstract TransformationLevel getCurrentLevel();

    public abstract String hairColor();

    public abstract int attackValue();

    public abstract boolean tryToDestroyFrieza(Frieza frieza);

    protected TransformationLevel getTransformationLevel() {
        return transformationLevel;
    }
}
