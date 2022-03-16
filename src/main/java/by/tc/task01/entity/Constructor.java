package by.tc.task01.entity;

import static java.lang.Integer.parseInt;

import java.util.Map;

public class Constructor {

  public static Appliance constructOven(Map<String,Object> map) {
    Oven oven = Oven.newBuilder()
        .setPowerConsumption(parseInt((String) map.get("POWER_CONSUMPTION")))
        .setWeight(parseInt((String) map.get("WEIGHT")))
        .setCapacity(parseInt((String) map.get("CAPACITY")))
        .setDepth(parseInt((String) map.get("DEPTH")))
        .setHeight(parseInt((String) map.get("HEIGHT")))
        .setWidth(parseInt((String) map.get("WIDTH")))
        .build();
    return oven;
  }

}
