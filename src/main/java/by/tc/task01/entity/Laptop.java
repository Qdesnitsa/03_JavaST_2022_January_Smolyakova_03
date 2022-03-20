package by.tc.task01.entity;

import java.io.Serializable;
import java.util.Objects;

public class Laptop implements Appliance, Serializable {

  private double batteryCapacity;
  private String OS;
  private int memoryRom;
  private int systemMemory;
  private double CPU;
  private int displayInches;

  private Laptop() {
  }

  public Laptop(double batteryCapacity, String os, int memoryRom, int systemMemory, double cpu,
      int displayInches) {
    this.batteryCapacity = batteryCapacity;
    this.OS = os;
    this.memoryRom = memoryRom;
    this.systemMemory = systemMemory;
    this.CPU = cpu;
    this.displayInches = displayInches;
  }

  public double getBatteryCapacity() {
    return batteryCapacity;
  }

  public String getOS() {
    return OS;
  }

  public int getMemoryRom() {
    return memoryRom;
  }

  public int getSystemMemory() {
    return systemMemory;
  }

  public double getCPU() {
    return CPU;
  }

  public int getDisplayInches() {
    return displayInches;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Laptop laptop = (Laptop) o;
    return Double.compare(laptop.batteryCapacity, batteryCapacity) == 0
        && memoryRom == laptop.memoryRom && systemMemory == laptop.systemMemory
        && Double.compare(laptop.CPU, CPU) == 0 && displayInches == laptop.displayInches
        && Objects.equals(OS, laptop.OS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batteryCapacity, OS, memoryRom, systemMemory, CPU, displayInches);
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + " : " +
        "batteryCapacity=" + batteryCapacity +
        ", OS='" + OS + '\'' +
        ", memoryRom=" + memoryRom +
        ", systemMemory=" + systemMemory +
        ", CPU=" + CPU +
        ", displayInches=" + displayInches +
        ';';
  }

  public static Builder newBuilder() {
    return new Laptop().new Builder();
  }

  public class Builder {

    private Builder() {
    }

    public Builder setBatteryCapacity(double batteryCapacity) {
      Laptop.this.batteryCapacity = batteryCapacity;
      return this;
    }

    public Builder setOS(String os) {
      Laptop.this.OS = os;
      return this;
    }

    public Builder setMemoryRom(int memoryRom) {
      Laptop.this.memoryRom = memoryRom;
      return this;
    }

    public Builder setSystemMemory(int systemMemory) {
      Laptop.this.systemMemory = systemMemory;
      return this;
    }

    public Builder setCPU(double cpu) {
      Laptop.this.CPU = cpu;
      return this;
    }

    public Builder setDisplayInches(int displayInches) {
      Laptop.this.displayInches = displayInches;
      return this;
    }

    public Laptop build() {
      return Laptop.this;
    }
  }
}
