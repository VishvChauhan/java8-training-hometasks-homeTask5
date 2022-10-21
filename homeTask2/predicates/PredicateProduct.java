package predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

import preconditions.Product;

public class PredicateProduct {

	/**
	 * Method to display the list of products whose value is greater than 1000
	 * 
	 * @param prodList
	 * @author Chauhan
	 */
	public static void productPriceGreaterThanThousand(ArrayList<Product> prodList) {
		System.out.println("List of Products whose value is greater than 1000: ");
		Predicate<Product> p = i -> i.getPrice() > 1000;
		for (Product prod : prodList) {
			if (p.test(prod)) {
				System.out.print(prod.getName() + "	|");
			}
		}

	}

	/**
	 * Method to display the List of Products in Electronics category
	 * 
	 * @param prodList
	 * @author Chauhan
	 */
	public static void productsWithElectronicsCategory(ArrayList<Product> prodList) {
		System.out.println("");
		System.out.println("List of Products whose category is Electronics: ");
		Predicate<Product> p = i -> i.getCategory().equalsIgnoreCase("Electronics");
		for (Product prod : prodList) {
			if (p.test(prod)) {
				System.out.print(prod.getName() + "	|");
			}
		}

	}

	/**
	 * Method to display the List of Products in Electronics category with price >
	 * 100
	 * 
	 * @param prodList
	 * @author Chauhan
	 */
	public static void electronicProductsGreaterThanHundred(ArrayList<Product> prodList) {
		System.out.println("");
		System.out.println("List of Products whose category is Electronics AND price > 100: ");
		Predicate<Product> p1 = i -> i.getPrice() > 100;
		Predicate<Product> p2 = i -> i.getCategory().equalsIgnoreCase("Electronics");
		for (Product prod : prodList) {
			if (p1.and(p2).test(prod)) {
				System.out.print(prod.getName() + "	|");
			}
		}

	}

	/**
	 * Method to display the List of Products in either Electronics category or with
	 * price > 100
	 * 
	 * @param prodList
	 * @author Chauhan
	 */
	public static void electronicProductsOrGreaterThanHundred(ArrayList<Product> prodList) {
		System.out.println("");
		System.out.println("List of Products whose category is Electronics OR price > 100: ");
		Predicate<Product> p1 = i -> i.getPrice() > 100;
		Predicate<Product> p2 = i -> i.getCategory().equalsIgnoreCase("Electronics");
		for (Product prod : prodList) {
			if (p1.or(p2).test(prod)) {
				System.out.print(prod.getName() + "	|");
			}
		}

	}

	/**
	 * Method to display the List of Products in Electronics category with price >
	 * 100
	 * 
	 * @param prodList
	 * @author Chauhan
	 */
	public static void electronicProductsLessThanHundred(ArrayList<Product> prodList) {
		System.out.println("");
		System.out.println("List of Products whose category is Electronics AND price > 100: ");
		Predicate<Product> p1 = i -> i.getPrice() < 100;
		Predicate<Product> p2 = i -> i.getCategory().equalsIgnoreCase("Electronics");
		for (Product prod : prodList) {
			if (p1.and(p2).test(prod)) {
				System.out.print(prod.getName() + "	|");
			}
		}

	}

	public static void main(String[] args) {

		ArrayList<Product> prod = new ArrayList<>();

		prod.add(new Product("Dell Inspiron Laptop", 85000, "Electronics", "A1"));
		prod.add(new Product("Wipro LED", 80, "Electronics", "A"));
		prod.add(new Product("Damro Workstation", 30000, "Furniture", "B"));
		prod.add(new Product("Anchor Junction Box", 1000, "Electronics", "A1"));
		prod.add(new Product("Laptop Heat Pad", 500, "Misc Accessories", "B"));
		prod.add(new Product("Beats Headset", 5000, "Electronics", "A1"));
		prod.add(new Product("Samsung Mobile", 25000, "Electronics", "A"));

		// Task-1
		productPriceGreaterThanThousand(prod);

		// Task-2
		productsWithElectronicsCategory(prod);

		// Task-3
		electronicProductsGreaterThanHundred(prod);

		// Task-4
		electronicProductsOrGreaterThanHundred(prod);

		// Task-5
		electronicProductsLessThanHundred(prod);

	}

}
