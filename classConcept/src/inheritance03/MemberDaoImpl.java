package inheritance03;

import java.util.ArrayList;

public class MemberDaoImpl implements IMemberDAO{
	
	private ArrayList<String> emails;
	private ArrayList<String> names;
	private ArrayList<String> mobiles;
	
	public MemberDaoImpl() {
		 emails = new ArrayList<>();
		 names = new ArrayList<>();
		 mobiles = new ArrayList<>();
	}
	
	@Override
	public void insert(String email, String name, String mobile) {
		if(emails.contains(email) == false) {
			emails.add(email);
			names.add(name);
			mobiles.add(mobile);		
			System.out.println("정보가 등록되었습니다.");
		} else {
			System.out.println(email + "은/는 중복된 이메일입니다.");
		}
		
	}

	@Override
	public void selectEmail(String email) {
		int index = emails.indexOf(email);
		
		if(index != -1) {
			System.out.println("이름: " + names.get(index));
			System.out.println("전화번호: " + mobiles.get(index));
			System.out.println("이메일: " + emails.get(index));
		} else {
			System.out.println("존재하지 않는 회원입니다.");
		}	
		
	}

	@Override
	public void selectAll() {
		if(emails.isEmpty() == false) {
			System.out.println("이름: " + names);
			System.out.println("전화번호: " + mobiles);					
			System.out.println("이메일: " + emails);					
		} else {
			System.out.println("회원 정보가 존재하지 않습니다.");
		}
		
	}

	@Override
	public void delete(String email) {
int index = emails.indexOf(email);		
		if(index != -1) {
			System.out.println("이름: " + names.remove(index) + "님의 정보가 삭제되었습니다.");
			System.out.println("전화번호: " + mobiles.remove(index) + "님의 전화번호가 삭제되었습니다.");
			System.out.println("이메일: " + emails.remove(index) + "님의 이메일이 삭제되었습니다.");
		} else {
			System.out.println("존재하지 않는 회원입니다.");
		}		
	}

	@Override
	public void update(String email, String name, String mobile) {
		int index = emails.indexOf(email);
		
		if(index != -1) {			
			names.set(index, name);
			mobiles.set(index, mobile);
			
			System.out.println("이름이 " + names.get(index) + "으로 수정되었습니다.");
			System.out.println("전화번호가 " + mobiles.get(index) + "으로 수정되었습니다.");			
		} else {
			System.out.println("존재하지 않는 회원입니다.");	
		}
		
	}
	
	
}
