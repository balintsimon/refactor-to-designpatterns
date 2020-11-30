package com.csmastery.state.gokustates;

import com.csmastery.state.Frieza;
import com.csmastery.state.TransformationLevel;

public class SSJ2 extends CurrentState {
    public SSJ2() {
        this.transformationLevel = TransformationLevel.SSJ2;
        this.hairColor = "Even More Yellow";
        this.attackValue = 100_000_000;
    }

    @Override
    public CurrentState nextState() {
        return new SSJ3();
    }

    @Override
    public boolean tryToDestroyFrieza(Frieza frieza) {
        frieza.makeHimDead();
        return true;
    }
}
