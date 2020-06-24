package ex200622;

class Box{
	public int x;
}
public class PassingValueType {
	public static void main(String[] args) {
		PassingValueType test = new PassingValueType();
		int iVlaue = 1;
		System.out.println("test 01 before: "+iVlaue);
		test.test01(iVlaue);
		System.out.println("test 01 after: "+iVlaue);
		
		Box box = new Box();
		System.out.println("test 02 before: "+box.x);
		test.test02(box);
		System.out.println("test 02 after: "+box.x);
		
		Box box2 = new Box();
		System.out.println("test 03 before: "+box2.x);
		test.test03(box2);
		System.out.println("test 03 after: "+box2.x);
		
		test.test04(box2);
		System.out.println("test 04 after: "+box2.x);
				
	}

	void test01(int param) {	
		param = 2;	
	}
	void test02(Box box) {	
		box = new Box();
		box.x = 1;
	}
	void test03(Box box) {
		box.x = 1;
	}
	
	void test04(Box param) {
		Box box = new Box();
		param = box;
	}

}