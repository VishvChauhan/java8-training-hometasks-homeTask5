package ten.mapEmployeeSort;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import six.listEmployeeSort.Employee;

public class TreeMapEmployeeWithLambda {

	public static void main(String[] args) {
		
		Comparator<Employee> comp = (i,j) -> {
			return j.getEmployeeName().compareTo(i.getEmployeeName());
			
		};
		
		Map<Employee,Integer> empSet = new TreeMap<Employee,Integer>(comp);
		empSet.put(new Employee(100, "Samanth"),1);
		empSet.put(new Employee(200, "Vishu"),2);
		empSet.put(new Employee(300, "Abhishek"),3);
		empSet.put(new Employee(400, "Zayn"),4);
		empSet.put(new Employee(500, "Ookla"),5);
		
		System.out.println("Employee Names in Descending Order: ");
		
		System.out.println(empSet.keySet());
		
		
	}

}
