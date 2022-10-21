package seven.setNumberSort;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetNumberSortWithLambda {

	public static void main(String[] args) {
		Comparator<Integer> compare = (i, j) -> {
			if (i < j) {
				return 1;
			} else if (i > j) {
				return -1;
			} else {
				return 0;
			}

		};
		
		Set<Integer> nums = new TreeSet<Integer>(compare);
		nums.add(3434);
		nums.add(7573);
		nums.add(9638);
		nums.add(5370);
		nums.add(1213);
		nums.add(5577);
		nums.add(8780);
		nums.add(4221);
		System.out.println("The values present in the Tree Set with Reverse Order: ");
		System.out.println(nums);
		

	}

}
