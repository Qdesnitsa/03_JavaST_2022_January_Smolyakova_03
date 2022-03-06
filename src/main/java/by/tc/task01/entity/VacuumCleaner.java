package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class VacuumCleaner extends Appliance {
  private String powerConsumption;
  private String filterType;
  private String bagType;
  private String wandType;
  private String motorSpeedRegulation;
  private String cleaningWidth;

  public VacuumCleaner() {
    super();
    throw new RuntimeException("Set powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth.");
  }

  public VacuumCleaner(String powerConsumption, String filterType, String bagType,
      String wandType, String motorSpeedRegulation, String cleaningWidth) {
    this.powerConsumption = powerConsumption;
    this.filterType = filterType;
    this.bagType = bagType;
    this.wandType = wandType;
    this.motorSpeedRegulation = motorSpeedRegulation;
    this.cleaningWidth = cleaningWidth;
  }

  @Override
  public Map<String, Object> obtainParameters() {
    Map<String,Object> apps = new HashMap<>();
    apps.put(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString(),powerConsumption);
    apps.put(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString(),filterType);
    apps.put(SearchCriteria.VacuumCleaner.BAG_TYPE.toString(),bagType);
    apps.put(SearchCriteria.VacuumCleaner.WAND_TYPE.toString(),wandType);
    apps.put(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString(),motorSpeedRegulation);
    apps.put(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString(),cleaningWidth);
    return apps;
  }

  public String getPowerConsumption() {
    return powerConsumption;
  }

  public void setPowerConsumption(String powerConsumption) {
    this.powerConsumption = powerConsumption;
  }

  public String getFilterType() {
    return filterType;
  }

  public void setFilterType(String filterType) {
    this.filterType = filterType;
  }

  public String getBagType() {
    return bagType;
  }

  public void setBagType(String bagType) {
    this.bagType = bagType;
  }

  public String getWandType() {
    return wandType;
  }

  public void setWandType(String wandType) {
    this.wandType = wandType;
  }

  public String getMotorSpeedRegulation() {
    return motorSpeedRegulation;
  }

  public void setMotorSpeedRegulation(String motorSpeedRegulation) {
    this.motorSpeedRegulation = motorSpeedRegulation;
  }

  public String getCleaningWidth() {
    return cleaningWidth;
  }

  public void setCleaningWidth(String cleaningWidth) {
    this.cleaningWidth = cleaningWidth;
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
    return Objects.equals(powerConsumption, that.powerConsumption)
        && Objects.equals(filterType, that.filterType) && Objects.equals(bagType,
        that.bagType) && Objects.equals(wandType, that.wandType)
        && Objects.equals(motorSpeedRegulation, that.motorSpeedRegulation)
        && Objects.equals(cleaningWidth, that.cleaningWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), powerConsumption, filterType, bagType, wandType,
        motorSpeedRegulation, cleaningWidth);
  }

  @Override
  public String toString() {
    return "VacuumCleaner{" +
        "powerConsumption='" + powerConsumption + '\'' +
        ", filterType='" + filterType + '\'' +
        ", bagType='" + bagType + '\'' +
        ", wandType='" + wandType + '\'' +
        ", motorSpeedRegulation='" + motorSpeedRegulation + '\'' +
        ", cleaningWidth='" + cleaningWidth + '\'' +
        '}';
  }
}
