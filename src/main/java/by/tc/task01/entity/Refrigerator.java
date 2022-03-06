package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Refrigerator extends Appliance{
  private String powerConsumption;
  private String weight;
  private String freezerCapacity;
  private String overallCapacity;
  private String height;
  private String width;

  public Refrigerator() {
    super();
    throw new RuntimeException("Set powerConsumption, weight, freezerCapacity, overallCapacity, height, width.");
  }

  public Refrigerator(String powerConsumption, String weight,
      String freezerCapacity, String overallCapacity, String height, String width) {
    this.powerConsumption = powerConsumption;
    this.weight = weight;
    this.freezerCapacity = freezerCapacity;
    this.overallCapacity = overallCapacity;
    this.height = height;
    this.width = width;
  }

  @Override
  public Map<String, Object> obtainParameters() {
    Map<String,Object> apps = new HashMap<>();
    apps.put(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString(),powerConsumption);
    apps.put(SearchCriteria.Refrigerator.WEIGHT.toString(),weight);
    apps.put(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString(),freezerCapacity);
    apps.put(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString(),overallCapacity);
    apps.put(SearchCriteria.Refrigerator.HEIGHT.toString(),height);
    apps.put(SearchCriteria.Refrigerator.WIDTH.toString(),width);
    return apps;
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

  public String getFreezerCapacity() {
    return freezerCapacity;
  }

  public void setFreezerCapacity(String freezerCapacity) {
    this.freezerCapacity = freezerCapacity;
  }

  public String getOverallCapacity() {
    return overallCapacity;
  }

  public void setOverallCapacity(String overallCapacity) {
    this.overallCapacity = overallCapacity;
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
    Refrigerator that = (Refrigerator) o;
    return Objects.equals(powerConsumption, that.powerConsumption)
        && Objects.equals(weight, that.weight) && Objects.equals(freezerCapacity,
        that.freezerCapacity) && Objects.equals(overallCapacity, that.overallCapacity)
        && Objects.equals(height, that.height) && Objects.equals(width,
        that.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), powerConsumption, weight, freezerCapacity,
        overallCapacity,
        height, width);
  }

  @Override
  public String toString() {
    return "Refrigerator{" +
        "powerConsumption='" + powerConsumption + '\'' +
        ", weight='" + weight + '\'' +
        ", freezerCapacity='" + freezerCapacity + '\'' +
        ", overallCapacity='" + overallCapacity + '\'' +
        ", height='" + height + '\'' +
        ", width='" + width + '\'' +
        '}';
  }
}
