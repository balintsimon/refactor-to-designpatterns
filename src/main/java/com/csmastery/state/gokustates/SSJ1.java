package com.csmastery.state.gokustates;

import com.csmastery.state.Frieza;
import com.csmastery.state.TransformationLevel;

public class SSJ1 extends CurrentState {
    public SSJ1() {
        this.transformationLevel = TransformationLevel.SSJ1;
        this.hairColor = "Yellow";
        this.attackValue = 100_000;
    }

    @Override
    public CurrentState nextState() {
        return new SSJ2();
    }

    @Override
    public boolean tryToDestroyFrieza(Frieza frieza) {
        frieza.makeHimDead();
        return true;
    }
}
