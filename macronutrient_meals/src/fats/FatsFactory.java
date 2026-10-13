package fats;

import java.util.ArrayList;

import food.*;

public class FatsFactory extends FoodFactory {
	// Singleton
	private static FatsFactory instance;

	private FatsFactory() {}

	public static FatsFactory getInstance() {
		if (instance == null) {
			instance = new FatsFactory();
		}
		return instance;
	}

	public Fats getFats(String type) {
        return switch (type.toLowerCase()) {
            case "avocado" -> new Avocado();
            case "sour cream" -> new SourCream();
            case "tuna" -> new Tuna();
            case "peanuts" -> new Peanuts();
            default -> null;
        };
	}

	@Override
	public Fats create(String dietPlan) {
		return getFats(selectRandom(getDietOptions(dietPlan)));
	}

	@Override
	protected ArrayList<String> getDietOptions(String dietPlan) {
		ArrayList<String> fats = new ArrayList<>();

		switch (dietPlan.toLowerCase()) {
			case "paleo":
				fats.add("Avocado");
				fats.add("Tuna");
				fats.add("Peanuts");
				break;
			case "vegan":
				fats.add("Avocado");
				fats.add("Peanuts");
				break;
			case "nut allergy":
				fats.add("Avocado");
				fats.add("Sour Cream");
				fats.add("Tuna");
				break;
			case "no restriction":
			default:
				fats.add("Avocado");
				fats.add("Sour Cream");
				fats.add("Tuna");
				fats.add("Peanuts");
				break;
		}
		return fats;
	}
}
