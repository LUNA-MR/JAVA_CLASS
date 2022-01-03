package javaSqlite;
//MY_02의 DB를 상속받음

class DBCreateTable extends DB{
	//테이블을 생성하는 메소드
	//생성할 테이블 이름과 생성하는 sql문을 매개 변수로 받음
	public void createTable(String tableName, String sql) {
		//테이블이 존재 하는지 확인
		try {
			pstmt = conn.createStatement();//쿼리 실행 준비 pstmt에 저장
			pstmt.executeUpdate(sql);//sql문에 전달
			System.out.println(tableName + "테이블 생성에 성공했습니다."); // 테이블 생성 실행.
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("db connect err:"+e);  //만약 예외가 발생하면 출력되는 구문
		}
	}
}//동일한 테이블은 두번 생성 안되기 때문에 처음 출력시는 성공이 나오지만,  한번더 출력을 누르면 에러가 나옴. 

public class MY_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBCreateTable myDB = new DBCreateTable();  
		myDB.connectDB();//실행이 되었을때 어떤 테이블이 생성되는지 확인을 위해 추가 
		String sql = "CREATE TABLE tb_user(id VARCHAR(100) , name VARCHAR(100)," 
				+ "age INT, job VARCHAR(100))";//conn은 부모 클래스에서 연결 데이터 베이스를 가지고 온것임.
		myDB.createTable("tb_user", sql);   // 해당 쿼리문을 db에 전달.
		myDB.closeDB();
	}

}
