package inheritance06;

public interface IService {
	// main -> service 
	public void insert(String id, String password, String name);
	public void select(String id);
	public void delete(String id);
	public void selectAll();
	public void update(String id, String currentPw, String changePw);

}
