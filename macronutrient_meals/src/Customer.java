import food.*;

public class Customer {
	private static final String[] DIET_PLANS = {
		"No Restriction",
		"Paleo",
		"Vegan",
		"Nut Allergy"
	};

	private String name;
	private String dietPlan;
	private Meal meal;

	public Customer(String name, String dietPlan) {
		setName(name);
		setDietPlan(dietPlan);
	}

	public String getName() {
		return name;
	}

	public String getDietPlan() {
		return dietPlan;
	}

	public Meal getMeal() {
		return meal;
	}

	public void setName(String name) {
		if (name == null || name.isEmpty()) {
			System.err.println("Customer name cannot be blank");
			return;
		}

		this.name = name;
	}

	public void setDietPlan(String dietPlan) {
		if (dietPlan != null) {
			for (String plan : DIET_PLANS) {
				if (plan.equalsIgnoreCase(dietPlan)) {
					this.dietPlan = plan;
					return;
				}
			}
		}

		System.err.println("Diet plan must be either No Restriction, Paleo, Vegan or Nut Allergy");
	}

	public void orderMeal() {
		if (dietPlan == null) {
			System.err.println("Cannot order a meal without a valid diet plan");
			return;
		}

		MacronutrientAbstractFactory macronutrientAbstractFactory = MacronutrientAbstractFactory.getInstance();
		Food carbs = macronutrientAbstractFactory.getFactory("Carbs").create(dietPlan);
		Food protein = macronutrientAbstractFactory.getFactory("Protein").create(dietPlan);
		Food fats = macronutrientAbstractFactory.getFactory("Fats").create(dietPlan);

		meal = new Meal(carbs, protein, fats);
	}

	public void print() {
		System.out.println("Customer: " + name);
		System.out.println("Diet plan: " + dietPlan);

		if (meal == null) {
			System.out.println("No meal ordered!");
			return;
		}

		meal.print();
	}
}
