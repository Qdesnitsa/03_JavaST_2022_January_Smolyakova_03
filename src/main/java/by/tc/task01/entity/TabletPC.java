package by.tc.task01.entity;

import java.util.Objects;

public class TabletPC extends Appliance{
  private String BATTERY_CAPACITY;
  private String DISPLAY_INCHES;
  private String MEMORY_ROM;
  private String FLASH_MEMORY_CAPACITY;
  private String COLOR;

  public TabletPC(String[] resource) {
    this.BATTERY_CAPACITY = resource[2];
    this.DISPLAY_INCHES = resource[4];
    this.MEMORY_ROM = resource[6];
    this.FLASH_MEMORY_CAPACITY = resource[8];
    this.COLOR = resource[10];
  }

  public String getBATTERY_CAPACITY() {
    return BATTERY_CAPACITY;
  }

  public void setBATTERY_CAPACITY(String BATTERY_CAPACITY) {
    this.BATTERY_CAPACITY = BATTERY_CAPACITY;
  }

  public String getDISPLAY_INCHES() {
    return DISPLAY_INCHES;
  }

  public void setDISPLAY_INCHES(String DISPLAY_INCHES) {
    this.DISPLAY_INCHES = DISPLAY_INCHES;
  }

  public String getMEMORY_ROM() {
    return MEMORY_ROM;
  }

  public void setMEMORY_ROM(String MEMORY_ROM) {
    this.MEMORY_ROM = MEMORY_ROM;
  }

  public String getFLASH_MEMORY_CAPACITY() {
    return FLASH_MEMORY_CAPACITY;
  }

  public void setFLASH_MEMORY_CAPACITY(String FLASH_MEMORY_CAPACITY) {
    this.FLASH_MEMORY_CAPACITY = FLASH_MEMORY_CAPACITY;
  }

  public String getCOLOR() {
    return COLOR;
  }

  public void setCOLOR(String COLOR) {
    this.COLOR = COLOR;
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
    TabletPC tabletPC = (TabletPC) o;
    return Objects.equals(BATTERY_CAPACITY, tabletPC.BATTERY_CAPACITY)
        && Objects.equals(DISPLAY_INCHES, tabletPC.DISPLAY_INCHES)
        && Objects.equals(MEMORY_ROM, tabletPC.MEMORY_ROM) && Objects.equals(
        FLASH_MEMORY_CAPACITY, tabletPC.FLASH_MEMORY_CAPACITY) && Objects.equals(COLOR,
        tabletPC.COLOR);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM,
        FLASH_MEMORY_CAPACITY, COLOR);
  }

  @Override
  public String toString() {
    return "TabletPC{" +
        "batteryCapacity='" + BATTERY_CAPACITY + '\'' +
        ", displayInches='" + DISPLAY_INCHES + '\'' +
        ", memoryRom='" + MEMORY_ROM + '\'' +
        ", flashMemoryCapacity='" + FLASH_MEMORY_CAPACITY + '\'' +
        ", color='" + COLOR + '\'' +
        '}';
  }
}
