package one;

import java.util.Scanner;

/*
 * RFP

 * Person(id, pass, name: String) - Student(ssn:String, score:int, ), Admin(rank:int)
 * <사용자기능> Student
 * 1. 회원가입
 * 2. 로그인
 * 3. 비번 수정
 * 4. 회원탈퇴
 * 5. 아이디 존재 체크
 * 6. 마이페이지
 * 7. 점수 입력
 * **********
 * <관리자기능> Admin
 * 1. 회원목록
 * 2. 아이디검색 - 일치하는 정보 출력
 * 3. 이름검색 - 일치하는 정보 출력
 * 4. 전체 회원수
 * 5. 성적별 현황 (스코어 기준 내림차순, 1등 이순신(여) 98점, 2 김유신(남) 85점.... )
 */

class Constants{
	public static final String STUDENT_MENU =  "0. 학생화면 종료\n" +
			 "1. 회원가입\n" +
			 "2. 로그인 \n" +
			 "3. 비번 수정 \n" +
			 "4. 회원탈퇴 \n" +
			 "5. 아이디 존재 체크 \n" +
			 "6. 마이페이지 \n" +
			 "7. 점수 입력";
	public static final String ADMIN_MENU = "0. 관리자화면 종료\n" +
			 "1. 회원목록\n" +
			 "2. 아이디검색\n" +
			 "3. 이름검색\n" +
			 "4. 전체 회원수\n" +
			 "5. 성적별 현황";	
	public static final String MAIN_MENU = 
			"[ ○○고등학교 인트라넷 ]\n" +
			"메뉴를 선택해주세요.\n" +
			"====================\n" +
			"1. Student \n" +
			"2. Admin\n" + 
			"0. System Exit";
	public static final String EXIT_MENU = "종료합니다";
	public static final String ERROR_MESSAGE = "잘못 입력하셨습니다.";
	public static final String PERSON_SPEC = "아이디: %s 비번: %s 이름: %s";
	public static final String STUDENT_SPEC = "아이디: %s 비번: %s 이름: %s(%s) 주민번호: %s 점수: %d";
	public static final String ADMIN_SPEC = "관리자 아이디: %s 비번: %s 이름: %s 등급: %d";
	
}

class Person{
	protected String id, pass, name;	
	
	public void setId(String id) {this.id = id;}
	public String getId() {return this.id;}
	public void setPass(String pass){this.pass = pass;}
	public String getPass() {return this.pass;	}
	public void setName(String name) {this.name = name;	}
	public String getName() {return this.name;	}
	
	@Override
	public String toString() {
		return String.format(Constants.PERSON_SPEC, id, pass, name);
	}
	
}

class Student extends Person{
	private String ssn, gender;
	private int score; 
	
	public void setSsn(String ssn) {this.ssn = ssn;}
	public String getSsn() {return this.ssn;}
	public void setGender() {
		if(this.ssn.substring(6, 7).equals("2"))	this.gender="여";
		else if(this.ssn.substring(6, 7).equals("1"))	this.gender="남";
		else	this.gender="?";
	}
	
	public void setScore(int score) {this.score = score;}
	public int getScore() {return this.score;}
	@Override
	public String toString() {
		return String.format(Constants.STUDENT_SPEC, id, pass, name, gender, ssn, score);
	}
	
}

class Admin extends Person{
	private int rank;
	
	public void setRank(int rank) {this.rank = rank;}
	public int getRank() {return this.rank;}
	
	@Override
	public String toString() {
		return String.format(Constants.ADMIN_SPEC, id, pass, name, rank);
	}
	
}

interface PersonService{	
	/** 1. 회원가입  */
	public void join(Student member);
	/** 2. 로그인  */  
	public String login(Student member);
	/** 3. 비번 수정  */
	public String changePass(Student member);
	/** 4. 회원탈퇴  */
	public String remove(Student member);
	/** 5. 아이디 존재 체크 */ 
	public String existId(String id);
	/** 6. 마이페이지 */ 
	public String mypage(String id);
	/** 7. 점수 입력 */
	public String score(Student member);
	/** 8. 회원목록 */ 
	public void studentList();
	/** 9. 아이디검색 */ 
	public void idSearch();
	/** 10. 이름검색  */
	public void nameSearch();
	/** 11. 전체 회원수 */ 
	public void studentCount();
	/** 12. 성적별 현황 */
	public void gradeRank();
}

class PersonServiceImpl implements PersonService{
	private int count;
	Student[] students = new Student[3];
	
	public PersonServiceImpl() {
		count = 0;
		for(int i = 0; i < this.students.length; i++) {
			students[i] = new Student();
		}
	}
	@Override
	public void join(Student member) {
		/** 1. 회원가입  */
		students[count++] = member;
	}

	@Override
	public String login(Student member) {
		/** 2. 로그인  */  
		String result = "로그인 실패";
		for(int i = 0; i < count; i++) {
			if(member.getId().equals(students[i].getId())
					&& member.getPass().equals(students[i].getPass())) {
				result = "로그인 성공";
				break;
			}
		}
		return result;
	}

	@Override
	public String changePass(Student member) {
		/** 3. 비번 수정  */
		String result = "아이디를 찾을 수 없습니다.";
		for(int i = 0 ; i < count; i++) {
			if(member.getId().equals(students[i].getId())) {
				students[i].setPass(member.getPass());
				result = "변경완료";
				break;
			}
		}
		return result;
	}

	@Override
	public String remove(Student member) {
		/** 4. 회원탈퇴  */
		String result = "아이디를 찾을 수 없습니다.";
		for(int i = 0 ; i < count; i++) {
			if(member.getId().equals(students[i].getId())) {
				students[i] = students[count-1];
				count--;
				result = "탈퇴완료";
				break;
			}
		}
		return result;
	}

	@Override
	public String existId(String id) {
		/** 5. 아이디 존재 체크 */ 
		String result = "중복없음";
		for(int i = 0 ; i < count; i++) {
			if(id.equals(students[i].getId()))	result = "사용중인 ID입니다.";	break;
		}
		return result;
	}

	@Override
	public String mypage(String id) {
		/** 6. 마이페이지 */ 
		String result = "아이디를 찾을 수 없습니다.";
		for(int i = 0; i < count; i++) {
			if(id.equals(students[i].getId()))	result = students[i].toString();	break;	
		}
		return result;
	}

	@Override
	public String score(Student member) {
		/** 7. 점수 입력 */
		String result = "아이디를 찾을 수 없습니다.";
		for(int i = 0; i < count; i++) {
			if(member.getId().equals(students[i].getId())) {
				students[i].setScore(member.getScore());
				result = "입력완료";
			}
		}
		return result;
	}

	@Override
	public void studentList() {
		/** 8. 회원목록 */ 
		for(int i = 0; i < students.length; i++) {
			if(i > count-1)	System.out.println("정보가 없습니다.");
			else	System.out.println(students[i].toString());
		}
	}

	@Override
	public void idSearch() {
		/** 9. 아이디검색 */ 
		
	}

	@Override
	public void nameSearch() {
		/** 10. 이름검색  */

	}

	@Override
	public void studentCount() {
		/** 11. 전체 회원수 */ 

	}

	@Override
	public void gradeRank() {
		/** 12. 성적별 현황 */

	}
	
}


public class PersonApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PersonService service = new PersonServiceImpl();
		Student member = null;
		Admin admin = null;
		
		while(true) {
			System.out.println(Constants.MAIN_MENU);
			switch (scan.nextInt()) {
			case 0:	System.out.println(Constants.EXIT_MENU);	return;
			case 1:	// 사용자메뉴				
				studentMenu(scan, service, member);
				break;
			case 2:	// 관리자메뉴
				adminMenu(scan, service);
				break;
			default:
				System.out.println(Constants.ERROR_MESSAGE);		break;
			}
		}

	}
	
	public static void studentMenu(Scanner scan, PersonService service, Student member) {
		
		System.out.println(Constants.STUDENT_MENU);
		switch(scan.nextInt()){
		case 0:
			System.out.println(Constants.EXIT_MENU);	return;
		case 1:
			System.out.println("회원가입");
			member = new Student();
			System.out.println("아이디: ");
			member.setId(scan.next());
			System.out.println("비밀번호: ");
			member.setPass(scan.next());
			System.out.println("이름: ");
			member.setName(scan.next());
			System.out.println("주민번호: ");
			while(true) {
				member.setSsn(scan.next());
				if(member.getSsn().length() == 13)	break;
				else System.out.println("주민번호는 13자리로 입력해주세요.");
			}
			member.setGender();
			service.join(member);
			break;
		case 2:
			System.out.println("로그인");
			member = new Student();
			System.out.println("아이디: ");
			member.setId(scan.next());
			System.out.println("비밀번호: ");
			member.setPass(scan.next());
			System.out.println(service.login(member));
			break;
		case 3:
			System.out.println("비번 수정");
			member = new Student();
			System.out.println("아이디: ");
			member.setId(scan.next());
			System.out.println("변경할 비밀번호: ");
			member.setPass(scan.next());
			System.out.println(service.changePass(member));
			break;
		case 4:
			System.out.println("회원탈퇴");
			member = new Student();
			System.out.println("아이디: ");
			member.setId(scan.next());
			System.out.println(service.remove(member));
			break;
		case 5:
			System.out.println("아이디 존재 체크");
			System.out.println("아이디: ");
			System.out.println(service.existId(scan.next()));
			break;
		case 6:
			System.out.println("마이페이지");
			System.out.println("아이디: ");
			System.out.println(service.mypage(scan.next()));
			break;
		case 7:
			System.out.println("점수 입력");
			member = new Student();
			System.out.println("아이디: ");
			member.setId(scan.next());
			System.out.println("점수: ");
			member.setScore(scan.nextInt());
			System.out.println(service.score(member));
			break;
		default:	System.out.println(Constants.ERROR_MESSAGE);	break;
		}
	}
	
	public static void adminMenu(Scanner scan, PersonService service) {
		System.out.println(Constants.ADMIN_MENU);
		switch (scan.nextInt()) {
		case 0:
			System.out.println(Constants.EXIT_MENU);	return;
		case 1:
			System.out.println("회원목록");
			service.studentList();
			break;
		case 2:
			System.out.println("아이디검색");
			break;
		case 3:
			System.out.println("이름검색");
			break;
		case 4:
			System.out.println("전체 회원수");
			break;
		case 5:
			System.out.println("성적별 현황");
			break;
		default:	System.out.println(Constants.ERROR_MESSAGE);	break;
		}
	}
}
