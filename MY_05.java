package javaSqlite;
//select

import java.sql.ResultSet;
import java.sql.SQLException;

 

class DBSelect extends DB{
	//�߰��� �ڵ�
	public ResultSet querySelect(String sql) {//select����
		try {
			pstmt = conn.createStatement();//���� ���� �غ�
			rs = pstmt.executeQuery(sql);//SELECT����� execteQuery()���
			
		}catch (SQLException e) {
			// TODO: handle exception
			System.out.println("error:"+e);
		}return rs;
	}
	public void printTablePerspon(String sql)throws SQLException{
		ResultSet rs = querySelect(sql);
		int num = 1;
		//�������� ó������ �о���Ƿ� next�� ������ �� ���� �о����, ���� �ٷ� ��������.
		//�ϸ� �� �� ���� �������鼭 �����͸� ��������, �����Ͱ� ������ ���� ���� �ȴ�.
		//rs�� next�� �����Ͽ� ���پ� ���� �����͸� �� �а� ���� false�� �����, 
		while (rs.next()) {
			System.out.println(num + " ��° ȸ��");
		System.out.println("���̵�: "+rs.getString(1));
		System.out.println("�̸�: "+ rs.getString(2));
		System.out.println("����: "+ rs.getString(3));
		System.out.println("����: "+ rs.getString(4));
		System.out.println();
		num++;
		}
	}
}
//���� ������ ��
//rs�� ������ rs�� ������
public class MY_05 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
	 DBSelect myDB = new DBSelect();
	 myDB.connectDB();
	 String sql = "SELECT * FROM tb_user";
	 myDB.printTablePerspon(sql);
	 myDB.closeDB();
		//�������� ���� �����ϱ� 
		//���̺� �ִ� ������ �� ��� �ö��� *�� ����Ѵ�. ��ɹ���.
	}

}
