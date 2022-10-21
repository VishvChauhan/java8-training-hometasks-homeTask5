package six.listEmployeeSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeNameSortWithLambda {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(100, "Samanth"));
		emp.add(new Employee(200, "Vishu"));
		emp.add(new Employee(300, "Sahil"));
		emp.add(new Employee(400, "Karthik"));
		
		System.out.println("Before Sort: ");
		System.out.println(emp);
		
		
		
		Collections.sort(emp, (i,j)->{
			return i.getEmployeeName().compareTo(j.getEmployeeName());
					});
		
		System.out.println("After Sort: ");
		System.out.println(emp);

	}

}
