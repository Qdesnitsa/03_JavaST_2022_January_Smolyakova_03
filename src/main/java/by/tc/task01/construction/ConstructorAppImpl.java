package by.tc.task01.construction;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import java.util.Map;

public final class ConstructorAppImpl implements ConstructorApp {

  private ConstructorAppImpl() {
  }

  private static Appliance appliance;
  private static final ConstructorAppImpl instance = new ConstructorAppImpl();

  public static ConstructorAppImpl getInstance() {
    return instance;
  }

  @Override
  public Appliance constructOven(Map<String, Object> map, Criteria criteria) {
    if (Oven.class.getSimpleName().equals(criteria.getGroupSearchName())) {
      appliance = Oven.newBuilder()
          .setPowerConsumption(
              parseInt((String) map.get(SearchCriteria.Oven.POWER_CONSUMPTION.toString())))
          .setWeight(parseInt((String) map.get(SearchCriteria.Oven.WEIGHT.toString())))
          .setCapacity(parseInt((String) map.get(SearchCriteria.Oven.CAPACITY.toString())))
          .setDepth(parseInt((String) map.get(SearchCriteria.Oven.DEPTH.toString())))
          .setHeight(parseInt((String) map.get(SearchCriteria.Oven.HEIGHT.toString())))
          .setWidth(parseInt((String) map.get(SearchCriteria.Oven.WIDTH.toString())))
          .build();
    }
    return appliance;
  }

  @Override
  public Appliance constructTabletPC(Map<String, Object> map, Criteria criteria) {
    if (TabletPC.class.getSimpleName().equals(criteria.getGroupSearchName())) {
      appliance = TabletPC.newBuilder()
          .setBatteryCapacity(
              parseInt((String) map.get(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString())))
          .setDisplayInches(
              parseInt((String) map.get(SearchCriteria.TabletPC.DISPLAY_INCHES.toString())))
          .setMemoryRom(parseInt((String) map.get(SearchCriteria.TabletPC.MEMORY_ROM.toString())))
          .setFlashMemoryCapacity(
              parseInt((String) map.get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString())))
          .setColor((String) map.get(SearchCriteria.TabletPC.COLOR.toString()))
          .build();
    }
    return appliance;
  }

  @Override
  public Appliance constructLaptop(Map<String, Object> map, Criteria criteria) {
    if (Laptop.class.getSimpleName().equals(criteria.getGroupSearchName())) {
      appliance = Laptop.newBuilder()
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
    }
    return appliance;
  }

  @Override
  public Appliance constructRefrigerator(Map<String, Object> map, Criteria criteria) {
    if (Refrigerator.class.getSimpleName().equals(criteria.getGroupSearchName())) {
      //...
    }
    return appliance;
  }

  @Override
  public Appliance constructSpeakers(Map<String, Object> map, Criteria criteria) {
    if (Speakers.class.getSimpleName().equals(criteria.getGroupSearchName())) {
      //...
    }
    return appliance;
  }

  @Override
  public Appliance constructVacuumCleaner(Map<String, Object> map, Criteria criteria) {
    if (VacuumCleaner.class.getSimpleName().equals(criteria.getGroupSearchName())) {
      //...
    }
    return appliance;
  }
}


