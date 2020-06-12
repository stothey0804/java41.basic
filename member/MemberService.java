package member;

public interface MemberService {
	public void join(Member member);
	public void login(Member member);	
	public Member[] list();
}
