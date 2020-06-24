package week1.prince;

import week1.president.Dajung;
import week1.president.Yongsam;

public class Hyunchul extends Yongsam {
	private int aa = 70;
	int bb = 70;
	protected int cc = 70;
	public int dd = 70;
	
	public static void main(String[] args) {
		Hyunchul hc = new Hyunchul();
		
		System.out.println(hc.c);
		System.out.println(hc.d);
		
		Dajung dj = new Dajung();
		System.out.println(dj.d);
	}
}
