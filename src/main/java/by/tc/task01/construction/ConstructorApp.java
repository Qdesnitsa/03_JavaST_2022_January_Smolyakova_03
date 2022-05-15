package by.tc.task01.construction;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import java.util.Map;

public interface ConstructorApp {
  Appliance constructAppliance(Map<String,Object> map, Criteria criteria);
}
