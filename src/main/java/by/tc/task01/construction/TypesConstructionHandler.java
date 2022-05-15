package by.tc.task01.construction;

import by.tc.task01.construction.impl.LaptopConstructor;
import by.tc.task01.construction.impl.OvenConstructor;
import by.tc.task01.construction.impl.RefrigeratorConstructor;
import by.tc.task01.construction.impl.SpeakersConstructor;
import by.tc.task01.construction.impl.TabletPCConstructor;
import by.tc.task01.construction.impl.VacuumCleanerConstructor;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;
import java.util.HashMap;
import java.util.Map;

public class TypesConstructionHandler {
  private Map<String, Object> properAppCreation;

  public TypesConstructionHandler() {
    properAppCreation = new HashMap<>();
    {
      properAppCreation.put(Oven.class.getSimpleName(),new OvenConstructor());
      properAppCreation.put(TabletPC.class.getSimpleName(),new TabletPCConstructor());
      properAppCreation.put(Laptop.class.getSimpleName(),new LaptopConstructor());
      properAppCreation.put(Refrigerator.class.getSimpleName(),new RefrigeratorConstructor());
      properAppCreation.put(Speakers.class.getSimpleName(),new SpeakersConstructor());
      properAppCreation.put(VacuumCleaner.class.getSimpleName(),new VacuumCleanerConstructor());
    }
  }

  public ConstructorApp getType(String someClass) {
    return (ConstructorApp) properAppCreation.get(someClass);
  }

}
