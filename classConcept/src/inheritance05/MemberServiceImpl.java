package inheritance05;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MemberServiceImpl implements IMemberService{
	/*
	 MemberMain : 사용자 입력 값을 전달받아 MemberServiceImpl 안 Method 호출
	 MemberServiceImpl 
	 : MemberMain에서 전달한 데이터를 받아 데이터검증 및 MemberDaoImpl Method호출 
	 : 데이터 검증은 사용자 입력 값에 따라 등록/미등록 출력
	 MemberDaoImpl : 데이터 저장소 관리(Create, Read, Update, Delete)
	 */
	
	IMemberDAO memberDao = new MemberDaoImpl();

	@Override
	public void insert(String email, String name, String mobile) {
		
		// 이메일 검증(하다가 말았음)
		if(isValidEmail(email) == false) {
			System.out.println("올바르지 않은 이메일 형식입니다.");
		}
		
		int index = memberDao.findIndexByEmail(email);
		
		if(index == -1) {
			MemberDTO member = new MemberDTO();
			member.setEmail(email);
			member.setName(name);
			member.setMobile(mobile);
			
			memberDao.insert(member);
			
			System.out.println("회원 등록이 되었습니다.");
		}else {
			System.out.println("등록된 정보입니다.");
		}
		
	}

	@Override
	public void selectEmail(String email) {
		int index = memberDao.findIndexByEmail(email);
		if(index == -1) {
			System.out.println("미등록 정보입니다.");
		}else {
			MemberDTO member = memberDao.selectEmail(index);
			System.out.println("이메일 : " + member.getEmail());
			System.out.println("이름 : " + member.getName());
			System.out.println("전화번호 : " + member.getMobile());
		}
		
	}

	@Override
	public void selectAll() {
		ArrayList<MemberDTO> members = memberDao.selectAll(); 
		
		if(members.isEmpty() == false) {
			for(MemberDTO m : members) {
				System.out.println("이메일 : " + m.getEmail());
				System.out.println("이름 : " + m.getName());
				System.out.println("전화번호 : " + m.getMobile());
			}
		}else {
			System.out.println("등록된 정보가 없습니다.");
		}
		System.out.println();
		
	}

	@Override
	public void update(String email, String name, String mobile) {
		int index = memberDao.findIndexByEmail(email);
		if(index == -1) {
			System.out.println("미등록 정보입니다.");
		}else {
			memberDao.update(index, name, mobile);
			System.out.println("정보가 수정되었습니다.");
		}
		
	}

	@Override
	public void delete(String email) {
		int index = memberDao.findIndexByEmail(email);
		if(index == -1) {
			System.out.println("미등록 정보입니다.");
		}else {
			memberDao.delete(index);
			System.out.println("정보가 삭제되었습니다.");
		}
		
	}
	

	 public static boolean isValidEmail(String email) {
		  boolean validation = false;
		  String regex = "^[_a-z0-9-]+(.[_a-z0-9-]+)*@(?:\\w+\\.)+\\w+$";   
		  Pattern p = Pattern.compile(regex);
		  Matcher m = p.matcher(email);
		  if(m.matches()) {
		  	validation = true; 
		  }
		  return validation;
		 }
	 
	 public static boolean isValidMobile(String mobile) {
		  boolean validation = false;
		  String regex = "^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$";   
		  Pattern p = Pattern.compile(regex);
		  Matcher m = p.matcher(mobile);
		  if(m.matches()) {
		  	validation = true; 
		  }
		  return validation;
		 }
	 
	 
	 
	 

}
