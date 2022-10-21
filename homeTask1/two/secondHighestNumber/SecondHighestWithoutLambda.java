package two.secondHighestNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SecondHighestWithoutLambda implements Comparator<Integer> {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		
		nums.add(200);
		nums.add(100);
		nums.add(900);
		nums.add(500);
		nums.add(800);
		System.out.println("Before Sort: ");
		System.out.println(nums);
		Collections.sort(nums, new SecondHighestWithoutLambda());
		System.out.println("After Sort: ");
		System.out.println(nums);
		System.out.println("The second Highest Number is: "+nums.get(1));

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
