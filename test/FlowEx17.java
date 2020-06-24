package test;

import java.util.Scanner;

public class FlowEx17 {
	public static void main(String[] args) {
		
		System.out.println("* 출력 라인수를 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		for(int i = 0; i < num; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
