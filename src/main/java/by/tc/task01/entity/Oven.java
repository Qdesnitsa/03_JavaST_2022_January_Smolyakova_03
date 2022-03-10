package by.tc.task01.entity;

import java.util.Objects;

public class Oven extends Appliance{
  private String POWER_CONSUMPTION;
  private String WEIGHT;
  private String CAPACITY;
  private String DEPTH;
  private String HEIGHT;
  private String WIDTH;

  public Oven(String[] resource) {
    this.POWER_CONSUMPTION = resource[2];
    this.WEIGHT = resource[4];
    this.CAPACITY = resource[6];
    this.DEPTH = resource[8];
    this.HEIGHT = resource[10];
    this.WIDTH = resource[12];
  }

  public String getPowerConsumption() {
    return POWER_CONSUMPTION;
  }

  public void setPowerConsumption(String powerConsumption) {
    this.POWER_CONSUMPTION = powerConsumption;
  }

  public String getWEIGHT() {
    return WEIGHT;
  }

  public void setWEIGHT(String WEIGHT) {
    this.WEIGHT = WEIGHT;
  }

  public String getCAPACITY() {
    return CAPACITY;
  }

  public void setCAPACITY(String CAPACITY) {
    this.CAPACITY = CAPACITY;
  }

  public String getDEPTH() {
    return DEPTH;
  }

  public void setDEPTH(String DEPTH) {
    this.DEPTH = DEPTH;
  }

  public String getHEIGHT() {
    return HEIGHT;
  }

  public void setHEIGHT(String HEIGHT) {
    this.HEIGHT = HEIGHT;
  }

  public String getWIDTH() {
    return WIDTH;
  }

  public void setWIDTH(String WIDTH) {
    this.WIDTH = WIDTH;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Oven oven = (Oven) o;
    return Objects.equals(POWER_CONSUMPTION, oven.POWER_CONSUMPTION)
        && Objects.equals(WEIGHT, oven.WEIGHT) && Objects.equals(CAPACITY,
        oven.CAPACITY) && Objects.equals(DEPTH, oven.DEPTH) && Objects.equals(
        HEIGHT, oven.HEIGHT) && Objects.equals(WIDTH, oven.WIDTH);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH);
  }

  @Override
  public String toString() {
    return "Oven: " +
        "powerConsumption='" + POWER_CONSUMPTION + '\'' +
        ", weight='" + WEIGHT + '\'' +
        ", capacity='" + CAPACITY + '\'' +
        ", depth='" + DEPTH + '\'' +
        ", height='" + HEIGHT + '\'' +
        ", width='" + WIDTH + '\'' +
        '\n';
  }
}

