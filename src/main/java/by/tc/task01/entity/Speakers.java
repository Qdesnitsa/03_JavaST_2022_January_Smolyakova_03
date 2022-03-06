package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Speakers extends Appliance{
  private String powerConsumption;
  private String numberOfSpeakers;
  private String frequencyRange;
  private String cordLength;

  public Speakers() {
    super();
    throw new RuntimeException("Set powerConsumption, numberOfSpeakers, frequencyRange, cordLength.");
  }

  public Speakers(String powerConsumption, String numberOfSpeakers,
      String frequencyRange, String cordLength) {
    this.powerConsumption = powerConsumption;
    this.numberOfSpeakers = numberOfSpeakers;
    this.frequencyRange = frequencyRange;
    this.cordLength = cordLength;
  }

  @Override
  public Map<String, Object> obtainParameters() {
    Map<String,Object> apps = new HashMap<>();
    apps.put(SearchCriteria.Speakers.POWER_CONSUMPTION.toString(),powerConsumption);
    apps.put(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString(),numberOfSpeakers);
    apps.put(SearchCriteria.Speakers.FREQUENCY_RANGE.toString(),frequencyRange);
    apps.put(SearchCriteria.Speakers.CORD_LENGTH.toString(),cordLength);
    return apps;
  }

  public String getPowerConsumption() {
    return powerConsumption;
  }

  public void setPowerConsumption(String powerConsumption) {
    this.powerConsumption = powerConsumption;
  }

  public String getNumberOfSpeakers() {
    return numberOfSpeakers;
  }

  public void setNumberOfSpeakers(String numberOfSpeakers) {
    this.numberOfSpeakers = numberOfSpeakers;
  }

  public String getFrequencyRange() {
    return frequencyRange;
  }

  public void setFrequencyRange(String frequencyRange) {
    this.frequencyRange = frequencyRange;
  }

  public String getCordLength() {
    return cordLength;
  }

  public void setCordLength(String cordLength) {
    this.cordLength = cordLength;
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
    Speakers speakers = (Speakers) o;
    return Objects.equals(powerConsumption, speakers.powerConsumption)
        && Objects.equals(numberOfSpeakers, speakers.numberOfSpeakers)
        && Objects.equals(frequencyRange, speakers.frequencyRange)
        && Objects.equals(cordLength, speakers.cordLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), powerConsumption, numberOfSpeakers, frequencyRange,
        cordLength);
  }

  @Override
  public String toString() {
    return "Speakers{" +
        "powerConsumption='" + powerConsumption + '\'' +
        ", numberOfSpeakers='" + numberOfSpeakers + '\'' +
        ", frequencyRange='" + frequencyRange + '\'' +
        ", cordLength='" + cordLength + '\'' +
        '}';
  }
}
