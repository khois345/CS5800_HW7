public class initMeal {

	public static void main(String[] args) {
		Customer[] customers = {
			new Customer("Khoi", "No Restriction"),
			new Customer("Emily", "Paleo"),
			new Customer("Tam", "Vegan"),
			new Customer("Chloe", "Nut Allergy"),
			new Customer("George", "Paleo"),
			new Customer("Sophie", "Vegan")
		};

		for (Customer customer : customers) {
			customer.orderMeal();
			customer.print();
			System.out.println();
		}
	}
}
