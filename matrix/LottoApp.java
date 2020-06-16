package matrix;

import java.util.Random;
import java.util.Scanner;

class Lotto{
	int[] arr;
	public Lotto() {
		arr = new int[6];
	}	
	public boolean isDuplication(int[] lotto, int temp) {	// 중복체크
		boolean ok = false;
		for(int i = 0; i < lotto.length; i++) {
			if(lotto[i] == temp) {
				ok = true;
			}
		}
		return ok;
	}
}


public class LottoApp {	
	public static void main(String[] args) {
		Random random = new Random();
		int[][] lotto = new int[5][6];
		Lotto instance = new Lotto();
		Scanner scan = new Scanner(System.in);
		
		// 로또 자동판매 프로그램
		System.out.println("┌───────────────────┐");
		System.out.println("│     로또 6/ 45     │");
		System.out.println("└───────────────────┘");
		System.out.println(">> 얼마나 구매하시겠습니까?");
		System.out.println("1. 1000원    2. 2000원    3. 3000원    4. 4000원    5. 5000원");
		int k = scan.nextInt();
		
		
		System.out.println("======================================================");
		for(int j = 0; j < k; j++) {
			// 숫자생성(중복없이)
			for(int i = 0; i < lotto[j].length; i++) {
				int temp = random.nextInt(45)+1;
				if(instance.isDuplication(lotto[j], temp)) {
					i--;
					continue;
				}
				lotto[j][i] = temp;
			}
		}		
		//출력
		for(int j = 0; j < k; j++) {
			System.out.printf("%d번\t", j+1);
			for(int i = 0; i < lotto[j].length; i++) {
				System.out.printf("%d\t", lotto[j][i]);
			}
			System.out.println("");
		}

		System.out.println("======================================================");

	}
	


}


