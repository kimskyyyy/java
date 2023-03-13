package dbConcept02;

/*
 * db_concept 테이블 생성
 * - 회원번호, 이메일, 이름, 전화번호
 */
public class MemberDTO {
	private int num;
	private String email;
	private String name;
	private String mobile;
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
}
