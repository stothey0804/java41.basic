package test;

import java.util.Scanner;

public class Shop {
	private String name;
	private int phone, tv, computer;
	Scanner scan = new Scanner(System.in);

	public void inputInfo() {
		System.out.println("이름: ");
		this.name = scan.next();
		System.out.println("폰가격: ");
		this.phone = scan.nextInt();
		System.out.println("TV가격: ");
		this.tv = scan.nextInt();
		System.out.println("컴퓨터가격: ");
		this.computer = scan.nextInt();
	}
	
	public int totalPrice() {
		return this.phone + this.tv + this.computer;
	}
	
	public void printTotal() {
		System.out.println( this.name + " 고객님이 결제하실 금액은 "
				+ this.totalPrice() / 10000 + "만원 입니다.");
	}	
	
}
