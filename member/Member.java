package member;

public class Member {
	private String userid;
	private String password;
	private String name;
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public String getUserid() {
		return this.userid;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return this.password;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName(String name) {
		return this.name;
	}
	
	public String toString() {
		return "[아이디: " + this.userid + ", 비번: " + this.password + ", 이름: " + this.name + "]";
	}
}
