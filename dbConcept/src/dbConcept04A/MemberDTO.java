package dbConcept04A;
/*
CREATE TABLE db_concept4(
email varchar2(30),
name varchar2(20),
password varchar2(20),
register_date varchar2(10),
PRIMARY Key(email)
);
Commit;
 */
public class MemberDTO implements IMemberDTO{
	private String email;
	private String name;
	private String password;
	private String registerDate;
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
	
	
}
