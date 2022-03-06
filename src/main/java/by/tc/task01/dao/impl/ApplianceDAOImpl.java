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

public class ApplianceDAOImpl implements ApplianceDAO {

	@Override
	public List<Appliance> find(Criteria criteria) {
		Map<String, Object> map = new HashMap<>();
		// you may add your own code here
		String filePath = "./src/main/resources/appliances_db.txt";

		List<Appliance> appliances = new ArrayList<>();
		try {
			File file = new File(filePath);
			FileReader fr = new FileReader(file);
			BufferedReader reader = new BufferedReader(fr);
			String line;
			while (reader.ready()) {
				line = reader.readLine();
				String[] parameters = line.replaceAll("(;|:|=|,|\\s+){1,}", " ").split(" ");
				if (criteria.getGroupSearchName().equals(parameters[0])) {
					for (int i = 1; i < parameters.length; i += 2) {
						map.put(parameters[i], parameters[i + 1]);
					}
					if (!map.isEmpty()) {
						int count = 0;
						for (Entry<String, Object> entry : criteria.getCriteria().entrySet()) {
							for (Entry<String, Object> elem : map.entrySet()) {
								if ((entry.getKey().equals(elem.getKey())) && (entry.getValue()
										.equals(elem.getValue())) && (++count == criteria.getCriteria().size())) {
									switch (criteria.getGroupSearchName()) {
										case "Oven":
											appliances.add(
													new Oven(parameters[2], parameters[4], parameters[6], parameters[8],
															parameters[10], parameters[12]));
											break;
										case "Laptop":
											appliances.add(
													new Laptop(parameters[2], parameters[4], parameters[6], parameters[8],
															parameters[10], parameters[12]));
											break;
										case "Refrigerator":
											appliances.add(new Refrigerator(parameters[2], parameters[4], parameters[6],
													parameters[8], parameters[10], parameters[12]));
											break;
										case "Speakers":
											appliances.add(
													new Speakers(parameters[2], parameters[4], parameters[6], parameters[8]));
											break;
										case "TabletPC":
											appliances.add(
													new TabletPC(parameters[2], parameters[4], parameters[6], parameters[8],
															parameters[10]));
											break;
										case "VacuumCleaner":
											appliances.add(new VacuumCleaner(parameters[2], parameters[4], parameters[6],
													parameters[8], parameters[10], parameters[12]));
											break;
									}
								}
							}
						}
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return appliances;
	}
}