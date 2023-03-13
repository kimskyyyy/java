package dbConcept02A;

import java.util.ArrayList;

public interface IMemberDAO {
	public void insert(MemberDTO member);
	public MemberDTO selectEmail(String email);
	public ArrayList<MemberDTO> selectAll();
	public int update(String email, String name, String mobile);
	public int delete(String email);
}
