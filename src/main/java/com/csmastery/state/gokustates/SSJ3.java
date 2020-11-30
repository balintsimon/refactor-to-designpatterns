package com.csmastery.state.gokustates;

import com.csmastery.state.Frieza;
import com.csmastery.state.Goku;
import com.csmastery.state.TransformationLevel;

public class SSJ3 extends GokuState {
    public SSJ3(Goku goku) {
        super(goku, TransformationLevel.SSJ3);
    }

    @Override
    public TransformationLevel powerUp() {
        goku.changeState(new Fighter(goku));
        return super.getTransformationLevel();
    }

    @Override
    public TransformationLevel getCurrentLevel() {
        return this.getTransformationLevel();
    }

    @Override
    public String hairColor() {
        return "Total Yellow and Long";
    }

    @Override
    public int attackValue() {
        return 500_000_000;
    }

    @Override
    public boolean tryToDestroyFrieza(Frieza frieza) {
        frieza.makeHimDead();
        return true;
    }
}
