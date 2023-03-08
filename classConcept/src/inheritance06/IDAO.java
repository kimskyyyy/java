package inheritance06;

import java.util.ArrayList;

public interface IDAO {
	// 
	
	public void insert(DTO member);
	public int findIndexById(String id);
	public boolean checkPassword(String id, String currentPw);
	public DTO selectId(int index);
	public ArrayList<DTO> selectAll();
	public void update(int index, String password);
	public void delete(int index);

}
