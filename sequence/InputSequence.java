package sequence;

import java.util.Scanner;

/*
 * 1 부터 합산하고자하는 한계 숫자를 입력하십시오.
 * 1 ~ 입력값(이하) 범위 내에서 홀수의 합을 출력하시오.
 * */
public class InputSequence {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("한계 숫자를 입력하세요 >> ");
		int max = scan.nextInt();
		
		// array 생성 및 할당
		int[] arr = new int[max];
		for(int i = 0; i < max; i++) {
			arr[i] = i + 1;
		}
		
		System.out.println("1부터 " + max + "의 값을 구합니다.");
		
		// 홀수의 합 구하기
		for(int i = 0; i < arr.length; i+=2) {
			//System.out.println(">> " + arr[i]);
			sum += arr[i];
		}
		System.out.println(sum);
		
	}
}
