package matrix;

import java.util.Random;
import java.util.Scanner;

class Lotto2{
	private int countLimit, lottoCount;
	private int[] lotto;
	private int[][] lottos;
	
	public void setCountLimit(int limit) {
		this.countLimit = limit;
	}
	
	public int getCountLImit() {
		return this.countLimit;
	}
	
	public void setLottos(int[][] lottos) {
		lotto = new int[6];
		lottos = new int[lottoCount][6];
		for(int i = 0; i < lottoCount; i++) {
			for(int j = 0; j < 6; j++) {
				int num = (int)(Math.random() * 45 + 1);
				if(isDuplicate(num)) {
					j--;
					continue;
				}
				lotto[j] = num;
			}
			sort(lotto);
			System.arraycopy(lotto, 0, lottos[i], 0, lotto.length);
		}
		this.lottos = lottos;
	}
	
	public int[][] getLottos(){
		setLottos(lottos);
		return lottos;
	}

	public int[] sort(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length ; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	public void printLotto() {
		for(int i = 0; i < this.lottos.length; i++) {
			for(int j = 0; j < this.lottos[i].length; j++) {
				System.out.printf("%d ", lottos[i][j]);
			}
			System.out.println("");
		}
	}
	
	public int lottoCount(int money) {
		int lottocount = 0;
		if (money  < 1000) {
			System.out.println("잘못된 값");
		}else {
			lottocount = (money > countLimit * 1000)? countLimit: money / 1000;
		}
		this.lottoCount = lottocount;
		return lottocount;
	}
	
	public boolean isDuplicate(int num) {
		boolean ok = false;
		for(int i = 0; i < lotto.length; i++) {
			if(this.lotto[i] == num) ok = true;
		}
		return ok;
	}
	
//	public void generate(int[] lotto) {
//		for(int i = 0; i < lotto.length; i++) {
//			int temp = (int)(Math.random() * 45 + 1);
//			if(this.isDuplicate(lotto, temp)) {
//				i--;
//				continue;
//			}
//			lotto[i] = temp;
//		}
//	}
	
	
}

public class LottoApp2 {
	public static void main(String[] args) {
		//Random random = new Random();
		int[] lotto = new int[6];
		Scanner scan = new Scanner(System.in);
		Lotto2 instance = new Lotto2();
		System.out.println("구매한도 설정");
		instance.setCountLimit(scan.nextInt());
		System.out.printf("구매한도: %d장\n", instance.getCountLImit());
		while(true) {
			System.out.println("1. 로또 구입   0. 종료");
			switch(scan.nextInt()) {
			case 1:	
				buyLottos(instance, scan);		
				break;
			case 0:	return;
			}
		}
	
	}
		

	private static void buyLottos(Lotto2 instance, Scanner scan) {
		System.out.println("몇원어치 발급합니까?");
		System.out.printf("로또 %d장 발급합니다.\n", instance.lottoCount(scan.nextInt()));	
		int [][] lottos = null;
		lottos = instance.getLottos();
		
		for(int i = 0; i < lottos.length; i++) {
			for(int j = 0; j < lottos[i].length; j++) {
				System.out.print(lottos[i][j]+"\t");
			}
			System.out.println("");
		}
		
	}
}
