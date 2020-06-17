package member;

public class MemberServiceImpl implements MemberService{
	private Member[] members ;
	private int count;

	public MemberServiceImpl() { // Constructor
		members = new Member[3];
		count = 0;
	}

	@Override
	public void join(Member member) {
//		System.out.println("App에서 넘어온 회원정보");
//		System.out.println(member.toString());
		members[count++] = member;
//		System.out.println("증가된 인덱스값: "+idx);
//		System.out.println("배열에 저장된 회원정보");
	
	}

	@Override
	public boolean login(Member member) {
		
		for(int i = 0; i < count; i++) {
			if( members[i].getUserid().equals(member.getUserid())
					&& members[i].getPassword().equals(member.getPassword()) ) {
				return true;
			}else {		
				//System.out.println("아이디와 비밀번호를 확인해주세요.");
				//if((i+1) == count) System.out.println("아이디와 비밀번호를 확인해주세요.");
				continue;
			}			
		}	
		return false;
	}

	@Override
	public Member[] list() {		
		return members;
	}

	@Override
	public void idCheck(String id) {
		String result = "존재하지 않는 아이디입니다.";
		for(int i = 0; i < count; i++) {
			if(members[i].getUserid().equals(id))	result = id + "는 존재하는 아이디입니다."; break;
		}
		System.out.println(result);
	}

	@Override
	public void myPage(Member member) {	// 2. 마이페이지
		for(int i = 0; i < count; i++) {
			if( members[i].getUserid().equals(member.getUserid()) ) System.out.println(members[i].toString());
			else	break;
		}
	}

	@Override
	public void editPassword(Member member) {
		for(int i = 0; i < count; i++) {
			if( members[i].getUserid().equals(member.getUserid()) ) members[i].setPassword(member.getPassword()); break;

		}
		System.out.println("변경된 패스워드: " + member.getPassword());
		
	}

	@Override	
	public void quitMember(Member member) {	// 회원탈퇴
		int idx = 0;
		for(int i = 0 ; i < count; i++) {
			if( members[i].getUserid().equals(member.getUserid()) ) {
				members[i] = members[count-1];
				break;
			}
		}		
		members[--count] = null;
		
	}

	@Override
	public int memberCount() {	// 회원 수 출력
		return this.count;
	}

	@Override
	public void searchID(String id) {	// 아이디검색
		for(int i = 0; i < count ; i++) {
			if(members[i].getUserid().equals(id)) {
				System.out.println(members[i].toString());
			}
		}		
	}

	@Override
	public void serachName(String name) {	// 이름검색
		for(int i = 0; i < count; i++) {
			if(members[i].getName().equals(name)) {
				System.out.println(members[i].toString());
			}
		}
	}


	
}
