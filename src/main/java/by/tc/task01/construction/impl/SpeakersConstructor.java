package by.tc.task01.construction.impl;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

import by.tc.task01.construction.ConstructorApp;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import java.util.Map;

public final class SpeakersConstructor implements ConstructorApp {
  private static Appliance appliance;

  @Override
  public Appliance constructAppliance(Map<String, Object> map, Criteria criteria) {
      appliance = Speakers.newBuilder()
          .setID(parseInt((String) map.get(SearchCriteria.Speakers.ID.toString())))
          .setSellingPrice(parseDouble((String) map.get(SearchCriteria.Speakers.SELLING_PRICE.toString())))
          .setQuantity(parseInt((String) map.get(SearchCriteria.Speakers.QUANTITY.toString())))
          .setPowerConsumption(parseInt((String) map.get(SearchCriteria.Speakers.POWER_CONSUMPTION.toString())))
          .setNumberOfSpeakers(parseInt((String) map.get(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString())))
          .setFrequencyRange((String) map.get(SearchCriteria.Speakers.FREQUENCY_RANGE.toString()))
          .setCordLength(parseInt((String) map.get(SearchCriteria.Speakers.CORD_LENGTH.toString())))
          .build();
    return appliance;
  }
}
