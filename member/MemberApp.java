package member;

import java.util.Scanner;

public class MemberApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Member member = null;
		MemberService ms = new MemberServiceImpl(); // 
		
		while(true) {
			System.out.println("|   메뉴   |  1. 회원가입  |  2. 로그인  |  3. 리스트  |  0. 종료  |");
			switch (scan.nextInt()) {
			case 1:
				member = new Member();
				System.out.println("[ 회원가입 ]");
				System.out.println("아이디: ");
				member.setUserid(scan.next());
				System.out.println("비밀번호: ");
				member.setPassword(scan.next());
				System.out.println("이름: ");
				member.setName(scan.next());
				System.out.println("[ 회원정보 확인 ]");
				System.out.println(member.toString());
				ms.join(member);
				break;
			case 2:
				member = new Member();
				System.out.println("[ 로그인 ]");
				System.out.println("아이디: ");
				member.setUserid(scan.next());
				System.out.println("비밀번호: ");
				member.setPassword(scan.next());
				ms.login(member);
				break;
			case 3: 
				System.out.println("[ 회원목록 ]");
				Member[] list = ms.list();
				for(int i = 0; i < list.length; i++) {
					System.out.println(list[i].toString());
				}
			case 0:		System.out.println("종료합니다.");	return;
			default:	System.out.println("메뉴를 정확히 선택하세요.");	break;
			}
		}	
		
		
	}

}
