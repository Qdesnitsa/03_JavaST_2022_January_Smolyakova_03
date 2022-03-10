package by.tc.task01.entity;

import java.util.Objects;

public class Refrigerator extends Appliance{
  private String POWER_CONSUMPTION;
  private String WEIGHT;
  private String FREEZER_CAPACITY;
  private String OVERALL_CAPACITY;
  private String HEIGHT;
  private String WIDTH;

  public Refrigerator(String[] resource) {
    this.POWER_CONSUMPTION = resource[2];
    this.WEIGHT = resource[4];
    this.FREEZER_CAPACITY = resource[6];
    this.OVERALL_CAPACITY = resource[8];
    this.HEIGHT = resource[10];
    this.WIDTH = resource[12];
  }

  public String getPOWER_CONSUMPTION() {
    return POWER_CONSUMPTION;
  }

  public void setPOWER_CONSUMPTION(String POWER_CONSUMPTION) {
    this.POWER_CONSUMPTION = POWER_CONSUMPTION;
  }

  public String getWEIGHT() {
    return WEIGHT;
  }

  public void setWEIGHT(String WEIGHT) {
    this.WEIGHT = WEIGHT;
  }

  public String getFREEZER_CAPACITY() {
    return FREEZER_CAPACITY;
  }

  public void setFREEZER_CAPACITY(String FREEZER_CAPACITY) {
    this.FREEZER_CAPACITY = FREEZER_CAPACITY;
  }

  public String getOVERALL_CAPACITY() {
    return OVERALL_CAPACITY;
  }

  public void setOVERALL_CAPACITY(String OVERALL_CAPACITY) {
    this.OVERALL_CAPACITY = OVERALL_CAPACITY;
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
    Refrigerator that = (Refrigerator) o;
    return Objects.equals(POWER_CONSUMPTION, that.POWER_CONSUMPTION)
        && Objects.equals(WEIGHT, that.WEIGHT) && Objects.equals(FREEZER_CAPACITY,
        that.FREEZER_CAPACITY) && Objects.equals(OVERALL_CAPACITY, that.OVERALL_CAPACITY)
        && Objects.equals(HEIGHT, that.HEIGHT) && Objects.equals(WIDTH,
        that.WIDTH);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY,
        OVERALL_CAPACITY,
        HEIGHT, WIDTH);
  }

  @Override
  public String toString() {
    return "Refrigerator{" +
        "powerConsumption='" + POWER_CONSUMPTION + '\'' +
        ", weight='" + WEIGHT + '\'' +
        ", freezerCapacity='" + FREEZER_CAPACITY + '\'' +
        ", overallCapacity='" + OVERALL_CAPACITY + '\'' +
        ", height='" + HEIGHT + '\'' +
        ", width='" + WIDTH + '\'' +
        '}';
  }
}
