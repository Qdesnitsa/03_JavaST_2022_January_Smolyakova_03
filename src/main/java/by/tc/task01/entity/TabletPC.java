package by.tc.task01.entity;

import java.util.Objects;

public class TabletPC extends Appliance {

  private static final long serialVersionUID = 4654855715800489039L;
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
        "id=" + super.getId() +
        ", batteryCapacity=" + batteryCapacity +
        ", displayInches=" + displayInches +
        ", memoryRom=" + memoryRom +
        ", flashMemoryCapacity=" + flashMemoryCapacity +
        ", color='" + color + '\'' +
        ", sellingPrice=" + super.getSellingPrice() +
        ", quantity=" + super.getQuantity() +
        ';';
  }

  public static Builder newBuilder() {
    return new TabletPC().new Builder();
  }

  public class Builder extends Appliance.Builder{

    private Builder() {
    }

    @Override
    public Builder setID(int id) {
      super.setID(id);
      return this;
    }

    @Override
    public Builder setSellingPrice(double sellingPrice) {
      super.setSellingPrice(sellingPrice);
      return this;
    }

    @Override
    public Builder setQuantity(int quantity) {
      super.setQuantity(quantity);
      return this;
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

    @Override
    public TabletPC build() {
      return TabletPC.this;
    }
  }
}
