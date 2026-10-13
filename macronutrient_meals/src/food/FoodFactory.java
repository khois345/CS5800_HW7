package food;

import java.util.ArrayList;
import java.util.Random;

public abstract class FoodFactory {
	private Random random = new Random();

	public abstract Food create(String dietPlan);

	protected String selectRandom(ArrayList<String> options) {
		return options.get(random.nextInt(options.size()));
	}
}
