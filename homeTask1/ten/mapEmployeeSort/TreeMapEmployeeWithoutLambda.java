package ten.mapEmployeeSort;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import six.listEmployeeSort.Employee;

public class TreeMapEmployeeWithoutLambda implements Comparator<Employee>{

	public static void main(String[] args) {
		
		Map<Employee,Integer> empSet = new TreeMap<Employee,Integer>(new TreeMapEmployeeWithoutLambda());
		empSet.put(new Employee(100, "Samanth"),1);
		empSet.put(new Employee(200, "Vishu"),2);
		empSet.put(new Employee(300, "Abhishek"),3);
		empSet.put(new Employee(400, "Zayn"),4);
		empSet.put(new Employee(500, "Ookla"),5);
		
		System.out.println("Employee Names in Descending Order: ");
		
		System.out.println(empSet.keySet());

	}

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getEmployeeName().compareTo(o1.getEmployeeName());
	}

}
