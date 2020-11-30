package com.csmastery.state.gokustates;

import com.csmastery.state.Frieza;
import com.csmastery.state.Goku;
import com.csmastery.state.TransformationLevel;

public class SSJ3 extends GokuState {
    public SSJ3(Goku goku) {
        super(goku);
    }

    @Override
    public TransformationLevel powerUp() {
        goku.changeState(new Fighter(goku));
        return TransformationLevel.FIGHTER;
    }

    @Override
    public TransformationLevel getCurrentLevel() {
        return TransformationLevel.SSJ3;
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
