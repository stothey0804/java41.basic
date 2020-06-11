package test;

import java.util.Scanner;

public class GradeDemo3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("---------------------------------");
			System.out.println("1. 실행     0. 종료");
			System.out.println("---------------------------------");
			
			int flag = scan.nextInt();
			switch (flag) {
			case 1:
				startProgram(scan);
				break;
			case 0:
				return;
			default: 
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
			
			
			
		}
	}

	private static void startProgram(Scanner scan) {
		// 정보 입력
		System.out.println("이름: ");
		String name = scan.next();
		System.out.println("과목: 영어");
		final String eng = "영어";
		System.out.println("점수: ");
		int score;
		while(true) { // 점수 예외처리
			score = scan.nextInt();
			if(score > 100 || score < 0) System.out.println("점수는 0 ~ 100 범위 내로 입력하세요.");
			else break;
		}
		
		// grade 결정
		String grade = resultGrade(score);
		
		// 출력
		System.out.println("*********************************");
		System.out.println("     이름       과목      점수    등급");
		System.out.println("---------------------------------");
		System.out.println("|  "+ name +"  |  " + eng +"  |  " + score + "  |  " + grade + "  |");
		System.out.println("*********************************");
	}

	private static String resultGrade(int score) {
		//등급 계산
		if(score >= 90) return "A";
		else if(score >= 80) return "B";
		else if (score >= 70) return "C";
		else if (score >= 60) return "D";
		else if (score >= 50) return "E";
		else return "F";
	}
}
