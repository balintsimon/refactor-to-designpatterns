package com.csmastery.state.gokustates;

import com.csmastery.state.Frieza;
import com.csmastery.state.Goku;
import com.csmastery.state.TransformationLevel;

public abstract class GokuState {
    protected Goku goku;
    protected TransformationLevel transformationLevel;
    protected String hairColor;
    protected int attackValue;

    public GokuState(Goku goku, TransformationLevel transformationLevel) {
        this.goku = goku;
        this.transformationLevel = transformationLevel;
    }

    public abstract TransformationLevel powerUp();

    public TransformationLevel getCurrentLevel() {
        return this.transformationLevel;
    }

    public String hairColor() {
        return this.hairColor;
    }

    public int attackValue() {
        return this.attackValue;
    }

    public abstract boolean tryToDestroyFrieza(Frieza frieza);

    protected TransformationLevel getTransformationLevel() {
        return transformationLevel;
    }
}
