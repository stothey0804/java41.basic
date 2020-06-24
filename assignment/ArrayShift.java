package assignment;

import java.util.Scanner;

public class ArrayShift {
	public static void main(String[] args) {
		int[] arr = new int[7];
		Scanner scan = new Scanner(System.in);
		// arr input
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d번째 요소 입력: ", i+1);
			arr[i] = scan.nextInt();
		}
		// print arr
		System.out.print("입력된 배열: [ ");
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d ",arr[i]);
		}
		System.out.println("]");
		
		// shift value input
		System.out.println("왼쪽으로 몇번 이동하시겠습니까?");
		int shift = scan.nextInt();
		
		// shift 
		int[] shiftArr = new int[7];
		for(int i = 0 ; i < arr.length; i++) {
			if(i < (arr.length-shift)) {
				shiftArr[i] = arr[(shift)+i];}
			else {
				shiftArr[i] = arr[ i - (arr.length-shift)];
			}
		}
		
		// print shiftArr
		System.out.print("결과값: [ ");
		for(int i = 0; i < shiftArr.length; i++) {
			System.out.printf("%d ",shiftArr[i]);
		}
		System.out.println("]");
		
				
		
	}
}
