package javaSqlite;
//MY_02�� DB�� ��ӹ���

class DBCreateTable extends DB{
	//���̺��� �����ϴ� �޼ҵ�
	//������ ���̺� �̸��� �����ϴ� sql���� �Ű� ������ ����
	public void createTable(String tableName, String sql) {
		//���̺��� ���� �ϴ��� Ȯ��
		try {
			pstmt = conn.createStatement();//���� ���� �غ� pstmt�� ����
			pstmt.executeUpdate(sql);//sql���� ����
			System.out.println(tableName + "���̺� ������ �����߽��ϴ�."); // ���̺� ���� ����.
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("db connect err:"+e);  //���� ���ܰ� �߻��ϸ� ��µǴ� ����
		}
	}
}//������ ���̺��� �ι� ���� �ȵǱ� ������ ó�� ��½ô� ������ ��������,  �ѹ��� ����� ������ ������ ����. 

public class MY_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBCreateTable myDB = new DBCreateTable();  
		myDB.connectDB();//������ �Ǿ����� � ���̺��� �����Ǵ��� Ȯ���� ���� �߰� 
		String sql = "CREATE TABLE tb_user(id VARCHAR(100) , name VARCHAR(100)," 
				+ "age INT, job VARCHAR(100))";//conn�� �θ� Ŭ�������� ���� ������ ���̽��� ������ �°���.
		myDB.createTable("tb_user", sql);   // �ش� �������� db�� ����.
		myDB.closeDB();
	}

}
