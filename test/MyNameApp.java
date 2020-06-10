package test;

import java.util.Scanner;

public class MyNameApp {
	public static void main(String[] args) {
		System.out.println("당신의 이름은?");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("당신의 이름은 "+ name +"입니다.");
		
		System.out.println("나이는 어떻게되세요.");	
		int age = scan.nextInt();
		while( age > 200 || age < 0 ) {
			System.out.println("나이를 다시 입력해주세요.");	
			age = scan.nextInt();
		}		
		System.out.println("당신의 나이는 "+ age +"입니다.");
		
		System.out.println("키는 어떻게 되세요.");
		float height = scan.nextFloat();
		System.out.println("제 키는 "+ height +"입니다.");
		
	}
}