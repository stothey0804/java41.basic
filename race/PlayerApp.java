package race;

import java.util.Scanner;

public class PlayerApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Player[] player = new Player[5];
		for(int i = 0; i < player.length; i++) {
			player[i] = new Player(); // initialize
			System.out.println("�̸��� �Է��ϼ���.");
			player[i].setName(scan.next());
			System.out.println("����� �Է��ϼ���.");
			player[i].setRecord(scan.nextInt());
		}
		
		Player temp = new Player();
		for(int i = 0;  i < player.length ; i++) {
			for(int j = 0; j < player.length-1; j++) {
				if(player[j].getRecord() > player[j+1].getRecord()) {
					temp = player[j+1];
					player[j+1] = player[j];
					player[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < player.length; i++) {
			player[i].printRecord();
		}
				
	}

}
