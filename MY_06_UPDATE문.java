package javaSqlite;

import java.sql.SQLException;
import java.util.Scanner;

//업데이트는 덮어쓰는 것임

//이름 나이 직업만 수정가능
//아이디는 분리를 위해 적은것
class DBUpdate extends DBSelect{ //DB에 있는 DBSelect를 가져오는 것
	private User modifyUser() {
		//해당 user도 select안에 있음
		//한 패키지 안에 생성해놨었기 때문에 User를 다시 만들 필요없음
		User user = new User();
		Scanner scanner = new Scanner(System.in);
		
		boolean validate = false;
		String validateTemp;
		do {
			System.out.println("정보 수정 할 회원이 아이디를 입력하세요: ");
			user.userID = scanner.nextLine();
			System.out.println("회원의 이름을 입력하세요: ");
			user.name = scanner.nextLine();
			System.out.println("회원의 나이를 입력하세요: ");
			user.age = Integer.parseInt(scanner.nextLine());
			System.out.println("회원의 직업을 입력하세요 : ");
			user.job = scanner.nextLine();
			
			System.out.println("수정 된 회원 :" + user.userID + "/ " + user.name + " /" + user.age+" / " + user.job + " 이 맞습니까?(y/n)");
			validateTemp = scanner.nextLine();
			//입력 값이 y가 아닌 경우 true, 같은 경우 false반환
			validate = !validateTemp.equals("y");
		}while(validate);
		scanner.close();
		return user;
		
		//where문으로 id해당번호의 이름,직업,나이를 수정하는것
		
		//업데이트는 영향받은 데이터를 업데이트 시킴
		//저장값이 바뀌지 않은 경우 else가 나옴
		//int rs니까 수정 한번이라도 했으면 0보다 크니까 
	    //인서트는 데이터를 하나씩 입력하니까 하나라도 맞는말이지만 , 업데이트는 아이디 값이 중복이라면 여러개가 영향받게 됨. 
		//업데이트문을 실행하면 1이상이지 하나 일 순 없음. 
		//인서트 문과 업데이트문이 차이가 난다. 
		
	}
	public void updateUser() throws SQLException{
		User user =modifyUser();
		String updateSQL = "UPDATE tb_user SET name = '"+user.name + "',age='" +user.age+"',job='"+user.job+"'WHERE id = '" +user.userID + "'";
		//System.out.println(updateSQL);
		
		pstmt = conn.createStatement();//쿼리 실행 준비
		int rs = pstmt.executeUpdate(updateSQL);
		
		if(rs>0) {
			System.out.println("영향 받은 데이터: : " + rs);
			System.out.println("데이터 수정에 성공했습니다.");
			
		}
		else {
			System.out.println("데이터 수정에 실패했습니다.");
		}
	}
}

public class MY_06_UPDATE문 {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
//바뀐거 확인할려고 dbselect를 상속받은것임
		DBUpdate myDB = new DBUpdate();
		myDB.connectDB();
		myDB.updateUser();
		
		String sql = "SELECT * FROM tb_user";
		 
		myDB.printTablePerspon(sql);
		myDB.closeDB();
		}

}
