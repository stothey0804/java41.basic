package sequence;
/*
 * 3의 배수를 제외한 1부터 10까지 정수 출력
 * [결과] 1, 2, 3, 4, 5, 7, 8, 10;
 * */
public class Except3Multi {
	public static void main(String[] args) {
//		for(int i = 1; i < 11; i++) {
//			if(i % 3 != 0) System.out.printf("%d  ",i);
//		}
		int[] arr = new int[7];
		int j = 0;
	
		for(int i = 1 ; i < 11; i++) {
			if(i % 3 != 0) {
				arr[j] = i;
				j++;
			}
		}
		for(int i = 0 ; i < arr.length; i++) {
			System.out.printf("%d  ",arr[i]);
		}
		
		
	}

}
