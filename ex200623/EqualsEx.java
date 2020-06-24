package ex200623;

class Person{
	long id;
	public Person(long id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Person) {
			return	this.id == ((Person)obj).id;
		}else {
			return false;
		}
	}
}

public class EqualsEx {
	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		if(p1 == p2) {	// 주소값 비교
			System.out.println("p1와 p2는 같은 사람입니다.");
		}else {
			System.out.println("p1와 p2는 다른 사람입니다.");
		}
		
		if (p1.equals(p2)) {
			System.out.println("p1와 p2는 같은 사람입니다.");
		}else {
			System.out.println("p1와 p2는 다른 사람입니다.");
		}
	}
}
