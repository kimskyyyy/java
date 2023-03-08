package inheritance04;

public interface IMemberDAO {
	void insert(String email, String name, String mobile);
	void selectEmail(String email);
	void selectAll();
	void delete(String email);
	void update(String email, String name, String mobile);
	
//	void insert(MemberDTO member);
//	void selectEmail(String email);
//	void selectAll();
//	void delete(String email);
//	void update(String email, String name, String mobile);
}
