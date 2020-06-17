package member;

public interface MemberService {
	public void join(Member member);	// 1. 회원가입
	public void myPage(Member member);	// 2. 마이페이지
	public void editPassword(Member member);// 3. 비번수정
	public void quitMember(Member member); // 4. 회원 탈퇴
	public void idCheck(String id);		// 5. 아이디 존재체크
	public boolean login(Member member);	// 6. 로그인	
	public Member[] list();
	public void searchID(String id);// 8. 아이디검색
	public void serachName(String name);// 9. 이름검색
	public int memberCount();// 10. 전체회원수
	
}

/* 요구사항 (기능정의)
 * <사용자기능>
 * 1. 회원가입
 * 2. 마이페이지
 * 3. 비번 수정
 * 4. 회원탈퇴
 * 5. 아이디 존재 체크
 * 6. 로그인
 * **********
 * <관리자기능>
 * 7. 회원목록
 * 8. 아이디검색 - 일치하는 정보 출력
 * 9. 이름검색 - 일치하는 정보 출력
 * 10. 전체 회원수
 */