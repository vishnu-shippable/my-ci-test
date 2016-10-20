package com.mycompany.products;

/**
 * Hello world!
 *
 */
public class Car implements Vehicle
{
  private Integer position;
  protected Integer wheelsCount;

  public Car() {
    this.position = 0;
    this.wheelsCount = 0;
  }

  public void moveForward(Integer kilometer) {
    this.position += kilometer;
  }

  private class Seat {
    Integer capacity;
  }
}

class Bmw extends Car {
  public Bmw() {
    super();
    super.wheelsCount = 4;
  }
}
