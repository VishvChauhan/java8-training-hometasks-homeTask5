package eight.setEmployeeSort;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import six.listEmployeeSort.Employee;

public class TreeSetEmployeeWithLambda {

	public static void main(String[] args) {
		
		Comparator<Employee> compare = (i, j) -> {
			return i.getEmployeeName().compareTo(j.getEmployeeName());

		};
		
		Set<Employee> emp = new TreeSet<>(compare);

		emp.add(new Employee(100, "Samanth"));
		emp.add(new Employee(200, "Vishu"));
		emp.add(new Employee(300, "Sahil"));
		emp.add(new Employee(400, "Karthik"));

		System.out.println("List of Employees in alphabetical order is: ");
		System.out.println(emp);

	}

}
