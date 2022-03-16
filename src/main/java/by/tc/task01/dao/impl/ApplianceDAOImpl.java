package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class ApplianceDAOImpl implements ApplianceDAO {

	private static final String APPS_FILE = "appliances_db.txt";
	BufferedReader reader;

	@Override
	public List<Appliance> find(Criteria criteria) {
		Map<String, Object> map;
		String filePath = Objects.requireNonNull(getClass().getClassLoader().getResource(APPS_FILE))
				.getPath();

		List<Appliance> appliances = new ArrayList<>();

		try {
			File file = new File(filePath);
			FileReader fr = new FileReader(file);
			reader = new BufferedReader(fr);
			String line;
			while (reader.ready()) {
				line = reader.readLine();
				map = makeMap(line,criteria);
					if (!map.isEmpty()) {
						int count = 0;
						for (Entry<String, Object> entry : criteria.getCriteria().entrySet()) {
							for (Entry<String, Object> elem : map.entrySet()) {
								if ((entry.getKey().equals(elem.getKey())) && (entry.getValue().toString()
										.equalsIgnoreCase(String.valueOf(elem.getValue())))
										&& (++count == criteria.getCriteria().size()))
									initAppliance(map,appliances,criteria);
						}
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return appliances;
	}

	public Map<String,Object> makeMap(String line, Criteria criteria) {
	Map<String,Object> map = new HashMap<>();
		String[] parameters = line.replaceAll("(;|:|=|,|\\s+){1,}", " ").split(" ");
		if (criteria.getGroupSearchName().equals(parameters[0])) {
			for (int i = 1; i < parameters.length; i += 2) {
				map.put(parameters[i], parameters[i + 1]);
			}
		}
		return map;
	}

	public List<Appliance> initAppliance(Map<String,Object> map,List<Appliance> appliances, Criteria criteria) {
		switch (criteria.getGroupSearchName()) {
			case "Oven":
				appliances.add(Constructor.constructOven(map));
				break;
//			case "Laptop":
//				appliances.add(new Laptop(parameters));
//				break;
//			case "Refrigerator":
//				appliances.add(new Refrigerator(parameters));
//				break;
//			case "Speakers":
//				appliances.add(new Speakers(parameters));
//				break;
//			case "TabletPC":
//				appliances.add(new TabletPC(parameters));
//				break;
//			case "VacuumCleaner":
//				appliances.add(new VacuumCleaner(parameters));
//				break;
		}
		return appliances;
	}
}