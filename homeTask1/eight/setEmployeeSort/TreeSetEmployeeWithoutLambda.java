package eight.setEmployeeSort;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import six.listEmployeeSort.Employee;

public class TreeSetEmployeeWithoutLambda implements Comparator<Employee> {

	public static void main(String[] args) {
		Set<Employee> emp = new TreeSet<>(new TreeSetEmployeeWithoutLambda());

		emp.add(new Employee(100, "Samanth"));
		emp.add(new Employee(200, "Vishu"));
		emp.add(new Employee(300, "Sahil"));
		emp.add(new Employee(400, "Karthik"));

		System.out.println("List of Employees in alphabetical order is: ");
		System.out.println(emp);

	}

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmployeeName().compareTo(o2.getEmployeeName());
	}

}
