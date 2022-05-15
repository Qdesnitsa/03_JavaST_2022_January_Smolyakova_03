package by.tc.task01.construction.impl;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

import by.tc.task01.construction.ConstructorApp;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import java.util.Map;

public final class OvenConstructor implements ConstructorApp {
  private static Appliance appliance;

  @Override
  public Appliance constructAppliance(Map<String, Object> map, Criteria criteria) {
    appliance = Oven.newBuilder()
        .setID(parseInt((String) map.get(SearchCriteria.Oven.ID.toString())))
        .setSellingPrice(
            parseDouble((String) map.get(SearchCriteria.Oven.SELLING_PRICE.toString())))
        .setQuantity(parseInt((String) map.get(SearchCriteria.Oven.QUANTITY.toString())))
        .setPowerConsumption(
            parseInt((String) map.get(SearchCriteria.Oven.POWER_CONSUMPTION.toString())))
        .setWeight(parseInt((String) map.get(SearchCriteria.Oven.WEIGHT.toString())))
        .setCapacity(parseInt((String) map.get(SearchCriteria.Oven.CAPACITY.toString())))
        .setDepth(parseInt((String) map.get(SearchCriteria.Oven.DEPTH.toString())))
        .setHeight(parseInt((String) map.get(SearchCriteria.Oven.HEIGHT.toString())))
        .setWidth(parseInt((String) map.get(SearchCriteria.Oven.WIDTH.toString())))
        .build();
    return appliance;
  }
}

