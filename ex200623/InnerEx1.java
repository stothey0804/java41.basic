package ex200623;

public class InnerEx1 {

	int m = 0;
	class InstanceInner{
		int iv = 100;
		int t = m;
		final static int CONST = 100;
	}
	
	static class StaticInner{
		int iv = 200;
		//int t = m;
		static int cv = 200;
	}
	
	void myMethod() {
		class LocalInner{
			int iv = 300;
			int t = m;
			// static int sv = 300; // static변수 선언 불가
			final static int CONST = 300; // final static은 상수이므로 허용.
		}
		LocalInner local = new LocalInner(); // 메소드 내에서만 가능
	}
	
	public static void main(String[] args) {
		InnerEx1 ex = new InnerEx1();
		InnerEx1.InstanceInner inner1 = ex.new InstanceInner();
		InnerEx1.StaticInner inner2 = new InnerEx1.StaticInner();	// static이므로 ex. 접근 생략가능
	}
}
