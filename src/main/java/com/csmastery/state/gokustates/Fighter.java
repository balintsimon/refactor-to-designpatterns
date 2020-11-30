package com.csmastery.state.gokustates;

import com.csmastery.state.Frieza;
import com.csmastery.state.TransformationLevel;

public class Fighter extends CurrentState {
    public Fighter() {
        this.transformationLevel = TransformationLevel.FIGHTER;
        this.hairColor = "Black";
        this.attackValue = 9000;
    }

    @Override
    public CurrentState nextState() {
        return new SSJ1();
    }

    @Override
    public boolean tryToDestroyFrieza(Frieza frieza) {
        return false;
    }
}
