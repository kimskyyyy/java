package ex4;

public class RegDTO {
	String name;
	String id;
	String pw;
	String confirm;
	String gender;
	String age;
	String hobbys;
	
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
	
	public String getPw() {
		return pw;
	}
	
	public String getConfrirm() {
		return confirm;
	}
	
	public String getAge() {
		return age;
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
	
	public void setConfirm(String confrirm) {
		this.confirm = confrirm;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	
	public void setHobbys(String hobbys) {
		this.hobbys = hobbys;
	}

}
