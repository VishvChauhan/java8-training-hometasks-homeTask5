package seven.setNumberSort;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetNumberSortWithoutLambda implements Comparator<Integer> {

	public static void main(String[] args) {
		
		Set<Integer> nums = new TreeSet<Integer>(new SetNumberSortWithoutLambda());
		nums.add(100);
		nums.add(400);
		nums.add(001);
		nums.add(300);
		nums.add(1000);
		nums.add(500);
		nums.add(200);
		nums.add(700);
		
		System.out.println("The values present in the Tree Set with Reverse Order: ");
		System.out.println(nums);

	}

	@Override
	public int compare(Integer i, Integer j) {
		if (i < j) {
			return 1;
		} else if (i > j) {
			return -1;
		} else {
			return 0;
		}
	}

}
