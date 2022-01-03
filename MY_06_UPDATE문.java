package javaSqlite;

import java.sql.SQLException;
import java.util.Scanner;

//������Ʈ�� ����� ����

//�̸� ���� ������ ��������
//���̵�� �и��� ���� ������
class DBUpdate extends DBSelect{ //DB�� �ִ� DBSelect�� �������� ��
	private User modifyUser() {
		//�ش� user�� select�ȿ� ����
		//�� ��Ű�� �ȿ� �����س����� ������ User�� �ٽ� ���� �ʿ����
		User user = new User();
		Scanner scanner = new Scanner(System.in);
		
		boolean validate = false;
		String validateTemp;
		do {
			System.out.println("���� ���� �� ȸ���� ���̵� �Է��ϼ���: ");
			user.userID = scanner.nextLine();
			System.out.println("ȸ���� �̸��� �Է��ϼ���: ");
			user.name = scanner.nextLine();
			System.out.println("ȸ���� ���̸� �Է��ϼ���: ");
			user.age = Integer.parseInt(scanner.nextLine());
			System.out.println("ȸ���� ������ �Է��ϼ��� : ");
			user.job = scanner.nextLine();
			
			System.out.println("���� �� ȸ�� :" + user.userID + "/ " + user.name + " /" + user.age+" / " + user.job + " �� �½��ϱ�?(y/n)");
			validateTemp = scanner.nextLine();
			//�Է� ���� y�� �ƴ� ��� true, ���� ��� false��ȯ
			validate = !validateTemp.equals("y");
		}while(validate);
		scanner.close();
		return user;
		
		//where������ id�ش��ȣ�� �̸�,����,���̸� �����ϴ°�
		
		//������Ʈ�� ������� �����͸� ������Ʈ ��Ŵ
		//���尪�� �ٲ��� ���� ��� else�� ����
		//int rs�ϱ� ���� �ѹ��̶� ������ 0���� ũ�ϱ� 
	    //�μ�Ʈ�� �����͸� �ϳ��� �Է��ϴϱ� �ϳ��� �´¸������� , ������Ʈ�� ���̵� ���� �ߺ��̶�� �������� ����ް� ��. 
		//������Ʈ���� �����ϸ� 1�̻����� �ϳ� �� �� ����. 
		//�μ�Ʈ ���� ������Ʈ���� ���̰� ����. 
		
	}
	public void updateUser() throws SQLException{
		User user =modifyUser();
		String updateSQL = "UPDATE tb_user SET name = '"+user.name + "',age='" +user.age+"',job='"+user.job+"'WHERE id = '" +user.userID + "'";
		//System.out.println(updateSQL);
		
		pstmt = conn.createStatement();//���� ���� �غ�
		int rs = pstmt.executeUpdate(updateSQL);
		
		if(rs>0) {
			System.out.println("���� ���� ������: : " + rs);
			System.out.println("������ ������ �����߽��ϴ�.");
			
		}
		else {
			System.out.println("������ ������ �����߽��ϴ�.");
		}
	}
}

public class MY_06_UPDATE�� {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
//�ٲ�� Ȯ���ҷ��� dbselect�� ��ӹ�������
		DBUpdate myDB = new DBUpdate();
		myDB.connectDB();
		myDB.updateUser();
		
		String sql = "SELECT * FROM tb_user";
		 
		myDB.printTablePerspon(sql);
		myDB.closeDB();
		}

}
