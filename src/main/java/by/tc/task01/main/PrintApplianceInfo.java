package by.tc.task01.main;

import by.tc.task01.entity.Appliance;
import java.lang.reflect.Field;
import java.util.List;

public class PrintApplianceInfo {
	private static Field[] fields;
	private static String numberOfItems = "Number of items available: ";
	private static String available = "-> is available.\n";
	private static String notAvailable = "Appliance is not available.\n";

	public static void print(List<Appliance> appliance) throws IllegalAccessException {
		if (!appliance.isEmpty()) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(numberOfItems).append(appliance.size()).append("\n");
			for (Appliance elem : appliance) {
				fields = elem.getClass().getDeclaredFields();
				stringBuilder.append(elem.getClass().getSimpleName()).append(": ");
				for (Field field : fields) {
					field.setAccessible(true);
					stringBuilder.append(field.getName()).append("=").append(field.get(elem)).append(" ");
				}
				stringBuilder.append(available);
			}
			System.out.println(stringBuilder);
		} else {
			System.out.println(notAvailable);
		}
	}
}
