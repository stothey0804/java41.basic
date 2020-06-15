package sequence;

public class Sequence5050 {
	public static void main(String[] args) {
		/*
		 * 1 ~ 3 까지의 합
		 * */
		
		int[] arr = new int[100];
		int sum = 0;
		int sum2 = 0;
		
		// 0 ~ 99 인덱스 할당
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1; 
		}
		// 짝수 출력하기
		int i = 1;
		while(true) {
			if(i < arr.length) {				// arr[i] % 2 == 0
				// System.out.println(">> "+arr[i]);
				sum += arr[i]; // sum = sum + arr[i];
				i += 2;
			}else {
				break;
			}
		}		
		// 홀수 출력하기
		for (int j = 0; j < arr.length; j+=2) {
			//System.out.println(">> "+arr[j]);
			sum2 += arr[j];
		}
		
		System.out.println("1~100까지");
		System.out.println("짝수의 합: " + sum);
		System.out.println("홀수의 합: " + sum2);
		
	}
}
