package by.tc.task01.entity;

import java.util.Objects;

public class Speakers extends Appliance{
  private String POWER_CONSUMPTION;
  private String NUMBER_OF_SPEAKERS;
  private String FREQUENCY_RANGE;
  private String CORD_LENGTH;

  public Speakers(String[] resource) {
    this.POWER_CONSUMPTION = resource[2];
    this.NUMBER_OF_SPEAKERS = resource[4];
    this.FREQUENCY_RANGE = resource[6];
    this.CORD_LENGTH = resource[8];
  }

  public String getPOWER_CONSUMPTION() {
    return POWER_CONSUMPTION;
  }

  public void setPOWER_CONSUMPTION(String POWER_CONSUMPTION) {
    this.POWER_CONSUMPTION = POWER_CONSUMPTION;
  }

  public String getNUMBER_OF_SPEAKERS() {
    return NUMBER_OF_SPEAKERS;
  }

  public void setNUMBER_OF_SPEAKERS(String NUMBER_OF_SPEAKERS) {
    this.NUMBER_OF_SPEAKERS = NUMBER_OF_SPEAKERS;
  }

  public String getFREQUENCY_RANGE() {
    return FREQUENCY_RANGE;
  }

  public void setFREQUENCY_RANGE(String FREQUENCY_RANGE) {
    this.FREQUENCY_RANGE = FREQUENCY_RANGE;
  }

  public String getCORD_LENGTH() {
    return CORD_LENGTH;
  }

  public void setCORD_LENGTH(String CORD_LENGTH) {
    this.CORD_LENGTH = CORD_LENGTH;
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
    return Objects.equals(POWER_CONSUMPTION, speakers.POWER_CONSUMPTION)
        && Objects.equals(NUMBER_OF_SPEAKERS, speakers.NUMBER_OF_SPEAKERS)
        && Objects.equals(FREQUENCY_RANGE, speakers.FREQUENCY_RANGE)
        && Objects.equals(CORD_LENGTH, speakers.CORD_LENGTH);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, FREQUENCY_RANGE,
        CORD_LENGTH);
  }

  @Override
  public String toString() {
    return "Speakers{" +
        "powerConsumption='" + POWER_CONSUMPTION + '\'' +
        ", numberOfSpeakers='" + NUMBER_OF_SPEAKERS + '\'' +
        ", frequencyRange='" + FREQUENCY_RANGE + '\'' +
        ", cordLength='" + CORD_LENGTH + '\'' +
        '}';
  }
}
