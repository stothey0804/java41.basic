package ex200622;

interface EmployeeType{
	public int getAmount();
}

class Engineer implements EmployeeType{

	@Override
	public int getAmount() {
		return 100;
	}
	
}

class Manager implements EmployeeType{

	@Override
	public int getAmount() {
		return 200;
	}
	
}

class Salesman implements EmployeeType{

	@Override
	public int getAmount() {
		return 300;
	}
	
}


public class Employee {
	private EmployeeType type;
	
	public Employee(EmployeeType type) {
		setType(type);
	}
	
	public void setType(EmployeeType type) {
		this.type = type;
	}
	
	public int getAmount() {
		return type.getAmount();
	}
	
	public static void main(String[] args) {
		Engineer e = new Engineer();
		Manager m = new Manager();
		Salesman s = new Salesman();
		Employee emp = new Employee(s);
		System.out.println(emp.getAmount());
	}
}
