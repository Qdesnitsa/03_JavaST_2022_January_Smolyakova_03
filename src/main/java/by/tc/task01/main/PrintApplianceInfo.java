package by.tc.task01.main;

import by.tc.task01.entity.Appliance;
import java.lang.reflect.Field;
import java.util.List;

public class PrintApplianceInfo {
	private static Field[] fields;

	public static void print(List<Appliance> appliance) throws IllegalAccessException {
		if (!appliance.isEmpty()) {
			StringBuilder stringBuilder = new StringBuilder();
			for (Appliance elem : appliance) {
				fields = elem.getClass().getDeclaredFields();
				stringBuilder.append(elem.getClass().getSimpleName()).append(": ");
				for (Field field : fields) {
					field.setAccessible(true);
					stringBuilder.append(field.getName()).append("=").append(field.get(elem)).append(" ");
				}
				stringBuilder.append("-> is available.\n");
			}
			System.out.println(stringBuilder);
		} else {
			System.out.println("Appliance is not available.");
		}
	}
}
