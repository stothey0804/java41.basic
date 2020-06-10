package test;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		
		Student[] student = new Student[3];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < student.length; i++) {
			student[i] = new Student();
			System.out.println("이름: ");
			student[i].setName(scan.next());
			System.out.println("국어점수: ");
			student[i].setKor(scan.nextInt());
			System.out.println("영어점수: ");
			student[i].setEng(scan.nextInt());
			System.out.println("수학점수: ");
			student[i].setMath(scan.nextInt());		
			student[i].sumTotal();
			student[i].setAverage();
		}
		
		for(int i = 0 ; i < student.length; i++) {
			student[i].printSates();
		}
	}

}
