package method2;

import java.util.HashMap;

public class Member {

	private HashMap<String, String> passwords = new HashMap<>();
	private HashMap<String, String> names = new HashMap<>();
	
	// 회원등록
	public void insert(String id, String password, String name) {		
		if(passwords.containsKey(id) == false) {			
			passwords.put(id, password);
			names.put(id, name);			
		} else {
			System.out.println("이미 존재하는 id입니다.");
		}		
	}
	
	// 회원검색
	public void selectId(String id) {
		if(passwords.containsKey(id) == false) {
			System.out.println("존재하지 않는 id입니다.");
		} else {
			System.out.println("=== 검색결과 ===");
			System.out.println("id: " + id + ", password: "+ passwords.get(id) + ", name: " + names.get(id));					
		}	
	}
	
	// 회원삭제
	public void delete(String id) {
		if(passwords.containsKey(id) == false) {
			System.out.println("존재하지 않는 id입니다.");
		} else {
			passwords.remove(id);
			names.remove(id);
		}
		
		
	}
	
	// 회원 모두 보기
	public void selectAll() {
		for(String key : passwords.keySet()) {
			System.out.println("id: " + key + ", password: " + passwords.get(key) + ", name: " + names.get(key));
		}			
	}
	
	// 비밀번호 수정
	public void update(String id, String password) {
		if(passwords.containsKey(id) == false) {
			System.out.println("존재하지 않는 id입니다.");
		} else {			
			passwords.put(id, password);
		}
		
	}
	
}
