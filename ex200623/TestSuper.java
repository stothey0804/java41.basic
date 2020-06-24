package ex200623;

class Employee{
//	public Employee() {
//		System.out.println("나는 부모 constructor");
//	}
	public Employee(int a) {
		System.out.println("나는 부모 constructor");
	}
}
class Manager extends Employee{
	public Manager() {
		super(3);
		//super();
		System.out.println("나는 자식 constructor"); 
	}
}

public class TestSuper {
	public static void main(String[] args) {
		Manager m = new Manager();	// Construct 호출
	}
}
