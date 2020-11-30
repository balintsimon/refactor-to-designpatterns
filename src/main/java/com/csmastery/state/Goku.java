package com.csmastery.state;

import com.csmastery.state.gokustates.Fighter;
import com.csmastery.state.gokustates.CurrentState;


public class Goku {

  private CurrentState currentState;

  Goku() {
    this.currentState = new Fighter();
  }

  public TransformationLevel powerUp() {
    this.currentState = currentState.nextState();
    return currentState.getTransformationLevel();
  }

  public TransformationLevel getCurrentLevel() {
    return currentState.getTransformationLevel();
  }

  public String hairColor() {
    return currentState.getHairColor();
  }

  public int attackValue() {
    return currentState.getAttackValue();
  }

  public boolean tryToDestroyFrieza(Frieza frieza) {
    return currentState.tryToDestroyFrieza(frieza);
  }

}
