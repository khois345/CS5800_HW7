package carbs;

import java.util.ArrayList;

import food.*;

public class CarbsFactory extends FoodFactory {
	// Singleton
	private static CarbsFactory instance;

	private CarbsFactory() {}

	public static CarbsFactory getInstance() {
		if (instance == null) {
			instance = new CarbsFactory();
		}
		return instance;
	}

	public Carbs getCarbs(String type) {
        return switch (type.toLowerCase()) {
            case "cheese" -> new Cheese();
            case "bread" -> new Bread();
            case "lentils" -> new Lentils();
            case "pistachio" -> new Pistachio();
            default -> null;
        };
	}

	@Override
	public Carbs create(String dietPlan) {
		return getCarbs(selectRandom(getDietOptions(dietPlan)));
	}

	@Override
	protected ArrayList<String> getDietOptions(String dietPlan) {
		ArrayList<String> carbs = new ArrayList<>();

		switch (dietPlan.toLowerCase()) {
			case "paleo":
				carbs.add("Pistachio");
				break;
			case "vegan":
				carbs.add("Bread");
				carbs.add("Lentils");
				carbs.add("Pistachio");
				break;
			case "nut allergy":
				carbs.add("Cheese");
				carbs.add("Bread");
				carbs.add("Lentils");
				break;
			case "no restriction":
			default:
				carbs.add("Cheese");
				carbs.add("Bread");
				carbs.add("Lentils");
				carbs.add("Pistachio");
				break;
		}
		return carbs;
	}
}
