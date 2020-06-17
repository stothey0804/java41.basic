package member;

import java.util.Scanner;

public class MemberApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Member member = null;
		MemberService ms = new MemberServiceImpl(); // 

		while(true) {
			System.out.println("[사용자기능]");
			System.out.println("1. 회원가입");
			System.out.println("2. 마이페이지");
			System.out.println("3. 비번수정");
			System.out.println("4. 회원탈퇴");
			System.out.println("5. 아이디 중복확인");
			System.out.println("6. 로그인");
			System.out.println("****************");
			System.out.println("[관리자기능]");
			System.out.println("7. 회원목록");
			System.out.println("8. 아이디검색");
			System.out.println("9. 이름검색");
			System.out.println("10. 전체회원수");
			System.out.println("****************");
			System.out.println("0. 종료");
			switch (scan.nextInt()) {
			case 1:	// 회원가입
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
			case 2:	// 마이페이지
				member = new Member();
				System.out.println("[ 마이페이지 ]");
				System.out.println("[ 로그인 ]");
				System.out.println("아이디: ");
				member.setUserid(scan.next());
				System.out.println("비밀번호: ");
				member.setPassword(scan.next());
				if(ms.login(member))	ms.myPage(member);
				else System.out.println("로그인 실패");				
				break;
			case 3: // 비번수정
				member = new Member();
				System.out.println("[ 비밀번호 수정 ]");
				System.out.println("[ 로그인 ]");
				System.out.println("아이디: ");
				member.setUserid(scan.next());
				System.out.println("비밀번호: ");
				member.setPassword(scan.next());
				// 기존값을 찾아서 
				if(ms.login(member)) {
					System.out.println("변경할 비밀번호를 입력해주세요.");					
					member.setPassword(scan.next());
					ms.editPassword(member);
				}
				else{
					System.out.println("로그인 실패");
				}				
				break;
			case 4: // 회원탈퇴
				member = new Member();
				System.out.println("[ 회원탈퇴 ]");
				System.out.println("[ 로그인 ]");
				System.out.println("아이디: ");
				member.setUserid(scan.next());
				System.out.println("비밀번호: ");
				member.setPassword(scan.next());				
				if(ms.login(member)) {
					ms.quitMember(member);
					ms.myPage(member);
					System.out.println("[회원탈퇴 하였습니다.]");		
				}
				else{
					System.out.println("로그인 실패");
				}
				break;
			case 5: // 아이디 중복확인
				System.out.println("[ 아이디 중복확인 ]");
				System.out.println("아이디:");
				ms.idCheck(scan.next());
				break;
			case 6: // 로그인
				member = new Member();
				System.out.println("[ 로그인 ]");
				System.out.println("아이디: ");
				member.setUserid(scan.next());
				System.out.println("비밀번호: ");
				member.setPassword(scan.next());
				if( ms.login(member) )	System.out.println("로그인 성공");	
				else System.out.println("로그인 실패");
				break;
			case 7:  // 회원목록
				System.out.println("[ 회원목록 ]");
				Member[] list = ms.list();
				for(int i = 0; i < list.length; i++) {
					if(list[i] == null) System.out.println("정보가 없습니다.");
					else System.out.println(list[i].toString());
				}
				break;
			case 8:		// 아이디검색
				System.out.println("[ 아이디 검색 ]");
				System.out.println("아이디를 입력하세요 : ");
				ms.searchID(scan.next());
				break;				
			case 9:		// 이름검색
				System.out.println("[ 이름 검색]");
				System.out.println("이름을 입력하세요 : ");
				ms.serachName(scan.next());
				break;
			case 10:	// 전체회원수
				System.out.println("총 회원수: "+ms.memberCount()+"명");
				break;
			case 0:		System.out.println("종료합니다.");	return;
			default:	System.out.println("없는 메뉴입니다.");	break;
			}
		}	
		
		
	}

}
