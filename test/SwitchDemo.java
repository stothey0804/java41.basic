package test;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이번 달은 몇일까지 있을까?");
		System.out.println("연도를 입력하세요: ");
		int year = scan.nextInt();
		System.out.println("월을 입력하세요: ");
		int month = scan.nextInt();
		while(month > 12 || month < 1) { // 예외처리
			System.out.println("(주의) 1 ~ 12 범위 내에서 입력하세요.");
			month = scan.nextInt();
		}
		
		int numDays = numberOfDays(month, year);
		
		System.out.println(year + "년 " + month +"월은 " + numDays + "일까지 입니다.");

	}

	private static int numberOfDays(int month, int year) {
		int numDays = 0;
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			numDays = 31;
			break;
		case 4: case 6: case 9: case 11:
			numDays = 30;
			break;
		case 2:
			numDays = ( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 )? 29 : 28;
			break;				
		}
		return numDays;
	}

}
