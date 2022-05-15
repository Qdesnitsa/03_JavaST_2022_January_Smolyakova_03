package by.tc.task01.construction.impl;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

import by.tc.task01.construction.ConstructorApp;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import java.util.Map;

public final class RefrigeratorConstructor implements ConstructorApp {
  private static Appliance appliance;

  @Override
  public Appliance constructAppliance(Map<String, Object> map, Criteria criteria) {
      appliance = Refrigerator.newBuilder()
          .setID(parseInt((String) map.get(SearchCriteria.Refrigerator.ID.toString())))
          .setSellingPrice(parseDouble((String) map.get(SearchCriteria.Refrigerator.SELLING_PRICE.toString())))
          .setQuantity(parseInt((String) map.get(SearchCriteria.Refrigerator.QUANTITY.toString())))
          .setPowerConsumption(parseInt((String) map.get(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString())))
          .setWeight(parseInt((String) map.get(SearchCriteria.Refrigerator.WEIGHT.toString())))
          .setFreezerCapacity(parseInt((String) map.get(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString())))
          .setOverallCapacity(parseDouble((String) map.get(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString())))
          .setHeight(parseInt((String) map.get(SearchCriteria.Refrigerator.HEIGHT.toString())))
          .setWidth(parseInt((String) map.get(SearchCriteria.Refrigerator.WIDTH.toString())))
          .build();
    return appliance;
  }
}
