package by.tc.task01.construction.impl;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

import by.tc.task01.construction.ConstructorApp;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import java.util.Map;

public final class TabletPCConstructor implements ConstructorApp {
  private static Appliance appliance;

  @Override
  public Appliance constructAppliance(Map<String, Object> map, Criteria criteria) {
    appliance = TabletPC.newBuilder()
        .setID(parseInt((String) map.get(SearchCriteria.TabletPC.ID.toString())))
        .setSellingPrice(
            parseDouble((String) map.get(SearchCriteria.TabletPC.SELLING_PRICE.toString())))
        .setQuantity(parseInt((String) map.get(SearchCriteria.TabletPC.QUANTITY.toString())))
        .setBatteryCapacity(
            parseInt((String) map.get(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString())))
        .setDisplayInches(
            parseInt((String) map.get(SearchCriteria.TabletPC.DISPLAY_INCHES.toString())))
        .setMemoryRom(parseInt((String) map.get(SearchCriteria.TabletPC.MEMORY_ROM.toString())))
        .setFlashMemoryCapacity(
            parseInt((String) map.get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString())))
        .setColor((String) map.get(SearchCriteria.TabletPC.COLOR.toString()))
        .build();
    return appliance;
  }
}
