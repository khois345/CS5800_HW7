import java.util.ArrayList;

public class Pizza {
	private String chain;
	private String size;
	private ArrayList<String> toppings;

	private Pizza(Builder builder) {
		this.chain = builder.chain;
		this.size = builder.size;
		this.toppings = builder.toppings;
	}


	public String getChain() {
		return chain;
	}

	public String getSize() {
		return size;
	}

	public ArrayList<String> getToppings() {
		return toppings;
	}
	

	public void eat() {
		System.out.println("Pizza chain: " + chain);
		System.out.println("Size: " + size);
		System.out.println("Toppings:");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("  " + (i + 1) + ". " + toppings.get(i));
		}
	}
	

	public static class Builder {
		private String chain;
		private String size;
		private ArrayList<String> toppings;

		public Builder(String chain, String size) {
			setChain(chain);
			setSize(size);
			this.toppings = new ArrayList<>();
		}


		private void setChain(String chain) {
			if (chain == null || chain.isEmpty()) {
				System.err.println("Pizza chain cannot be blank");
				return;
			}
			this.chain = chain;
		}

		private void setSize(String size) {
			if (size == null || !(size.equalsIgnoreCase("Small") || size.equalsIgnoreCase("Medium") || size.equalsIgnoreCase("Large"))) {
				System.err.println("Pizza size must be either Small, Medium or Large");
				return;
			}
			// Capitalize the first letter only
			this.size = size.substring(0, 1).toUpperCase() + size.substring(1).toLowerCase();
		}


		// Toppings
		public Builder addPepperoni() {
			return addTopping("Pepperoni");
		}

		public Builder addPeppers() {
			return addTopping("Peppers");
		}

		public Builder addHam() {
			return addTopping("Ham");
		}

		public Builder addSausage() {
			return addTopping("Sausage");
		}

		public Builder addChicken() {
			return addTopping("Chicken");
		}

		public Builder addPesto() {
			return addTopping("Pesto");
		}

		public Builder addMushrooms() {
			return addTopping("Mushrooms");
		}

		public Builder addOlives() {
			return addTopping("Olives");
		}

		public Builder addSpicyPork() {
			return addTopping("Spicy Pork");
		}

		public Builder addBacon() {
			return addTopping("Bacon");
		}

		public Builder addSpinach() {
			return addTopping("Spinach");
		}

		public Builder addHamAndPineapple() {
			return addTopping("Ham and Pineapple");
		}

		public Builder addOnions() {
			return addTopping("Onions");
		}

		public Builder addTomatoAndBasil() {
			return addTopping("Tomato and Basil");
		}

		public Builder addExtraCheese() {
			return addTopping("Extra Cheese");
		}

		public Builder addBeef() {
			return addTopping("Beef");
		}


		// builder's functions
		private Builder addTopping(String topping) {
			if (toppings.contains(topping)) {
				System.err.println(topping + " is already on the pizza");
				return this;
			}
			toppings.add(topping);
			return this;
		}

		public Pizza build() {
			if (chain == null || size == null) {
				System.err.println("Cannot build pizza without a chain and size");
				return null;
			}
			return new Pizza(this);
		}
	}
}
