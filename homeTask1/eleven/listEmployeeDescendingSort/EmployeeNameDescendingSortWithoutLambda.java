package eleven.listEmployeeDescendingSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import six.listEmployeeSort.Employee;

public class EmployeeNameDescendingSortWithoutLambda implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o2.getEmployeeName().compareTo(o1.getEmployeeName());
		
	}
	
	public static void main(String args[]) {
		
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1000, "Naina"));
		emp.add(new Employee(2000, "Bunny"));
		emp.add(new Employee(3000, "Sunny"));
		emp.add(new Employee(4000, "Dhruv"));
		
		System.out.println("Before Sort: ");
		System.out.println(emp);
			
		Collections.sort(emp, new EmployeeNameDescendingSortWithoutLambda());
		System.out.println("After Sort: ");
		System.out.println(emp);
		
		
	}

}
