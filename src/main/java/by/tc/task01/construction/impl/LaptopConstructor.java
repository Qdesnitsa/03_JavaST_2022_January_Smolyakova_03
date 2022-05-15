package by.tc.task01.construction.impl;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

import by.tc.task01.construction.ConstructorApp;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import java.util.Map;

public final class LaptopConstructor implements ConstructorApp {
  private static Appliance appliance;

  @Override
  public Appliance constructAppliance(Map<String, Object> map, Criteria criteria) {
      appliance = Laptop.newBuilder()
          .setID(parseInt((String) map.get(SearchCriteria.Laptop.ID.toString())))
          .setSellingPrice(parseDouble((String) map.get(SearchCriteria.Laptop.SELLING_PRICE.toString())))
          .setQuantity(parseInt((String) map.get(SearchCriteria.Laptop.QUANTITY.toString())))
          .setBatteryCapacity(
              parseDouble((String) map.get(SearchCriteria.Laptop.BATTERY_CAPACITY.toString())))
          .setOS((String) map.get(SearchCriteria.Laptop.OS.toString()))
          .setMemoryRom(parseInt((String) map.get(SearchCriteria.Laptop.MEMORY_ROM.toString())))
          .setSystemMemory(
              parseInt((String) map.get(SearchCriteria.Laptop.SYSTEM_MEMORY.toString())))
          .setCPU(parseDouble((String) map.get(SearchCriteria.Laptop.CPU.toString())))
          .setDisplayInches(
              parseInt((String) map.get(SearchCriteria.Laptop.DISPLAY_INCHES.toString())))
          .build();
    return appliance;
  }
}
