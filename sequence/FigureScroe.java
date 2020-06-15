package sequence;

import java.util.Scanner;

/*
 * 7명의 심사위원의 점수중에서 100점 만점에서 최고점과 최하점을 제외한 5명 점수평균구하기
 * */
public class FigureScroe {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] score = new int[5];
		int total = 0;
		int min = 100;
		int max = 0;
		
		System.out.println("[심사위원 점수 입력]"); 
		for(int i = 0; i < score.length; i++) {
			System.out.println(i+1 + "번째 점수 >> ");
			score[i] = scan.nextInt();
			total += score[i];
			// 최대, 최소값 구하기.
			if(score[i] <= min) min = score[i];
			if(score[i] >= max) max = score[i];
		}
		System.out.println("최대값: " + max + ", 최소값: " + min);
		System.out.println((score.length-2) + "명 평균값: "+(total-min-max) / (score.length-2));
		
	}

}
