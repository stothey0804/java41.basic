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
		Player[] ranking = new Player[3];
		for(int j = 0; j < player.length; j++) {
			for(int i = 0 ; i < player.length-1; i++) {
				if(player[i].getRecord() < player[i+1].getRecord()) {
					ranking[j] = player[i+1];
				}
				else {
					ranking[j] = player[i];
				}
			}
		}
		

//		if(player[0].getRecord() < player[1].getRecord()) {
//			if(player[0].getRecord() < player[2].getRecord()) {
//				ranking[0] = player[0];
//			}else{
//				ranking[0] = player[2];
//			}
//		}else {
//			if(player[1].getRecord() < player[2].getRecord()) {
//				ranking[0] = player[1];
//			}else {
//				ranking[0] = player[2];
//			}
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
