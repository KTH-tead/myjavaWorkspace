package p460;

public class Member {
	private String memId ;
	private String memberPw ;
	
	//Getter Setter
	public String getMemId() {
		return memId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((memId == null) ? 0 : memId.hashCode());
		result = prime * result + ((memberPw == null) ? 0 : memberPw.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (memId == null) {
			if (other.memId != null)
				return false;
		} else if (!memId.equals(other.memId))
			return false;
		if (memberPw == null) {
			if (other.memberPw != null)
				return false;
		} else if (!memberPw.equals(other.memberPw))
			return false;
		return true;
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
