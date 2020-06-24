package assignment;

import java.util.Scanner;

/*
 * 실습: 국어, 영어, 수학 점수 받아서, 총점 평균 출력하기
 * */
public class GradeCalcTest {
	public static void main(String[] args) {
		
		int kor, eng, math, tot = 0;
		float avg = 0.0f;
		char grade;
		Scanner scan = new Scanner(System.in);
		System.out.println("국어:");
		kor = scan.nextInt();
		System.out.println("영어:");
		eng = scan.nextInt();
		System.out.println("수학:");
		math = scan.nextInt();
		
		tot = kor + eng + math;
		avg = tot / 3.0f;	// 실수로 만들어줄 것
		
		if(avg > 90 && avg <= 100) {
			grade = 'A';
		}else if(avg > 80) {
			grade = 'B';
		}else if(avg > 70) {
			grade = 'C';
		}else if(avg > 60) {
			grade = 'D';
		}else {
			grade = 'E';
		}
		
		System.out.printf("총점: %d점%n", tot);
		System.out.printf("평균: %.2f점%n", avg);
		System.out.printf("평균: %s%n", grade);
		
	}
}
