package javaSqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//�����ͺ��̽� ����;����
//�����ͺ��̼� ��������;����ݱ�


class DB{
	Connection conn = null;
	Statement pstmt = null;
	ResultSet rs = null; // �����ÿ� ����� �����ϴ� �뵵�� ���. select�� �ַ� ���
	
	public void connectDB() {
		final String driver = "org.sqlite.JDBC";
		final String DB_NAME = "db_test.db";//���̹� ���̽� �̸�
		final String DB_URL=
				"jdbc:sqlite:"+DB_NAME;
		
		//��� ����
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(DB_URL);
			if(conn != null) {
				System.out.println("DB ���� ����");
			}
		}
		catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("DB ���� ����");
			e.printStackTrace();
		}
	
	}
	 
	public void closeDB() {
		// TODO Auto-generated method stub
		try {
			if(rs !=null) {//���� ��� ����
				rs.close();
			}
			if(pstmt != null) {//���� ��� ����
				pstmt.close();
			}
			if(conn != null && !conn.isClosed()) {
				conn.close();
				System.out.println("DB ���� ����");
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
