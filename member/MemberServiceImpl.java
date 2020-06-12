package member;

public class MemberServiceImpl implements MemberService{
	private Member[] members ;
	private int idx;

	public MemberServiceImpl() { // Constructor
		members = new Member[3];
		idx = 0;
	}

	@Override
	public void join(Member member) {
//		System.out.println("App에서 넘어온 회원정보");
//		System.out.println(member.toString());
		members[idx++] = member;
//		System.out.println("증가된 인덱스값: "+idx);
//		System.out.println("배열에 저장된 회원정보");
	
	}

	@Override
	public void login(Member member) {
		for(int i = 0; i < members.length; i++) {
			if( members[i].getUserid().equals(member.getUserid())
					&& members[i].getPassword().equals(member.getPassword()) ) {
				System.out.println("로그인 성공");	
				break;
			}else {		
				//System.out.println("아이디와 비밀번호를 확인해주세요.");
				if((i+1) == members.length) System.out.println("아이디와 비밀번호를 확인해주세요.");
				continue;
			}			
		}		
	}

	@Override
	public Member[] list() {		
		return members;
	}
	

	
}
