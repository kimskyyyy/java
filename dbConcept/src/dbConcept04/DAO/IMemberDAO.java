package dbConcept04.DAO;

import java.util.Collection;

import dbConcept04.DTO.MemberDTO;

public interface IMemberDAO {
	public Collection<MemberDTO> selectAll() ;
	public MemberDTO selectEmail(String email);
	public void insert(MemberDTO member);
	public void update(MemberDTO member);
	public void delete(String email);
}
