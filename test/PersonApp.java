package test;

import java.util.Scanner;

public class PersonApp{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Person[] persons = new Person[3];
		
		for(int i = 0; i < 3; i++) {
			persons[i] = new Person();
			System.out.println("�̸��� �Է����ּ���.");
			persons[i].name = scan.next();
			System.out.println("���̸� �Է����ּ���.");
			persons[i].age = scan.nextInt();
			System.out.println("Ű�� �Է����ּ���.");
			persons[i].height = scan.nextFloat();
		}
		
		for(int i = 0; i < 3; i++) {
			persons[i].printStates();
		}
	}
}