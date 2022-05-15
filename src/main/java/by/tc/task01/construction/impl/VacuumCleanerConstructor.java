package by.tc.task01.construction.impl;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

import by.tc.task01.construction.ConstructorApp;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import java.util.Map;

public final class VacuumCleanerConstructor implements ConstructorApp {
  private static Appliance appliance;

  @Override
  public Appliance constructAppliance(Map<String, Object> map, Criteria criteria) {
      appliance = VacuumCleaner.newBuilder()
          .setID(parseInt((String) map.get(SearchCriteria.VacuumCleaner.ID.toString())))
          .setSellingPrice(parseDouble((String) map.get(SearchCriteria.VacuumCleaner.SELLING_PRICE.toString())))
          .setQuantity(parseInt((String) map.get(SearchCriteria.VacuumCleaner.QUANTITY.toString())))
          .setPowerConsumption(parseInt((String) map.get(SearchCriteria.VacuumCleaner.ID.toString())))
          .setFilterType((String) map.get(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString()))
          .setBagType((String) map.get(SearchCriteria.VacuumCleaner.BAG_TYPE.toString()))
          .setWandType((String) map.get(SearchCriteria.VacuumCleaner.WAND_TYPE.toString()))
          .setMotorSpeedRegulation(parseInt((String) map.get(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString())))
          .setCleaningWidth(parseInt((String) map.get(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString())))
          .build();
    return appliance;
  }
}
