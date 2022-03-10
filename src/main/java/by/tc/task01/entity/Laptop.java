package by.tc.task01.entity;

import java.util.Objects;

public class Laptop extends Appliance{
  private String BATTERY_CAPACITY;
  private String OS;
  private String MEMORY_ROM;
  private String SYSTEM_MEMORY;
  private String CPU;
  private String DISPLAY_INCHES;

  public Laptop(String[] resource) {
    this.BATTERY_CAPACITY = resource[2];
    this.OS = resource[4];
    this.MEMORY_ROM = resource[6];
    this.SYSTEM_MEMORY = resource[8];
    this.CPU = resource[10];
    this.DISPLAY_INCHES = resource[12];
  }

  public String getBATTERY_CAPACITY() {
    return BATTERY_CAPACITY;
  }

  public void setBATTERY_CAPACITY(String BATTERY_CAPACITY) {
    this.BATTERY_CAPACITY = BATTERY_CAPACITY;
  }

  public String getOS() {
    return OS;
  }

  public void setOS(String OS) {
    this.OS = OS;
  }

  public String getMEMORY_ROM() {
    return MEMORY_ROM;
  }

  public void setMEMORY_ROM(String MEMORY_ROM) {
    this.MEMORY_ROM = MEMORY_ROM;
  }

  public String getSYSTEM_MEMORY() {
    return SYSTEM_MEMORY;
  }

  public void setSYSTEM_MEMORY(String SYSTEM_MEMORY) {
    this.SYSTEM_MEMORY = SYSTEM_MEMORY;
  }

  public String getCPU() {
    return CPU;
  }

  public void setCPU(String CPU) {
    this.CPU = CPU;
  }

  public String getDISPLAY_INCHES() {
    return DISPLAY_INCHES;
  }

  public void setDISPLAY_INCHES(String DISPLAY_INCHES) {
    this.DISPLAY_INCHES = DISPLAY_INCHES;
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
    Laptop laptop = (Laptop) o;
    return Objects.equals(BATTERY_CAPACITY, laptop.BATTERY_CAPACITY)
        && Objects.equals(OS, laptop.OS) && Objects.equals(MEMORY_ROM,
        laptop.MEMORY_ROM) && Objects.equals(SYSTEM_MEMORY, laptop.SYSTEM_MEMORY)
        && Objects.equals(CPU, laptop.CPU) && Objects.equals(DISPLAY_INCHES,
        laptop.DISPLAY_INCHES);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), BATTERY_CAPACITY, OS, MEMORY_ROM, SYSTEM_MEMORY, CPU,
        DISPLAY_INCHES);
  }

  @Override
  public String toString() {
    return "Laptop{" +
        "batteryCapacity='" + BATTERY_CAPACITY + '\'' +
        ", os='" + OS + '\'' +
        ", memoryRom='" + MEMORY_ROM + '\'' +
        ", systemMemory='" + SYSTEM_MEMORY + '\'' +
        ", cpu='" + CPU + '\'' +
        ", displayInches='" + DISPLAY_INCHES + '\'' +
        '}';
  }
}
