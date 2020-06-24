package ex200623;

class A{
	protected int x = 100;
	protected void disp() {	}
}

class B extends A{
	public int x = 200;
	public int y = 100;
	@Override
	public void disp() {
		System.out.println("A클래스의 x="+ super.x);
		System.out.println("B클래스의 x="+ this.x);
	}
	public void disp2() {}
}

public class InheritTest {
	public static void main(String[] args) {
		B bp = new B();
		System.out.println(bp.x);
		bp.disp();
		
		A ap = new B();
		System.out.println(ap.x);
		ap.disp();
		//ap.disp2(); 오류. 
	}
}
