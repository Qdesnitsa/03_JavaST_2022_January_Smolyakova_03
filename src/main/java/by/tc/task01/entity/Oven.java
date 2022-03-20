package by.tc.task01.entity;

import java.io.Serializable;
import java.util.Objects;

public class Oven implements Appliance, Serializable {
  private int powerConsumption;
  private int weight;
  private int capacity;
  private int depth;
  private double height;
  private double width;

  private Oven() {
  }

  public Oven(int powerConsumption, int weight, int capacity, int depth, double height,
      double width) {
    this.powerConsumption = powerConsumption;
    this.weight = weight;
    this.capacity = capacity;
    this.depth = depth;
    this.height = height;
    this.width = width;
  }

  public int getPowerConsumption() {
    return powerConsumption;
  }

  public int getWeight() {
    return weight;
  }

  public int getCapacity() {
    return capacity;
  }

  public int getDepth() {
    return depth;
  }

  public double getHeight() {
    return height;
  }

  public double getWidth() {
    return width;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Oven oven = (Oven) o;
    return powerConsumption == oven.powerConsumption && weight == oven.weight
        && capacity == oven.capacity && depth == oven.depth
        && Double.compare(oven.height, height) == 0
        && Double.compare(oven.width, width) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(powerConsumption, weight, capacity, depth, height, width);
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + " : " +
        ", powerConsumption=" + powerConsumption +
        ", weight=" + weight +
        ", capacity=" + capacity +
        ", depth=" + depth +
        ", height=" + height +
        ", width=" + width +
        ';';
  }

  public static Builder newBuilder() {
    return new Oven().new Builder();
  }

  public class Builder{

    private Builder() {
    }

    public Builder setPowerConsumption(int powerConsumption) {
      Oven.this.powerConsumption = powerConsumption;
      return this;
    }

    public Builder setWeight(int weight) {
      Oven.this.weight = weight;
      return this;
    }

    public Builder setCapacity(int capacity) {
      Oven.this.capacity = capacity;
      return this;
    }

    public Builder setDepth(int depth) {
      Oven.this.depth = depth;
      return this;
    }

    public Builder setHeight(double height) {
      Oven.this.height = height;
      return this;
    }

    public Builder setWidth(double width) {
      Oven.this.width = width;
      return this;
    }

    public Oven build() {
      return Oven.this;
    }
  }
}


