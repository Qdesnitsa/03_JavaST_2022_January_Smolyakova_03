package by.tc.task01.entity;

import java.util.Objects;

public class Speakers extends Appliance{
	// you may add your own code here
  private String powerConsumption;
  private String numberOfSpeakers;
  private String frequencyRange;
  private String cordLength;

  public Speakers() {
    super();
    throw new RuntimeException("Set powerConsumption, numberOfSpeakers, frequencyRange, cordLength.");
  }

  public Speakers(String type, String powerConsumption, String numberOfSpeakers,
      String frequencyRange, String cordLength) {
    super(type);
    this.powerConsumption = powerConsumption;
    this.numberOfSpeakers = numberOfSpeakers;
    this.frequencyRange = frequencyRange;
    this.cordLength = cordLength;
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
        "type='" + super.getType() + '\'' +
        ", powerConsumption=" + powerConsumption +
        ", numberOfSpeakers=" + numberOfSpeakers +
        ", frequencyRange='" + frequencyRange + '\'' +
        ", cordLength=" + cordLength +
        '}';
  }
}
