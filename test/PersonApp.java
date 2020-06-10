package test;

import java.util.Scanner;

public class PersonApp{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Person[] persons = new Person[3];
		
		for(int i = 0; i < 3; i++) {
			persons[i] = new Person();
			System.out.println("이름을 입력해주세요.");
			persons[i].name = scan.next();
			System.out.println("나이를 입력해주세요.");
			persons[i].age = scan.nextInt();
			System.out.println("키를 입력해주세요.");
			persons[i].height = scan.nextFloat();
		}
		
		for(int i = 0; i < 3; i++) {
			persons[i].printStates();
		}
	}
}