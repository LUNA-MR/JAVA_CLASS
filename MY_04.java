package javaSqlite;

import java.sql.SQLException;
import java.util.Scanner;
//���� �߿� : db����
		//user���� setuser�� ����
		//insertuser����
		//�μ�Ʈ��: ������ ����/����ֱ�
//03�� �ѹ� ���ุ �ϰ� ������ ����� ������ ������ 
		//04�� �����͸� �Է��ϴ� ���̱� ������ ��� ������� �� �ִ� : ��� �����ص� ������.
class User{ // ȸ�� ������ ����. �� Ŭ����
	public String userID;
	public String name;
	public int age;
	public String job;
	//���̰� ���ڰ� ������ ���ڶ� �Ѱ��� ���� �װ��� ���� �迭����ϱ� �ָ��ϴϱ�
}
//�μ�Ʈ
class DBInsert extends DB{
	private User setUser() {
		// TODO Auto-generated method stub
		User user = new User(); 
		Scanner scanner = new Scanner(System.in);
		
		boolean validate = false;
		String validateTemp;
		do {
			System.out.println("�ű� ȸ���� �Ƶ�� �Է��ϼ���(��� ����):");
			user.userID = scanner.nextLine();
			System.out.println("�ű� ȸ���� �̸��� �Է��ϼ���:");
			user.name = scanner.nextLine();
			System.out.println("�ű� ȸ���� ���̸� �Է��ϼ���(���ڸ�):");
			user.age = Integer.parseInt(scanner.nextLine());//�Է°��� ���̴�	���� �޾Ƽ� int�� ��ȯ���Ѽ� ��.
			System.out.print("�ű� ȸ���� ������ �Է��ϼ���:");
			user.job = scanner.nextLine();
			
			System.out.println("�ű�ȸ�� : ���̵�:" + user.userID + "/�̸�:"+user.name + "/"+user.age+"��/����:"+user.job+"/"+ "�� �½��ϱ�?(y/n)");
			validateTemp = scanner.nextLine();//�Է°� ����
			
			validate = !validateTemp.equals("y");//�Է� ����y�� �ƴ� �ܿ� true, ���� ��� false�� ��ȯ
			//System.out.println(validate);
		} while (validate);
		scanner.close();
		return user;
	
}
	public void insertUser() throws SQLException{
		User user = setUser(); //���̾��̴� ����̹Ƿ� ����ϱ� 
		//setuser�� ������ �������� ������. 
		String insertSql ="INSERT INTO tb_user(id, name,age,job)VALUES" +"(' " + user.userID + "','"+user.name+"','" + user.age+"','"+user.job+"')";
		//����ǥ�� �־ �߰� ������ ����. ���ڿ��� �ְ� ���ڴ� �ȳ־ �Ǵµ� �׳� �� ���̴°� ����
		pstmt = conn.createStatement();//���� ���� �غ�
		int rs = pstmt.executeUpdate(insertSql);
		//pstmt.excuteQuery(): select
		//pstmt.excuteUpdatte():insert,update,delete..
		
		if(rs ==1) {
			//System.out.println(rs);
			System.out.println("������ �Է¿� �����߽��ϴ�.");
		}else {
			System.out.println("������ �Է¿� �����߽��ϴ�.");
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
		
	
		//		setuser�� �����ϸ� DBInsert�� �ִ�user�� ����ǰ� /return user�ص� ��. ��.
//int rs �� ������ ������.
}}
