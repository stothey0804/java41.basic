package ex200625;

public class StaticTest {
	public static void main(String[] args) {
		Customer c = new Customer(100, "홍길동");
		Customer c2 = new Customer(101, "김세영");
		
		EnterAdm.enterance(c);
		EnterAdm.enterance(c2);
		
		System.out.println(EnterAdm.getCount());
	}
}

class EnterAdm{
	static int count;
	static final int maxCnt = 100;
	static Customer[] custs = new Customer[maxCnt];
	
	public static void enterance(Customer c) {
		if(c!=null)	custs[count++] = c;
	}
	
	public static int getCount() {
		return count;
	}
}

class Customer{
	int number;
	String name;
	
	public Customer(int number, String name) {
		this.number = number;
		this.name = name;
	}
}