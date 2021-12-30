package nine;
//overloading : sum이 여러개인데 각 인자가 다를경우, 중복사용가능

public class Nine_Overloading {
	static int sum(int a, int b) {
		System.out.println("인자가 둘인 경우 호출됨");
		return a+b;
	}
	static int sum(int a, int b, int c) {
		System.out.println("인자가 셋인 경우 호출됨");
		return a+b+c;
	}
	static double sum(double a, double b, double c) {
		System.out.println("dougle 타입인 경우 호출 됨");
		return a+b+c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(3, 2));
		System.out.println(sum(2, 3,4));
		System.out.println(sum(2.5,3.4, 5.5));
	}

}
