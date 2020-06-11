package rps;

import java.util.Random;
import java.util.Scanner;

public class RPS {
	public static void main(String[] args) {			
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		while(true) {
			System.out.println("-------------------------------------------");
			System.out.println("   메뉴설명   |   1. 게임시작     0. 종료");
			System.out.println("-------------------------------------------");
			int flag = scan.nextInt();
			switch (flag) {
			case 1:
				gameStart(scan, random);
				break;
			case 0:
				return;
			}						
		}		
	}

	private static void gameStart(Scanner scan, Random random) {
		System.out.println("┌─────────────────────────────────────────┐");
		System.out.println("│                 가위 바위 보                  │");
		System.out.println("└─────────────────────────────────────────┘");
		System.out.println("가위, 바위, 보를 고르세요.");
		System.out.println("1: 가위 | 2: 바위 | 3: 보");
		
		int user = scan.nextInt();		
		while(user < 1 || user > 3) { // exception
			System.out.println("(주의) 1,2,3 중에서 선택주세요.");
			user = scan.nextInt();
		}
				
		int com = random.nextInt(3) + 1;	// computer selection ( 1 ~ 3 )
		
		System.out.println("user의 선택: " + rpcSelect(user));
		System.out.println("com의 선택: " + rpcSelect(com));
		System.out.println("");
		
		String result = confirmResult(user, com);
		
		System.out.println("*******************************************");
		System.out.println("결과 발표 : "+result);
		System.out.println("*******************************************");
	}
	
	private static String confirmResult(int user, int com) {		
		if(user == com) {
			return "비겼습니다.";
		}else if( (user == 1 && com == 2) || (user == 2 && com == 3) || (user == 3 && com == 1)) {
			return "com의 승리";
		}else {
			return "user의 승리";
		}
	}
	
	private static String rpcSelect(int param) {
		switch (param) {
		case 1:		return "가위";			
		case 2:		return "바위";
		case 3:		return "보";
		default:	return "오류";
		}
	}

}
