package by.tc.task01.entity;

import java.io.Serializable;
import java.util.Objects;

public class TabletPC implements Appliance, Serializable {
  private int batteryCapacity;
  private int displayInches;
  private int memoryRom;
  private int flashMemoryCapacity;
  private String color;

  private TabletPC(){
  }

  public TabletPC(int batteryCapacity, int displayInches, int memoryRom, int flashMemoryCapacity,
      String color) {
    this.batteryCapacity = batteryCapacity;
    this.displayInches = displayInches;
    this.memoryRom = memoryRom;
    this.flashMemoryCapacity = flashMemoryCapacity;
    this.color = color;
  }

  public double getBatteryCapacity() {
    return batteryCapacity;
  }

  public int getDisplayInches() {
    return displayInches;
  }

  public int getMemoryRom() {
    return memoryRom;
  }

  public int getFlashMemoryCapacity() {
    return flashMemoryCapacity;
  }

  public String getColor() {
    return color;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TabletPC tabletPC = (TabletPC) o;
    return Double.compare(tabletPC.batteryCapacity, batteryCapacity) == 0
        && displayInches == tabletPC.displayInches && memoryRom == tabletPC.memoryRom
        && flashMemoryCapacity == tabletPC.flashMemoryCapacity && Objects.equals(color,
        tabletPC.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + " : " +
        "batteryCapacity=" + batteryCapacity +
        ", displayInches=" + displayInches +
        ", memoryRom=" + memoryRom +
        ", flashMemoryCapacity=" + flashMemoryCapacity +
        ", color='" + color + '\'' +
        ';';
  }

  public static Builder newBuilder() {
    return new TabletPC().new Builder();
  }

  public class Builder implements Appliance{

    private Builder() {
    }

    public Builder setBatteryCapacity(int batteryCapacity) {
      TabletPC.this.batteryCapacity = batteryCapacity;
      return this;
    }

    public Builder setDisplayInches(int displayInches) {
      TabletPC.this.displayInches = displayInches;
      return this;
    }

    public Builder setMemoryRom(int memoryRom) {
      TabletPC.this.memoryRom = memoryRom;
      return this;
    }

    public Builder setFlashMemoryCapacity(int flashMemoryCapacity) {
      TabletPC.this.flashMemoryCapacity = flashMemoryCapacity;
      return this;
    }

    public Builder setColor(String color) {
      TabletPC.this.color = color;
      return this;
    }

    public TabletPC build() {
      return TabletPC.this;
    }
  }
}
