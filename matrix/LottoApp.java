package matrix;

import java.util.Random;
import java.util.Scanner;

class Lotto{
	
	private int[][] lotto = new int[5][6];
	Scanner scan = new Scanner(System.in);
	public Lotto() {
		
	}
	public int inputAmount() {	// 1. 구매수량 입력
		System.out.println("┌───────────────────┐");
		System.out.println("│     로또 6/ 45     │");
		System.out.println("└───────────────────┘");
		System.out.println(">> 얼마나 구매하시겠습니까?");
		System.out.println("1. 1000원    2. 2000원    3. 3000원    4. 4000원    5. 5000원");
		int k = 0;
		while(true) {
			k = this.scan.nextInt();
			if(k > 5 || k < 1) System.out.println("1번과 5번 내에서 선택해주세요.");
			else break;
		}
		return k;
	}
	
	public void generateNumber(Random random, int k) {	// 2. 번호생성
		for(int j = 0; j < k; j++) {
			// 숫자생성(중복없이)
			for(int i = 0; i < this.lotto[j].length; i++) {
				int temp = random.nextInt(45)+1;
				if(this.isDuplication(this.lotto[j], temp)) {
					i--;
					continue;
				}
				this.lotto[j][i] = temp;
			}
		}
	}
	
	public boolean isDuplication(int[] lotto, int temp) {	// 중복체크
		boolean ok = false;
		for(int i = 0; i < this.lotto.length; i++) {
			if(lotto[i] == temp) {
				ok = true;
			}
		}
		return ok;
	}
	
	public void printNumber(int k) {	// 3. 번호 출력
		//출력
		System.out.println("======================================================");
		for(int j = 0; j < k; j++) {
			System.out.printf("%d번\t", j+1);
			for(int i = 0; i < this.lotto[j].length; i++) {
				System.out.printf("%d\t", this.lotto[j][i]);
			}
			System.out.println("");
		}

		System.out.println("======================================================");
	}

}


public class LottoApp {	
	public static void main(String[] args) {
		Random random = new Random();
		Lotto instance = new Lotto();
		
		int k = instance.inputAmount();	// 1. 구매 수량 입력
		instance.generateNumber(random, k);	// 2. 로또번호 생성
		instance.printNumber(k); // 3. 로또 번호 출력
	}



}


