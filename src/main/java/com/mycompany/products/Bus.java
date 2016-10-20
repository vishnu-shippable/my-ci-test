package com.mycompany.products;

/**
 * Hello world!
 *
 */
public class Bus implements Vehicle
{
  private Integer position;

  public Bus() {
    this.position = 0;
  }

  public void moveForward(Integer kilometer) {
    this.position += kilometer;
  }
}
