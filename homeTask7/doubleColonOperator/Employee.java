package doubleColonOperator;

public class Employee {

	private String empName;
	private int empAccountNumber;
	private int empSalary;

	public Employee(String empName, int empAccountNumber, int empSalary) {
		super();
		this.empName = empName;
		this.empAccountNumber = empAccountNumber;
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empAccountNumber=" + empAccountNumber + ", empSalary=" + empSalary
				+ "]";
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAccountNumber() {
		return empAccountNumber;
	}

	public void setEmpAccountNumber(int empAccountNumber) {
		this.empAccountNumber = empAccountNumber;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

}
