package javaSqlite;

import java.sql.SQLException;
import java.util.Scanner;
//제일 중요 : db접속
		//user안의 setuser를 실행
		//insertuser실행
		//인서트문: 데이터 저장/집어넣기
//03은 한번 실행만 하고 여러번 실행시 오류가 나지만 
		//04는 데이터를 입력하는 것이기 때문에 계속 집어넣을 수 있다 : 계속 실행해도 무방함.
class User{ // 회원 데이터 정의. 모델 클래스
	public String userID;
	public String name;
	public int age;
	public String job;
	//나이가 숫자고 나머지 문자라서 한개로 위에 네개를 묶음 배열사용하기 애매하니까
}
//인서트
class DBInsert extends DB{
	private User setUser() {
		// TODO Auto-generated method stub
		User user = new User(); 
		Scanner scanner = new Scanner(System.in);
		
		boolean validate = false;
		String validateTemp;
		do {
			System.out.println("신규 회원의 아디디를 입력하세요(영어나 숫자):");
			user.userID = scanner.nextLine();
			System.out.println("신규 회원의 이름을 입력하세요:");
			user.name = scanner.nextLine();
			System.out.println("신규 회원의 나이를 입력하세요(숫자만):");
			user.age = Integer.parseInt(scanner.nextLine());//입력값중 나이는	문자 받아서 int로 변환시켜서 함.
			System.out.print("신규 회원의 직업을 입력하세요:");
			user.job = scanner.nextLine();
			
			System.out.println("신규회원 : 아이디:" + user.userID + "/이름:"+user.name + "/"+user.age+"살/직업:"+user.job+"/"+ "이 맞습니까?(y/n)");
			validateTemp = scanner.nextLine();//입력값 저장
			
			validate = !validateTemp.equals("y");//입력 값이y가 아닐 겨우 true, 같은 경우 false를 반환
			//System.out.println(validate);
		} while (validate);
		scanner.close();
		return user;
	
}
	public void insertUser() throws SQLException{
		User user = setUser(); //많이쓰이는 방식이므로 기억하기 
		//setuser로 데이터 받은것을 저장함. 
		String insertSql ="INSERT INTO tb_user(id, name,age,job)VALUES" +"(' " + user.userID + "','"+user.name+"','" + user.age+"','"+user.job+"')";
		//따옴표를 넣어서 중간 공백을 없앰. 문자열은 넣고 숫자는 안넣어도 되는데 그냥 다 붙이는게 편함
		pstmt = conn.createStatement();//쿼리 실행 준비
		int rs = pstmt.executeUpdate(insertSql);
		//pstmt.excuteQuery(): select
		//pstmt.excuteUpdatte():insert,update,delete..
		
		if(rs ==1) {
			//System.out.println(rs);
			System.out.println("데이터 입력에 성공했습니다.");
		}else {
			System.out.println("데이터 입력에 실패했습니다.");
		}
	}
}
public class MY_04 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DBInsert myDB = new DBInsert();
		myDB.connectDB();
		myDB.insertUser();
		myDB.closeDB();
		
	
		//		setuser를 실행하면 DBInsert에 있는user에 실행되고 /return user해도 됨. 함.
//int rs 는 정수를 리턴함.
}}
