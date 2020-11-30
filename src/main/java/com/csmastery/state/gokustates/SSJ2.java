package com.csmastery.state.gokustates;

import com.csmastery.state.Frieza;
import com.csmastery.state.Goku;
import com.csmastery.state.TransformationLevel;

public class SSJ2 extends GokuState {
    public SSJ2(Goku goku) {
        super(goku, TransformationLevel.SSJ2);
        this.hairColor = "Even More Yellow";
        this.attackValue = 100_000_000;
    }

    @Override
    public TransformationLevel powerUp() {
        goku.changeState(new SSJ3(goku));
        return super.getTransformationLevel();
    }

    @Override
    public boolean tryToDestroyFrieza(Frieza frieza) {
        frieza.makeHimDead();
        return true;
    }
}
