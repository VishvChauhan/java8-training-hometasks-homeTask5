package two.secondHighestNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondHighestWithLambda {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		
		nums.add(20);
		nums.add(10);
		nums.add(90);
		nums.add(50);
		nums.add(80);
		System.out.println("Before Sort: ");
		System.out.println(nums);
		Collections.sort(nums, (i,j) -> {
			if(i < j) {
				return 1;
			}else if(i > j) {
				return -1;
			}else {
				return 0;
			}
		});
		System.out.println("After Sort: ");
		System.out.println(nums);
		System.out.println("The second Highest Number is: "+nums.get(1));
		
		

	}

}
