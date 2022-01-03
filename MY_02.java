package javaSqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//데이터베이스 접속;연결
//데이터베이서 접속해제;연결닫기


class DB{
	Connection conn = null;
	Statement pstmt = null;
	ResultSet rs = null; // 쿼리시에 결과를 저장하는 용도로 사용. select에 주로 사용
	
	public void connectDB() {
		final String driver = "org.sqlite.JDBC";
		final String DB_NAME = "db_test.db";//데이버 베이스 이름
		final String DB_URL=
				"jdbc:sqlite:"+DB_NAME;
		
		//디비 접속
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(DB_URL);
			if(conn != null) {
				System.out.println("DB 접속 성공");
			}
		}
		catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("드라이버 로드 실해");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("DB 접속 실패");
			e.printStackTrace();
		}
	
	}
	 
	public void closeDB() {
		// TODO Auto-generated method stub
		try {
			if(rs !=null) {//열린 경우 닫음
				rs.close();
			}
			if(pstmt != null) {//열린 경우 닫음
				pstmt.close();
			}
			if(conn != null && !conn.isClosed()) {
				conn.close();
				System.out.println("DB 접속 해제");
			}
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	 
}
public class MY_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DB myDB = new DB();
		myDB.connectDB();
		myDB.closeDB();
	}

}
