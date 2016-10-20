package com.mycompany.products;

/**
 * Hello world!
 *
 */
public class Car implements Vehicle
{
  private Integer position;

  public Car() {
    this.position = 0;
  }

  public void moveForward(Integer kilometer) {
    this.position += kilometer;
  }
}
