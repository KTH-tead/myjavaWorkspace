package p460;

public class Member {
	private String memId ;
	private String memberPw ;
	
	//Getter Setter
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	
	// 생성자(모든 필드 초기화 생성자)
	public Member(String memId, String memberPw) {
		super();
		this.memId = memId;
		this.memberPw = memberPw;
	}
	
	
}
