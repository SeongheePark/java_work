package ch04;

import java.util.ArrayList;

public class MainTest {

	public static void main(String[] args) {
		// 데이터베이스에 접근해서 buyTBL에 대한 정보
		// 데이터베이스에 접근해서 userTBL에 대한 정보

		UserDAO userDAO = new UserDAO();
//		
//		//insert 확인
		//UserDTO insertDTO = new UserDTO("뉴진스", "2020", "제주", "010-1234-1234");
		// update
//		UserDTO dto = new UserDTO("야스오", "1999", "천안", "010-2222-2222");
//		int updateRowCount = userDAO.update(dto, dto.getUsername());
//		System.out.println(updateRowCount);
		
		
		// delete
		// -- buytbl에 데이터 입력할 때 usertbl에 이름 없으면 입력 안됨
		// 자식 테이블 데이터 먼저 삭제하고 부모 테이블에 정보를 삭제할 수 있다.
//		boolean isDelete = userDAO.delete("뉴진스");
//		System.out.println(isDelete);
//		if(isDelete == false) {
//			System.out.println("구매테이블에 이력이 남아있을 수 있습니다");
//		}
		
		
////		userDAO.insert(insertDTO);
//		int rowCount = userDAO.insert(new UserDTO("아이즈원", "2020", "경기", "010-1234-1234"));
//		System.out.println(rowCount);
//		
//		// select 확인
//		ArrayList<UserDTO> list = userDAO.select();
//
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getUsername());
//			System.out.println(list.get(i).getBirthYear());
//			System.out.println(list.get(i).getAddr());
//			System.out.println(list.get(i).getMobile());
//			System.out.println("------------------------");
//		}
		
		BuyDAO dao = new BuyDAO();
//		
//		//int resultCount = dao.insert(new BuyDTO("뉴진스", "호떡", 3000, 1));
//		
//		ArrayList<BuyDTO> blist = dao.select();
//		//System.out.print(blist);
//		for (int i = 0; i < blist.size(); i++) {
//			System.out.println(blist.get(i).getUsername());
//			System.out.println(blist.get(i).getProdName());
//			System.out.println(blist.get(i).getPrice());
//			System.out.println(blist.get(i).getAmount());
//			System.out.println("-------------------------");
//		}
		
		// update
		BuyDTO dto = new BuyDTO("홍길동", "텀블러", 10000, 2);
		int updateRowCount = dao.update(dto, "책", dto.getUsername());
		
		//UserDTO dto = new UserDTO("야스오", "1999", "천안", "010-2222-2222");
		//int updateRowCount = userDAO.update(dto, dto.getUsername());
		//System.out.println(updateRowCount);
		
		// delete
		//dao.delete("뉴진스");
	}

}
