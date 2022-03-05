package by.tc.task01.dao;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WarehouseDAO {

  public static List<Appliance> readFile() {
    String separator = File.separator;
    String filePath = "./src/main/resources/appliances_db.txt";

    List<Appliance> appliances = new ArrayList<>();
    try {
      File file = new File(filePath);
      FileReader fr = new FileReader(file);
      BufferedReader reader = new BufferedReader(fr);
      String line;
      while (reader.ready()) {
        line = reader.readLine();
        String[] words = line.replaceAll("(;|:|=|,|\\s+){1,}", " ").split(" ");
        switch (words[0]) {
          case "Oven":
            appliances.add(new Oven(words[0], words[2], words[4], words[6], words[8], words[10], words[12]));
            break;
          case "Laptop":
            appliances.add(new Laptop(words[0], words[2], words[4], words[6], words[8], words[10], words[12]));
            break;
          case "Refrigerator":
            appliances.add(new Refrigerator(words[0], words[2], words[4], words[6], words[8], words[10], words[12]));
            break;
          case "Speakers":
            appliances.add(new Speakers(words[0], words[2], words[4], words[6], words[8]));
            break;
          case "TabletPC":
            appliances.add(new TabletPC(words[0], words[2], words[4], words[6], words[8], words[10]));
            break;
          case "VacuumCleaner":
            appliances.add(new VacuumCleaner(words[0], words[2], words[4], words[6], words[8], words[10], words[12]));
            break;
        }
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    for (Appliance str : appliances) {
      System.out.println(str);
    }
    return appliances;
  }


  public Appliance getAppliance(int index) {
    return getAppliance(index);
  }
}

