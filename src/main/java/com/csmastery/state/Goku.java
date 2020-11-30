package com.csmastery.state;

import com.csmastery.state.gokustates.Fighter;
import com.csmastery.state.gokustates.GokuState;


public class Goku {

  private GokuState gokuState;

  public void changeState(GokuState gokuState) {
    this.gokuState = gokuState;
  }

  Goku() {
    this.gokuState = new Fighter(this);
  }

  public TransformationLevel powerUp() {
    return gokuState.powerUp();
  }

  public TransformationLevel getCurrentLevel() {
    return gokuState.getCurrentLevel();
  }

  public String hairColor() {
    return gokuState.hairColor();
  }

  public int attackValue() {
    return gokuState.attackValue();
  }

  public boolean tryToDestroyFrieza(Frieza frieza) {
    return gokuState.tryToDestroyFrieza(frieza);
  }

}
