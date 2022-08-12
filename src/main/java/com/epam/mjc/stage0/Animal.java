package com.epam.mjc.stage0;

public class Animal {
  private String color;
  private int numberOfPaws;
  private boolean hasFur;

  public Animal(String color, int numberOfPaws, boolean hasFur) {
    this.color = color;
    this.numberOfPaws = numberOfPaws;
    this.hasFur = hasFur;
  }

  public String getDescription() {
    StringBuilder newS = new StringBuilder();
    newS.append("This animal is mostly ");
    newS.append(color);
    newS.append(". It has ");
    newS.append(numberOfPaws);
    if (numberOfPaws == 1)
    newS.append(" paw and ");
    else newS.append(" paws and ");
    if (hasFur) {
      newS.append("a fur.");
    } else newS.append("no fur.");

    return newS.toString();
  }
}
