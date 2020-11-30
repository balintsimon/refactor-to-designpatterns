package com.csmastery.state.gokustates;

import com.csmastery.state.Frieza;
import com.csmastery.state.Goku;
import com.csmastery.state.TransformationLevel;

public class SSJ2 extends GokuState {
    public SSJ2(Goku goku) {
        super(goku, TransformationLevel.SSJ2);
    }

    @Override
    public TransformationLevel powerUp() {
        goku.changeState(new SSJ3(goku));
        return super.getTransformationLevel();
    }

    @Override
    public TransformationLevel getCurrentLevel() {
        return this.getTransformationLevel();
    }

    @Override
    public String hairColor() {
        return "Even More Yellow";
    }

    @Override
    public int attackValue() {
        return 100_000_000;
    }

    @Override
    public boolean tryToDestroyFrieza(Frieza frieza) {
        frieza.makeHimDead();
        return true;
    }
}
