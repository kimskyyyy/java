package ex3;

public class LoginDTO {
	String id;
	String pw;
	String name;
	String gender;
	String hobbys;
	
	public String getId() {
		return id;
	}
	
	public String getPw() {
		return pw;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getHobbys() {
		return hobbys;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setHobbys(String hobbys) {
		this.hobbys = hobbys;
	}
	

}
