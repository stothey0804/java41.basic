package assignment;

import java.util.Scanner;

public class ArrayShift2 {
	public static void main(String[] args) {
		int[] irr = {1,2,3,4,5,6,7};

		Scanner input = new Scanner(System.in);
		System.out.println("칸수입력: ");

		int move = input.nextInt();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		   
		for (int y = 0; y < move; y++) {	// move번만큼 앞으로 땡겨줌
			int temp;
			temp = arr[0]; 
			for (int x = 1; x < arr.length; x++) {
				arr[x-1] = arr[x];
			}
			arr[arr.length - 1] = temp;	// arr 맨끝에 계속 arr[0]를 넣음.
		}


		for(int z = 0; z < arr.length; z++) {
			System.out.print(arr[z]+" ");
		} 
	}
}
