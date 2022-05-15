package by.tc.task01.main;

import by.tc.task01.entity.Appliance;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class PrintApplianceInfo {

	private PrintApplianceInfo(){}

	private static String available = " -> is available.";
	private static String notAvailable = "Appliance is not available.";
	public static void print(List<Appliance> appliance) {
		if (appliance.stream()
				.flatMap(s -> Stream.ofNullable(s))
				.peek(app -> System.out.println(app + available))
				.collect(Collectors.toList())
				.isEmpty()) {
			System.out.println(notAvailable);
		}
	}
}
