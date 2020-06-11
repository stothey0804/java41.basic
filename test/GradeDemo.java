package test;

import java.util.Scanner;


public class GradeDemo {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		int[] score = new int[3];
		// Input Score
		for(int i = 0; i < score.length; i++) {
			System.out.println(i+1 +"번째 학생 점수");
			score[i] = scan.nextInt();
		}		
		// Set first Score
		int firstScore = 0; // 1st rank score
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score.length; j++) {
				if(score[i] < score[j]) {
					firstScore = score[i];					
				}
			}
		}
		// Print first Score
		System.out.println("1등 점수: " + firstScore);
	}

}
