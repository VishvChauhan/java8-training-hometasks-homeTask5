package eleven.listEmployeeDescendingSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import six.listEmployeeSort.Employee;

public class EmployeeNameDescendingSortWithLambda {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(100, "Ajith"));
		emp.add(new Employee(200, "Vishu"));
		emp.add(new Employee(300, "Sahil"));
		emp.add(new Employee(400, "Karthik"));
		
		System.out.println("Before Sort: ");
		System.out.println(emp);
		
		
		
		Collections.sort(emp, (i,j)->{
			return j.getEmployeeName().compareTo(i.getEmployeeName());
					});
		
		System.out.println("After Sort: ");
		System.out.println(emp);

	}

}
