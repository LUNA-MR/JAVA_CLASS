package nine;
//overloading : sum�� �������ε� �� ���ڰ� �ٸ����, �ߺ���밡��

public class Nine_Overloading {
	static int sum(int a, int b) {
		System.out.println("���ڰ� ���� ��� ȣ���");
		return a+b;
	}
	static int sum(int a, int b, int c) {
		System.out.println("���ڰ� ���� ��� ȣ���");
		return a+b+c;
	}
	static double sum(double a, double b, double c) {
		System.out.println("dougle Ÿ���� ��� ȣ�� ��");
		return a+b+c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(3, 2));
		System.out.println(sum(2, 3,4));
		System.out.println(sum(2.5,3.4, 5.5));
	}

}
