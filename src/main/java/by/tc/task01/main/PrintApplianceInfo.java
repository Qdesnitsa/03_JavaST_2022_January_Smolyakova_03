package by.tc.task01.main;

import by.tc.task01.entity.Appliance;
import java.util.List;
import java.util.Map;

public class PrintApplianceInfo {
	
	public static void print(List<Appliance> appliance) {
		if (!appliance.isEmpty()) {
			StringBuilder stringBuilder = new StringBuilder();
			for (Appliance elem : appliance) {
				stringBuilder.append(elem.getClass().getSimpleName()).append(": ");
				for (Map.Entry<String,Object> param : elem.obtainParameters().entrySet()) {
					stringBuilder.append(param.getKey()).append("=").append(param.getValue()).append(" ");
				}
				stringBuilder.append("-> is available.\n");
			}
			System.out.println(stringBuilder);
		} else {
			System.out.println("Appliance is not available.");
		}
	}
}
