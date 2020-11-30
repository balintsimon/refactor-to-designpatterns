package com.csmastery.state.gokustates;

import com.csmastery.state.Frieza;
import com.csmastery.state.Goku;
import com.csmastery.state.TransformationLevel;

public class Fighter extends GokuState {
    public Fighter(Goku goku) {
        super(goku, TransformationLevel.FIGHTER);
    }

    @Override
    public TransformationLevel powerUp() {
        goku.changeState(new SSJ1(goku));
        return super.getTransformationLevel();
    }

    @Override
    public TransformationLevel getCurrentLevel() {
        return TransformationLevel.FIGHTER;
    }

    @Override
    public String hairColor() {
        return "Black";
    }

    @Override
    public int attackValue() {
        return 9000;
    }

    @Override
    public boolean tryToDestroyFrieza(Frieza frieza) {
        return false;
    }
}
