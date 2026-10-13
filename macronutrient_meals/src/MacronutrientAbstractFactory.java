import carbs.CarbsFactory;
import fats.FatsFactory;
import food.*;
import protein.ProteinFactory;

public class MacronutrientAbstractFactory {
	// Singleton
	private static MacronutrientAbstractFactory instance;

	private MacronutrientAbstractFactory() {}

	public static MacronutrientAbstractFactory getInstance() {
		if (instance == null) {
			instance = new MacronutrientAbstractFactory();
		}
		return instance;
	}

	public FoodFactory getFactory(String type) {
        return switch (type.toLowerCase()) {
            case "carbs" -> CarbsFactory.getInstance();
            case "protein" -> ProteinFactory.getInstance();
            case "fats" -> FatsFactory.getInstance();
            default -> null;
        };
	}
}
