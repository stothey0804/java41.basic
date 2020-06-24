package assignment;
/*
 * * 실습: SpecialMember, Member를설계하시오
 * */
class Member{
	String name;
	String grade;
	public Member(String name) {
		this.name = name;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void hello() {
		System.out.println("안녕하세요, "+name+"입니다.");
	}
	
}

class SpecialMember extends Member{
	int point;
	public SpecialMember(String name) {
		super(name);
	}
	/**
	 * @param point the point to set
	 */
	public void setSpecialPoint(int point) {
		this.point = point;
	}
	public void hello() {
		System.out.println("안녕하세요, 스페셜멤버 "+name+"입니다.");
	}

	
}

public class MemberApp {
	public static void main(String[] args) {
		Member m = new Member("김길동");
		m.setGrade("3");
		m.hello();
		
		SpecialMember sm= new SpecialMember("홍길동");
		sm.setGrade("1");
		sm.setSpecialPoint(100);

		Member m2 = sm;
		m2.hello();
	}
}
