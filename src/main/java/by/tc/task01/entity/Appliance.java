package by.tc.task01.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Appliance {
	// you may add your own code here
  List<Appliance> appliences = new ArrayList<>();
  private String type;

  public Appliance() {
  }

  public Appliance(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Appliance appliance = (Appliance) o;
    return Objects.equals(type, appliance.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    return "Appliance{" +
        "type='" + type + '\'' +
        '}';
  }
}
