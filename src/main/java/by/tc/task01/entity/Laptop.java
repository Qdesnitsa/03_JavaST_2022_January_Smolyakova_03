package by.tc.task01.entity;

import java.util.Objects;

public class Laptop extends Appliance{
  // you may add your own code here
  private String batteryCapacity;
  private String os;
  private String memoryRom;
  private String systemMemory;
  private String cpu;
  private String displayInches;

  public Laptop(String type, String batteryCapacity, String os, String memoryRom,
      String systemMemory, String cpu, String displayInches) {
    super(type);
    this.batteryCapacity = batteryCapacity;
    this.os = os;
    this.memoryRom = memoryRom;
    this.systemMemory = systemMemory;
    this.cpu = cpu;
    this.displayInches = displayInches;
  }

  public Laptop() {
    super();
    throw new RuntimeException("Set type, batteryCapacity, os, memoryRom, systemMemory, cpu, displayInches.");
  }

  public String getBatteryCapacity() {
    return batteryCapacity;
  }

  public void setBatteryCapacity(String batteryCapacity) {
    this.batteryCapacity = batteryCapacity;
  }

  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }

  public String getMemoryRom() {
    return memoryRom;
  }

  public void setMemoryRom(String memoryRom) {
    this.memoryRom = memoryRom;
  }

  public String getSystemMemory() {
    return systemMemory;
  }

  public void setSystemMemory(String systemMemory) {
    this.systemMemory = systemMemory;
  }

  public String getCpu() {
    return cpu;
  }

  public void setCpu(String cpu) {
    this.cpu = cpu;
  }

  public String getDisplayInches() {
    return displayInches;
  }

  public void setDisplayInches(String displayInches) {
    this.displayInches = displayInches;
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
    return Objects.equals(batteryCapacity, laptop.batteryCapacity)
        && Objects.equals(os, laptop.os) && Objects.equals(memoryRom,
        laptop.memoryRom) && Objects.equals(systemMemory, laptop.systemMemory)
        && Objects.equals(cpu, laptop.cpu) && Objects.equals(displayInches,
        laptop.displayInches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), batteryCapacity, os, memoryRom, systemMemory, cpu,
        displayInches);
  }

  @Override
  public String toString() {
    return "Laptop{" + "type='" + super.getType() + '\'' +
        ", batteryCapacity='" + batteryCapacity + '\'' +
        ", os='" + os + '\'' +
        ", memoryRom='" + memoryRom + '\'' +
        ", systemMemory='" + systemMemory + '\'' +
        ", cpu='" + cpu + '\'' +
        ", displayInches='" + displayInches + '\'' +
        '}';
  }
}
