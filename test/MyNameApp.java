package test;

import java.util.Scanner;

public class MyNameApp {
	public static void main(String[] args) {
		System.out.println("����� �̸���?");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("����� �̸��� "+ name +"�Դϴ�.");
		
		System.out.println("���̴� ��ԵǼ���.");	
		int age = scan.nextInt();
		while( age > 200 || age < 0 ) {
			System.out.println("���̸� �ٽ� �Է����ּ���.");	
			age = scan.nextInt();
		}		
		System.out.println("����� ���̴� "+ age +"�Դϴ�.");
		
		System.out.println("Ű�� ��� �Ǽ���.");
		float height = scan.nextFloat();
		System.out.println("�� Ű�� "+ height +"�Դϴ�.");
		
	}
}