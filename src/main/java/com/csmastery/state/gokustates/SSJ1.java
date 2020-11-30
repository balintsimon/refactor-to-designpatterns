package com.csmastery.state.gokustates;

import com.csmastery.state.Frieza;
import com.csmastery.state.Goku;
import com.csmastery.state.TransformationLevel;

public class SSJ1 extends GokuState {
    public SSJ1(Goku goku) {
        super(goku, TransformationLevel.SSJ1);
        this.hairColor = "Yellow";
        this.attackValue = 100_000;
    }

    @Override
    public TransformationLevel powerUp() {
        goku.changeState(new SSJ2(goku));
        return super.getTransformationLevel();
    }

    @Override
    public boolean tryToDestroyFrieza(Frieza frieza) {
        frieza.makeHimDead();
        return true;
    }
}
