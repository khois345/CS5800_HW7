public class initPizza {

	public static void main(String[] args) {
		// Part 1: 3, 6, and 9 topping pizzas
		System.out.println("Part 1: \n");

		Pizza smPizza = new Pizza.Builder("Pizza Hut", "Small")
			.addPepperoni()
			.addMushrooms()
			.addOnions()
			.build();

		Pizza mdPizza = new Pizza.Builder("Pizza Hut", "Medium")
			.addSausage()
			.addBacon()
			.addExtraCheese()
			.addPeppers()
			.addOlives()
			.addBeef()
			.build();

		Pizza lgPizza = new Pizza.Builder("Pizza Hut", "Large")
			.addPepperoni()
			.addSausage()
			.addMushrooms()
			.addChicken()
			.addSpinach()
			.addTomatoAndBasil()
			.addHam()
			.addPesto()
			.addBeef()
			.build();

		Pizza[] partOnePizzas = { smPizza, mdPizza, lgPizza };

		for (Pizza pizza : partOnePizzas) {
			if (pizza == null) {
				System.err.println("No pizzas given!\n");
				continue;
			}
			pizza.eat();
			System.out.println();
		}

		// Part 2: Pizza Hut, Little Caesars, and Dominos
		System.out.println("===================\nPart 2: \n");

		Pizza pizzaHutLgPizza = new Pizza.Builder("Pizza Hut", "Large")
			.addPepperoni()
			.addBacon()
			.addHam()
			.build();

		Pizza pizzaHutSmPizza = new Pizza.Builder("Pizza Hut", "Small")
			.addHamAndPineapple()
			.addExtraCheese()
			.build();

		Pizza littleCaesarsMdPizza = new Pizza.Builder("Little Caesars", "Medium")
			.addPepperoni()
			.addSausage()
			.addMushrooms()
			.addOnions()
			.addPeppers()
			.addTomatoAndBasil()
			.addBeef()
			.addHam()
			.build();

		Pizza littleCaesarsSmPizza = new Pizza.Builder("Little Caesars", "Small")
			.addChicken()
			.addBacon()
			.addOnions()
			.addTomatoAndBasil()
			.addPesto()
			.addExtraCheese()
			.build();

		Pizza dominosSmPizza = new Pizza.Builder("Dominos", "Small")
			.addPepperoni()
			.build();

		Pizza dominosLgPizza = new Pizza.Builder("Dominos", "Large")
			.addSpicyPork()
			.addOnions()
			.addMushrooms()
			.build();

			
		Pizza[] partTwoPizzas = {
			pizzaHutLgPizza,
			pizzaHutSmPizza,
			littleCaesarsMdPizza,
			littleCaesarsSmPizza,
			dominosSmPizza,
			dominosLgPizza
		};

		for (Pizza pizza : partTwoPizzas) {
			if (pizza == null) {
				System.err.println("No pizzas given!\n");
				continue;
			}
			pizza.eat();
			System.out.println();
		}
	}
}
