package assignment;

public class SelectionSort {
	public static void main(String[] args) {
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		int maxIdx;
		// Selection Sort
		for(int k = 0; k < score.length-1; k++) {
			maxIdx = k;
			for(int i = k+1; i < score.length; i++ ) {
				if(score[maxIdx] < score[i]) {
					int temp = score[maxIdx];
					score[maxIdx] = score[i];
					score[i] = temp;
				}
			}
		}
		
		for(int i = 0 ; i < score.length; i++) {
			System.out.print(score[i]+" ");
		}
	}
}
