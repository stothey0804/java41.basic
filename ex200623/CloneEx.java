package ex200623;

import java.util.Arrays;

class Point implements Cloneable{
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x="+this.x+", y="+this.y;
	}
	
	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		}catch (CloneNotSupportedException e) {}
		return obj;
	}
}

public class CloneEx {
	public static void main(String[] args) {
		Point original = new Point(3, 5);
		Point copy = (Point)original.clone();
		System.out.println(original);
		System.out.println(copy);
		
		int[] arr = {1,2,3,4,5};
		int[] arrClone = arr.clone();	// 이미 재정의 되어있음
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.toString());
		System.out.println(Arrays.toString(arrClone));
		System.out.println(arrClone.toString());
	}
}
