package test;

import java.util.Scanner;

public class Shop {
	private String name;
	private int phone, tv, computer;
	Scanner scan = new Scanner(System.in);

	public void inputInfo() {
		System.out.println("�̸�: ");
		this.name = scan.next();
		System.out.println("������: ");
		this.phone = scan.nextInt();
		System.out.println("TV����: ");
		this.tv = scan.nextInt();
		System.out.println("��ǻ�Ͱ���: ");
		this.computer = scan.nextInt();
	}
	
	public int totalPrice() {
		return this.phone + this.tv + this.computer;
	}
	
	public void printTotal() {
		System.out.println( this.name + " ������ �����Ͻ� �ݾ��� "
				+ this.totalPrice() / 10000 + "���� �Դϴ�.");
	}	
	
}
