package com.csmastery.state.gokustates;

import com.csmastery.state.Frieza;
import com.csmastery.state.TransformationLevel;

public abstract class CurrentState {
    protected TransformationLevel transformationLevel;
    protected String hairColor;
    protected int attackValue;

    public abstract CurrentState nextState();

    public String getHairColor() {
        return hairColor;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public TransformationLevel getTransformationLevel() {
        return transformationLevel;
    }

    public abstract boolean tryToDestroyFrieza(Frieza frieza);
}
