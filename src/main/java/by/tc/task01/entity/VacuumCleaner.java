package by.tc.task01.entity;

import java.util.Objects;

public class VacuumCleaner extends Appliance {
  private String POWER_CONSUMPTION;
  private String FILTER_TYPE;
  private String BAG_TYPE;
  private String WAND_TYPE;
  private String MOTOR_SPEED_REGULATION;
  private String CLEANING_WIDTH;

  public VacuumCleaner(String[] resource) {
    this.POWER_CONSUMPTION = resource[2];
    this.FILTER_TYPE = resource[4];
    this.BAG_TYPE = resource[6];
    this.WAND_TYPE = resource[8];
    this.MOTOR_SPEED_REGULATION = resource[10];
    this.CLEANING_WIDTH = resource[12];
  }

  public String getPOWER_CONSUMPTION() {
    return POWER_CONSUMPTION;
  }

  public void setPOWER_CONSUMPTION(String POWER_CONSUMPTION) {
    this.POWER_CONSUMPTION = POWER_CONSUMPTION;
  }

  public String getFILTER_TYPE() {
    return FILTER_TYPE;
  }

  public void setFILTER_TYPE(String FILTER_TYPE) {
    this.FILTER_TYPE = FILTER_TYPE;
  }

  public String getBAG_TYPE() {
    return BAG_TYPE;
  }

  public void setBAG_TYPE(String BAG_TYPE) {
    this.BAG_TYPE = BAG_TYPE;
  }

  public String getWAND_TYPE() {
    return WAND_TYPE;
  }

  public void setWAND_TYPE(String WAND_TYPE) {
    this.WAND_TYPE = WAND_TYPE;
  }

  public String getMOTOR_SPEED_REGULATION() {
    return MOTOR_SPEED_REGULATION;
  }

  public void setMOTOR_SPEED_REGULATION(String MOTOR_SPEED_REGULATION) {
    this.MOTOR_SPEED_REGULATION = MOTOR_SPEED_REGULATION;
  }

  public String getCLEANING_WIDTH() {
    return CLEANING_WIDTH;
  }

  public void setCLEANING_WIDTH(String CLEANING_WIDTH) {
    this.CLEANING_WIDTH = CLEANING_WIDTH;
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
    VacuumCleaner that = (VacuumCleaner) o;
    return Objects.equals(POWER_CONSUMPTION, that.POWER_CONSUMPTION)
        && Objects.equals(FILTER_TYPE, that.FILTER_TYPE) && Objects.equals(BAG_TYPE,
        that.BAG_TYPE) && Objects.equals(WAND_TYPE, that.WAND_TYPE)
        && Objects.equals(MOTOR_SPEED_REGULATION, that.MOTOR_SPEED_REGULATION)
        && Objects.equals(CLEANING_WIDTH, that.CLEANING_WIDTH);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), POWER_CONSUMPTION, FILTER_TYPE, BAG_TYPE, WAND_TYPE,
        MOTOR_SPEED_REGULATION, CLEANING_WIDTH);
  }

  @Override
  public String toString() {
    return "VacuumCleaner{" +
        "powerConsumption='" + POWER_CONSUMPTION + '\'' +
        ", filterType='" + FILTER_TYPE + '\'' +
        ", bagType='" + BAG_TYPE + '\'' +
        ", wandType='" + WAND_TYPE + '\'' +
        ", motorSpeedRegulation='" + MOTOR_SPEED_REGULATION + '\'' +
        ", cleaningWidth='" + CLEANING_WIDTH + '\'' +
        '}';
  }
}
