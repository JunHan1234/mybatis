package ch01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {
	public static void main(String[] args) {
		final String DB_URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		final String DB_USER = "mybatis";
		final String DB_PASSWORD = "mybatis";
		
		/* connection을 통해 request code를 oracle로 보낼 준비한다.*/
		Connection conn = null;
		PreparedStatement stmt = null;
		/*response를 나타낼 객체*/
		ResultSet rs = null;
		
		try {
			/*byte code roading 시키기*/
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			
			String query = "select user_id, user_name, reg_date from users";
			//connection 을 통해 query를 oracle로 보낸다.
			stmt = conn.prepareStatement(query);
			rs = stmt.executeQuery(); /*ORM에 사용할 relation을 저장.*/
			
			User user = null;
			//ORMapping 작업.
			/*next() :커서가 이동하며 row가 있으면 true, 없으면 false return하며 반복종료*/
			while(rs.next()) {
				/*User의 기본생성자를 이용해 setting한다.*/
				user = new User(rs.getInt(1), rs.getString(2), rs.getDate(3));
				System.out.println(user);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch(Exception e) {}
		}
	}
}
