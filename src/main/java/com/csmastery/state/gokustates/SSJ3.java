package com.csmastery.state.gokustates;

import com.csmastery.state.Frieza;
import com.csmastery.state.TransformationLevel;

public class SSJ3 extends CurrentState {
    public SSJ3() {
        this.transformationLevel = TransformationLevel.SSJ3;
        this.hairColor = "Total Yellow and Long";
        this.attackValue = 500_000_000;
    }

    @Override
    public CurrentState nextState() {
        return new Fighter();
    }

    @Override
    public boolean tryToDestroyFrieza(Frieza frieza) {
        frieza.makeHimDead();
        return true;
    }
}
