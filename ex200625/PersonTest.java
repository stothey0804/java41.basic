package ex200625;

import java.util.Arrays;

class Person{
	String name;
	int age;
	private final int HOBBY_SIZE = 10;
	String[] hobbys = new String[HOBBY_SIZE];
	
	public Person() {
		
	}
	
	public Person(Person p) {
		this(p.name,p.age,p.hobbys);	// 아래 생성자 호출
	}
	
	public Person(String name, int age, String[] hobbys) {
		this.name = name;
		this.age = age;
		int lenght = HOBBY_SIZE;
		if(HOBBY_SIZE > hobbys.length)	lenght = hobbys.length;
		for(int i = 0; i < lenght; i++) {
			this.hobbys[i] = hobbys[i];
		}
		//이후 매개변수의 원본이 바뀌어도 영향을 받지 않음.
	}
	
	public String toString() {
		String result="name: "+this.name+", age: "+this.age+", hobbys: ";
		for(int i = 0 ; i < HOBBY_SIZE; i ++) {
			if(this.hobbys[i]!=null) {
				result += hobbys[i]+", ";
			}
		}			
		return result;
	}
	
	
}

public class PersonTest {
	public static void main(String[] args) {
		String[]hobbys = {"자전거","등산"};
		Person p1 = new Person("홍길동",30,hobbys);
		System.out.println(hobbys == p1.hobbys);
		System.out.println(p1.toString());
		
		Person p2 = new Person(p1);
		//Person p3 = new Person();
		
		System.out.println("p1: "+p1);
		System.out.println("p2: "+p2);
		
		hobbys[0] = "오토바이";
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}
}
