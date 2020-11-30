package com.csmastery.state.gokustates;

import com.csmastery.state.Frieza;
import com.csmastery.state.Goku;
import com.csmastery.state.TransformationLevel;

public class Fighter extends GokuState {
    public Fighter(Goku goku) {
        super(goku, TransformationLevel.FIGHTER);
        this.hairColor = "Black";
        this.attackValue = 9000;
    }

    @Override
    public TransformationLevel powerUp() {
        goku.changeState(new SSJ1(goku));
        return super.getTransformationLevel();
    }

    @Override
    public boolean tryToDestroyFrieza(Frieza frieza) {
        return false;
    }
}
