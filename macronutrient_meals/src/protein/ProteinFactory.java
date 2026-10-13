package protein;

import java.util.ArrayList;

import food.*;

public class ProteinFactory extends FoodFactory {
	// Singleton
	private static ProteinFactory instance;

	private ProteinFactory() {}

	public static ProteinFactory getInstance() {
		if (instance == null) {
			instance = new ProteinFactory();
		}
		return instance;
	}

	public Protein getProtein(String type) {
        return switch (type.toLowerCase()) {
            case "fish" -> new Fish();
            case "chicken" -> new Chicken();
            case "beef" -> new Beef();
            case "tofu" -> new Tofu();
            default -> null;
        };
	}

	@Override
	public Protein create(String dietPlan) {
		return getProtein(selectRandom(getDietOptions(dietPlan)));
	}

	@Override
	protected ArrayList<String> getDietOptions(String dietPlan) {
		ArrayList<String> protein = new ArrayList<>();

		switch (dietPlan.toLowerCase()) {
			case "paleo":
				protein.add("Fish");
				protein.add("Chicken");
				protein.add("Beef");
				break;
			case "vegan":
				protein.add("Tofu");
				break;
			case "no restriction":
			case "nut allergy":
			default:
				protein.add("Fish");
				protein.add("Chicken");
				protein.add("Beef");
				protein.add("Tofu");
				break;
		}
		return protein;
	}
}
