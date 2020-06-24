package week1.president;

import week1.prince.Hyunchul;

public class Dajung {
	private int a = 70;
	int b = 70;
	protected int c = 70;
	public int d = 70;

	public static void main(String[] args) {
		Dajung dj = new Dajung();
		System.out.println(dj.a);
		System.out.println(dj.b);
		System.out.println(dj.c);
		System.out.println(dj.d);
		
		Yongsam ys = new Yongsam();
		System.out.println(ys.b);
		System.out.println(ys.c);
		System.out.println(ys.d);
		
		Hyunchul hc = new Hyunchul();
		System.out.println(hc.c);
		System.out.println(hc.d);
		System.out.println(hc.dd);
		
	}

	public static void test() {}
	public void test2() {}
}
