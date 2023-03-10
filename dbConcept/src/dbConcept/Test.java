package dbConcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		/*
		 * JDBC(Java DataBase Connectivity)
		 * : 자바 프로그램에서 데이터베이스 연결을 도와주는 기능의 집합
		 * 
		 * 작업순서
		 * 1. JDBC Driver 실행
		 * 2. DataBase로 연결(Connection)
		 * 3. SQL 명령문을 담아 전달하기 위한 객체(PreparedStatement) 생성
		 * 4. 명령문을 담은 객체 내 메소드를 호출하여 DataBase로 전달.
		 * 5. SELECT 명령문을 전달했다면 결과가 존재하기에 객체(ResultSet)로 받음.
		 * 6. 위에서 열어둔 객체 해제.
		 */
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con = null;
		String id = "douzone";
		String password = "oracle";
		/*
		 * 컴퓨터의 주소 : IP 주소(컴퓨터를 식별하는 용도)
		 * 비유 : 서울특별시 동작구 노량진동 아이비빌딩
		 * 192.168.10.1, 127.0.0.1
		 * 127.0.0.1 == 자기자신(내컴퓨터) == localhost
		 * Port Address or Port Number(컴퓨터에서 동작 중인 프로그램 식별 번호)
		 * 비유 : 302호
		 * Oracle Database : 1521
		 */
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			con = DriverManager.getConnection(url, id, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("### 회원 등록 ###");
		System.out.print("아이디 : "); String userId = sc.next();
		System.out.print("비밀번호 : "); String userPw = sc.next();
		System.out.print("이름 : "); String userName = sc.next();
		sc.close();
		
		PreparedStatement ps = null;
		String sql = "INSERT INTO test VALUES(?, ?, ?, test_seq.nextval)";
		try {
			// 아직 DB로 명령문을 전달하지 않음
			ps = con.prepareStatement(sql);
//			String data = "INSERT INTO VALUES('" + id + "', '" + password + "', '" + name + "')";
			// DB로 명령문 전달.
			ps.setString(1, userId);
			ps.setString(2, userPw);
			ps.setString(3, userName);
			ps.executeUpdate(); // INSERT, UPDATE, DELETE
			// SELECT -> ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			if(ps != null)
				ps.close();
			if(con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
