package test;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		
		Student[] student = new Student[3];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < student.length; i++) {
			student[i] = new Student();
			System.out.println("�̸�: ");
			student[i].setName(scan.next());
			System.out.println("��������: ");
			student[i].setKor(scan.nextInt());
			System.out.println("��������: ");
			student[i].setEng(scan.nextInt());
			System.out.println("��������: ");
			student[i].setMath(scan.nextInt());		
			student[i].sumTotal();
			student[i].setAverage();
		}
		
		for(int i = 0 ; i < student.length; i++) {
			student[i].printSates();
		}
	}

}
