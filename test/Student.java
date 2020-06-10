package test;

public class Student {

	private String name;
	private int kor, eng, math, total;
	float average;
	
	public void setName(String name) { // Setter
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setKor(int kor) {
		this.kor = kor;		
	}
	
	public int getKor() {
		return this.kor;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getEng() {
		return this.eng;
	}
	
	public void setMath(int math) {
		this.math = math;
	}		
	public int getMath() {
		return this.math;
	}	
	
	public void sumTotal() {
		this.total = this.kor + this.eng + this.math;
	}
	
	public void setAverage() {
		this.average = this.total / 3;
	}
	
//	public float showAvg() {
//		return this.average;
//	}


	void printSates() {
		System.out.println(name + "의 점수");
		System.out.println("국어: "+ kor +", 영어: "+ eng +", 수학: "+math);
		System.out.println("총점: "+ total + ", 평균 : " + average);
	}
}
