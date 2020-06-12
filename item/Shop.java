package item;

import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		Item item = null;
		ItemService itemService = new ItemServiceImpl();
		Scanner scan = new Scanner(System.in);		
		
		while(true) {
			System.out.println("0: EXIT   1. JOIN   2. LIST");
			switch (scan.nextInt()) {
			case 1:
				System.out.println("ADD");
				item = new Item();
				System.out.println("상품명: ");
				item.setName(scan.next());
				System.out.println("가격: ");
				item.setPrice(scan.nextInt());
				itemService.addCart(item);
				break;
			case 2:
				System.out.println("LIST");
				Item[] list = itemService.list();
				for(int i = 0; i < list.length; i++) {
					if(list[i] != null) {
						System.out.println(i+1+"."+list[i].toString());
					}else{
						System.out.println(i+1+"."+"비었습니다.");
					}
				}
				break;
			case 0: System.out.println("종료");
				return;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
		
	}

}
