import food.*;

public class Meal {
	private Food carbs;
	private Food protein;
	private Food fats;

	public Meal(Food carbs, Food protein, Food fats) {
		this.carbs = carbs;
		this.protein = protein;
		this.fats = fats;
	}

	public Food getCarbs() {
		return carbs;
	}

	public Food getProtein() {
		return protein;
	}

	public Food getFats() {
		return fats;
	}

	public void print() {
		System.out.println("Meal:");
		System.out.println("- Carbs: " + carbs.getName());
		System.out.println("- Protein: " + protein.getName());
		System.out.println("- Fats: " + fats.getName());
	}
}
