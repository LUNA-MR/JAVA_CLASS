package javaSqlite;

public class TEST {
	//Drive Ŭ������ �ε�
	public static void loadDriver() {
		// TODO Auto-generated method stub
		try {
			//org.mariadb.jdbc.DriverŬ������ �޸𸮿� �ε����ش�.
			Class.forName("org.sqlite.JDBC");
			System.out.println("Driver Load Success!");
		}
		catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		loadDriver();
	}

}
