package inheritance06A;

import java.util.ArrayList;

public class DAO {
	private ArrayList<DTO> members;
	
	public DAO() {
		members = new ArrayList<>();
	}
	
	public void insert(DTO dto) {
		members.add(dto);
	}
	
	public int findIndexById(String id) {
		int index = -1;
		for(DTO dto : members) {
			if(dto.getId().equals(id)) {
				index = members.indexOf(dto);
				break;
			}
		}
		
		return index;
	}
	
	public DTO selectId(int index) {
		DTO dto = members.get(index);
		return dto;
	}

	public void remove(int index) {
		members.remove(index);
	}
	
	public ArrayList<DTO> findAll(){
		return members;
	}

	public void updatePassword(int index, DTO dto) {
		members.set(index, dto);
	}
	
}








