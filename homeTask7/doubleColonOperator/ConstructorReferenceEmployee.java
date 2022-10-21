package doubleColonOperator;

public class ConstructorReferenceEmployee {

	public static void main(String[] args) {

		// with Lambda
		EmployeeInterface fromLambdaEmp = (name, accNo, salary) -> {
			return new Employee(name, accNo, salary);
		};

		System.out.println("Employee Details from Lambda Expression: "
				+ fromLambdaEmp.getEmployeeDetails("Vishu", 518909, 500000).toString());

		// with Constructor reference
		EmployeeInterface fromConstructorEmp = Employee::new;
		System.out.println("Employee Details from Constructor: "
				+ fromConstructorEmp.getEmployeeDetails("Samanth", 616852, 1000000));

	}

}
