package assignment;

public class Pyramid {
	public static void main(String[] args) {
		int line = 13;
		for(int i = 1; i <= line; i++) {
			for(int k = line; k > i ; k--) {
				System.out.print(" ");
			}
			for(int j = 0; j < i*2 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
