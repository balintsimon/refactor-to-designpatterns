package com.csmastery.state.gokustates;

import com.csmastery.state.Frieza;
import com.csmastery.state.Goku;
import com.csmastery.state.TransformationLevel;

public class SSJ1 extends GokuState {
    public SSJ1(Goku goku) {
        super(goku, TransformationLevel.SSJ1);
    }

    @Override
    public TransformationLevel powerUp() {
        goku.changeState(new SSJ2(goku));
        return super.getTransformationLevel();
    }

    @Override
    public TransformationLevel getCurrentLevel() {
        return this.getTransformationLevel();
    }

    @Override
    public String hairColor() {
        return "Yellow";
    }

    @Override
    public int attackValue() {
        return 100_000;
    }

    @Override
    public boolean tryToDestroyFrieza(Frieza frieza) {
        frieza.makeHimDead();
        return true;
    }
}
