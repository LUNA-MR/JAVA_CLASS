package javaSqlite;

public class TEST {
	//Drive 클래스를 로드
	public static void loadDriver() {
		// TODO Auto-generated method stub
		try {
			//org.mariadb.jdbc.Driver클래스를 메모리에 로딩해준다.
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
