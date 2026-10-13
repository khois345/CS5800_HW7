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
		switch (type.toLowerCase()) {
			case "cheese":
				return new Cheese();
			case "bread":
				return new Bread();
			case "lentils":
				return new Lentils();
			case "pistachio":
				return new Pistachio();
			default:
				return null;
		}
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
