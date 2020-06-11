package race;

import java.util.Scanner;

public class PlayerApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Player[] player = new Player[3];
		for(int i = 0; i < player.length; i++) {
			player[i] = new Player(); // initialize
			System.out.println("이름을 입력하세요.");
			player[i].setName(scan.next());
			System.out.println("속도를 입력하세요.");
			player[i].setRecord(scan.nextInt());
		}
		
//		Player temp = new Player();
//		for(int i = 0;  i < player.length ; i++) {
//			for(int j = 0; j < player.length-1; j++) {
//				if(player[j].getRecord() < player[j+1].getRecord()) {
//					temp = player[j];
//					player[j] = player[j+1];
//					player[j+1] = temp;
//				}
//			}
//		}
		//Player[] ranking = new Player[3];
		String name = "";
//		if(player[0].getRecord() < player[1].getRecord()
//				&& player[0].getRecord() < player[2].getRecord()) {
//				name = player[0].getName();
//		}else if(player[1].getRecord() < player[0].getRecord()
//				&& player[1].getRecord() < player[2].getRecord()){
//				name = player[1].getName();
//		}else {
//			name = player[2].getName();
//		}
		
		
		for(int j = 0; j < player.length; j++) {
			for(int i = 0 ; i < player.length; i++) {
				if(player[j].getRecord() < player[i].getRecord()) {
					name = player[j].getName();
			}
			}
		}
		
		System.out.println("1등 : "+ name);
//			
//		}
//		System.out.println(ranking[0].getName() + "가 1등입니다.");
		
		/* *
		 System.out.println(player[0].getName() + "이) "
					+ player[1].getName() + "보다 빠르다.");
		 * */
		
		for(int i = 0; i < player.length; i++) {
			player[i].printRecord();
		}
				
	}
}

