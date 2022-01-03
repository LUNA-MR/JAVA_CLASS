package javaSqlite;
//select

import java.sql.ResultSet;
import java.sql.SQLException;

 

class DBSelect extends DB{
	//추가된 코드
	public ResultSet querySelect(String sql) {//select실행
		try {
			pstmt = conn.createStatement();//쿼리 실행 준비
			rs = pstmt.executeQuery(sql);//SELECT수행시 execteQuery()사용
			
		}catch (SQLException e) {
			// TODO: handle exception
			System.out.println("error:"+e);
		}return rs;
	}
	public void printTablePerspon(String sql)throws SQLException{
		ResultSet rs = querySelect(sql);
		int num = 1;
		//데이터의 처음부터 읽어오므로 next를 만나면 한 줄을 읽어오고, 다음 줄로 내려간다.
		//하면 한 줄 한줄 내려가면서 데이터를 가져오고, 데이터가 끝까지 가면 종료 된다.
		//rs에 next를 실행하여 한줄씩 읽음 데이터를 다 읽고 나면 false를 출력함, 
		while (rs.next()) {
			System.out.println(num + " 번째 회원");
		System.out.println("아이디: "+rs.getString(1));
		System.out.println("이름: "+ rs.getString(2));
		System.out.println("나이: "+ rs.getString(3));
		System.out.println("직업: "+ rs.getString(4));
		System.out.println();
		num++;
		}
	}
}
//예외 던지기 들어감
//rs로 던져서 rs를 저장함
public class MY_05 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
	 DBSelect myDB = new DBSelect();
	 myDB.connectDB();
	 String sql = "SELECT * FROM tb_user";
	 myDB.printTablePerspon(sql);
	 myDB.closeDB();
		//쿼리문을 따로 공부하기 
		//테이블에 있는 모든것을 다 들고 올때는 *를 사용한다. 명령문임.
	}

}
