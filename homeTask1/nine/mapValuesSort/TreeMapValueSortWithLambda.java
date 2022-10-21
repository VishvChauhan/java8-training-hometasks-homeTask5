package nine.mapValuesSort;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapValueSortWithLambda {
	

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

		Map<Integer, String> score = new TreeMap<Integer, String>(compare);
		
		score.put(35, "Bench-mark");
		score.put(100, "Highest");
		score.put(0, "Lowest");
		score.put(50, "Average");
		
		System.out.println(score);
			
		
	}

}
