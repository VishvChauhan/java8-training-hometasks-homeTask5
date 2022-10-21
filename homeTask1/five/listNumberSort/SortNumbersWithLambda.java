package five.listNumberSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortNumbersWithLambda {

	public static void sortList() {
		List<Integer> lst = new ArrayList<>();
		lst.add(25);
		lst.add(10);
		lst.add(53);
		lst.add(34);
		lst.add(19);
		lst.add(49);

		System.out.println("Before Sort: " + lst);
		// Default Sort: Ascending
		Collections.sort(lst);
		System.out.println("After Sort: " + lst);
		// Descending sort with comparator interface
		Comparator<Integer> cmp = (i, j) -> {
			if (i < j) {
				return 1;
			} else if (i > j) {
				return -1;
			} else {
				return 0;
			}
		};
		Collections.sort(lst, cmp);
		System.out.println("Descending Order: " + lst);
	}

	public static void main(String[] args) {
		sortList();
	}

}
