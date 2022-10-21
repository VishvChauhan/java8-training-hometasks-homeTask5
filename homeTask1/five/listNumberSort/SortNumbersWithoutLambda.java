package five.listNumberSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortNumbersWithoutLambda implements Comparator<Integer> {

	public static void sortList() {
		List<Integer> lst = new ArrayList<>();
		lst.add(222);
		lst.add(100);
		lst.add(535);
		lst.add(341);
		lst.add(197);
		lst.add(446);

		System.out.println("Before Sort: " + lst);
		// Default Sort: Ascending
		Collections.sort(lst);
		System.out.println("After Sort: " + lst);
		// Descending sort with comparator interface
		Collections.sort(lst, new SortNumbersWithoutLambda());
		System.out.println("Descending Order: " + lst);
	}

	public static void main(String[] args) {
		sortList();
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1 < o2) {
			return 1;
		} else if (o1 > o2) {
			return -1;
		} else {
			return 0;
		}
	}

}
