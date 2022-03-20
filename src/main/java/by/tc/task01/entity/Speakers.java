package by.tc.task01.entity;

import java.io.Serializable;
import java.util.Objects;

public class Speakers implements Appliance, Serializable {
  private int powerConsumption;
  private int numberOfSpeakers;
  private String frequencyRange;
  private int cordLength;

  private Speakers() {}

  public Speakers(int powerConsumption, int numberOfSpeakers, String frequencyRange,
      int cordLength) {
    this.powerConsumption = powerConsumption;
    this.numberOfSpeakers = numberOfSpeakers;
    this.frequencyRange = frequencyRange;
    this.cordLength = cordLength;
  }

  public int getPowerConsumption() {
    return powerConsumption;
  }

  public int getNumberOfSpeakers() {
    return numberOfSpeakers;
  }

  public String getFrequencyRange() {
    return frequencyRange;
  }

  public int getCordLength() {
    return cordLength;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Speakers speakers = (Speakers) o;
    return powerConsumption == speakers.powerConsumption
        && numberOfSpeakers == speakers.numberOfSpeakers && cordLength == speakers.cordLength
        && Objects.equals(frequencyRange, speakers.frequencyRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + " : " +
        "powerConsumption=" + powerConsumption +
        ", numberOfSpeakers=" + numberOfSpeakers +
        ", frequencyRange='" + frequencyRange + '\'' +
        ", cordLength=" + cordLength +
        ';';
  }

  public static Builder newBuilder() {
    return new Speakers().new Builder();
  }

  public class Builder {

    private Builder() {
    }

    public Builder setPowerConsumption(int powerConsumption) {
      Speakers.this.powerConsumption = powerConsumption;
      return this;
    }

    public Builder setNumberOfSpeakers(int numberOfSpeakers) {
      Speakers.this.numberOfSpeakers = numberOfSpeakers;
      return this;
    }

    public Builder setFrequencyRange(String frequencyRange) {
      Speakers.this.frequencyRange = frequencyRange;
      return this;
    }

    public Builder setCordLength(int cordLength) {
      Speakers.this.cordLength = cordLength;
      return this;
    }

    public Speakers build() {
      return Speakers.this;
    }
  }
}
