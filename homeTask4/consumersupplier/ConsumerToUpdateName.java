package consumersupplier;

import java.util.ArrayList;
import java.util.function.Consumer;

import preconditions.Product;

public class ConsumerToUpdateName {

	public static void main(String[] args) {

		ArrayList<Product> products = new ArrayList<Product>();

		products.add(new Product("Dell Inspiron Laptop", 85000, "Electronics", "A1"));
		products.add(new Product("Wipro LED", 80, "Electronics", "A"));
		products.add(new Product("Damro Workstation", 30000, "Furniture", "B"));
		products.add(new Product("Anchor Junction Box", 1000, "Electronics", "A1"));
		products.add(new Product("Laptop Heat Pad", 500, "Misc Accessories", "B"));
		products.add(new Product("Beats Headset", 5000, "Electronics", "A1"));
		products.add(new Product("Samsung Mobile", 25000, "Electronics", "A"));

		// Consumer to update the name of the product to be suffixed with '*' if the
		// price of product is > 3000/-.
		// Given the product list, update the name for each product and print all of the
		// products.

		Consumer<ArrayList<Product>> updateGrade = (prod) -> {
			for (Product pr : prod) {
				if (pr.getPrice() > 3000)
					pr.setName(pr.getName() + "*");
			}

			System.out.println(prod.toString());

		};

		updateGrade.accept(products);

	}

}
