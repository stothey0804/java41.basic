package ex200624;

import java.util.Scanner;

class Student{
	private int score;
	private String id, name, major;
	public String getId() {
		return id;
	}
	public int getScore() {
		return score;
	}
	public String getName() {
		return name;
	}
	public String getMajor() {
		return major;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMajor(String major) {
		this.major = major;
	}	
}

interface StudentService{
	public void addStudent(Scanner scan);
	public void getCount();
	public void avgScore(Scanner scan);
	public void printAllStudent();
}

class StudentServiceImpl implements StudentService{
	Student[] students;
	public static int count;
	final static int MAX = 10;
	
	public StudentServiceImpl() {
		students = new Student[MAX];
	}

	@Override
	public void addStudent(Scanner scan) {
		students[count] = new Student();
		System.out.println("[ 학생입력 ]");
		System.out.println("학번: ");
		students[count].setId(scan.next());
		System.out.println("이름: ");
		students[count].setName(scan.next());
		System.out.println("학과: ");
		students[count].setMajor(scan.next());
		System.out.println("학점: ");
		students[count].setScore(scan.nextInt());
		count++;
	}

	@Override
	public void getCount() {
		System.out.println("총 학생수: "+count+"명");
		float total = 0.0f;
		for(Student s: students) {
			if(s != null) {
				total += s.getScore();
			}else {
				break;
			}			
		}
		System.out.println("평균점수: "+(total/(float)count));
	}

	@Override
	public void avgScore(Scanner scan) {
		float total = 0.0f;
		int cnt = 0;
		System.out.println("[학과별 평점평균]");
		System.out.println("학과를 입력하세요: ");
		String major = scan.next();
		for(Student s: students) {
			if(s != null && major.equals(s.getMajor())) {
				total += s.getScore();
				cnt++;
			}else {
				break;
			}
		}
		System.out.println("평균점수: "+ (total/(float)cnt));
		
	}

	@Override
	public void printAllStudent() {
		System.out.println("[학생목록출력]");
		for(Student s: students) {
			if(s != null) {
				System.out.println("학번: "+s.getId());
				System.out.println("이름: "+s.getName());
				System.out.println("학과: "+s.getMajor());
				System.out.println("학점: "+s.getScore());
				System.out.println("---------------");
			}			
		}
	}
	
}

public class StudentEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StudentServiceImpl ss = new StudentServiceImpl();
		while(true) {
			System.out.println("선택하세요. [0: 나가기  1: 학생입력  2: 학생수출력  3: 학과별 학점평균 4: 학생목록출력]");
			switch (scan.nextInt()) {
			case 0:	
				System.out.println("종료합니다.");
				return;
			case 1:
				ss.addStudent(scan);
				break;
			case 2:
				ss.getCount();
				break;
			case 3:
				ss.avgScore(scan);
				break;
			case 4:
				ss.printAllStudent();
				break;
			default:
				break;
			}
		}
	}
	
	
}
