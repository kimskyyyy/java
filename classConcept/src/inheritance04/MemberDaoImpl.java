package inheritance04;

import java.util.ArrayList;

public class MemberDaoImpl implements IMemberDAO{
	
	private ArrayList<MemberDTO> member;
	
	public MemberDaoImpl() {
		 member = new ArrayList<>();
	}
	
//	@Override
////	public void insert(String email, String name, String mobile) {
//	public void insert(MemberDTO member) {
//		if(member.getEmail().isEmpty()) {
//			member.setEmail(member.getEmail());
//			member.setName(member.getName());
//			member.setMobile(member.getMobile());			
//			System.out.println("정보가 등록되었습니다.");
//		} else {
//			System.out.println(member.getEmail() + "은/는 중복된 이메일입니다.");
//		}
//		
//	}
	
	
	@Override
	public void insert(String email, String name, String mobile) {
		if(member.contains(email) == false) {
			MemberDTO dto = new MemberDTO();
			dto.setEmail(email);
			dto.setName(name);
			dto.setMobile(mobile);
			
			member.add(dto);
			System.out.println("정보가 등록되었습니다.");
		} else {
			System.out.println(email + "은/는 중복된 이메일입니다.");
		}
		
	}

	@Override
	public void selectEmail(String email) {
		if(member.contains(email) == false) {
			System.out.println("등록되지 않은 이메일입니다.");
		} else {
			System.out.println("## 회원 검색 결과 ##");
			System.out.println("이메일 : " + email);
			
			int index = member.indexOf(email);
			MemberDTO dto = member.get(index);
			System.out.println("이름 : " + dto.getName());
			System.out.println("전화번호 : " + dto.getEmail());
		}		
	}

	
	@Override
	public void selectAll() {
		if(member.isEmpty() == false) {
			MemberDTO dto =member.get(0);
			System.out.println("이름: " + dto.getName());
			System.out.println("전화번호: " + dto.getMobile());					
			System.out.println("이메일: " + dto.getEmail());					
		} else {
			System.out.println("회원 정보가 존재하지 않습니다.");
		}
		
	}

	@Override
	public void delete(String email) {
		int index = member.indexOf(email);	
		MemberDTO dto = member.get(index);
		if(index != -1) {
			System.out.println("이름: " + member.remove(index) + "님의 정보가 삭제되었습니다.");
		} else {
			System.out.println("존재하지 않는 회원입니다.");
		}		
	}

	@Override
	public void update(String email, String name, String mobile) {
		int index = member.indexOf(email);	
		MemberDTO dto = member.get(index);
		

		
	}
	
	
}
