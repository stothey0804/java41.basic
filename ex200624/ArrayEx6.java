package ex200624;

public class ArrayEx6 {
	public static void main(String[] args) {
		// 최대값 최소값 구하기.
		
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		int max = score[0];
		int min = score[0];
		
		
		for(int i = 0; i < score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			}
			if(min > score[i]) {
				min = score[i];
			}
		}
		
		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);
		
		
		// 내림차순 정렬하기
		for(int i = 0 ; i < score.length-1; i++) {
			int now = i;
			for(int j = i+1; j < score.length; j++) {
				if(score[now] < score[j] ) {
					int tmp = score[now];
					score[now] = score[j];
					score[j] = tmp;
				}
			}
		}
		
		for(int i = 0; i < score.length; i++) {
			System.out.print(score[i]+" ");
		}
	}
}
