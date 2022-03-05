package by.tc.task01.entity;

import java.util.Objects;

public class Oven extends Appliance{
  // you may add your own code here
  private String powerConsumption;
  private String weight;
  private String capacity;
  private String depth;
  private String height;
  private String width;

  public Oven() {
    super();
    throw new RuntimeException("Set powerConsumption, weight, capacity, depth, height, width.");
  }

  public Oven(String type, String powerConsumption, String weight, String capacity, String depth,
      String height, String width) {
    super(type);
    this.powerConsumption = powerConsumption;
    this.weight = weight;
    this.capacity = capacity;
    this.depth = depth;
    this.height = height;
    this.width = width;
  }

  public String getPowerConsumption() {
    return powerConsumption;
  }

  public void setPowerConsumption(String powerConsumption) {
    this.powerConsumption = powerConsumption;
  }

  public String getWeight() {
    return weight;
  }

  public void setWeight(String weight) {
    this.weight = weight;
  }

  public String getCapacity() {
    return capacity;
  }

  public void setCapacity(String capacity) {
    this.capacity = capacity;
  }

  public String getDepth() {
    return depth;
  }

  public void setDepth(String depth) {
    this.depth = depth;
  }

  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  public String getWidth() {
    return width;
  }

  public void setWidth(String width) {
    this.width = width;
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
    return Objects.equals(powerConsumption, oven.powerConsumption)
        && Objects.equals(weight, oven.weight) && Objects.equals(capacity,
        oven.capacity) && Objects.equals(depth, oven.depth) && Objects.equals(
        height, oven.height) && Objects.equals(width, oven.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), powerConsumption, weight, capacity, depth, height, width);
  }

  @Override
  public String toString() {
    return "Oven{" + "type='" + super.getType() + '\'' +
        ", powerConsumption='" + powerConsumption + '\'' +
        ", weight='" + weight + '\'' +
        ", capacity='" + capacity + '\'' +
        ", depth='" + depth + '\'' +
        ", height='" + height + '\'' +
        ", width='" + width + '\'' +
        '}';
  }
}

