package nine;
 
class Data{int x;}

public class Nine_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main(String[] args)�� ���۵Ǿ���.");
		firstMethod();
		System.out.println("main(String[] args)�� ������");
		
		///////////////////////////////////////
		Data d = new Data();
		d.x = 10;
		System.out.println("main1() : x = " + d.x);
		
		d.x = change(d.x);
		
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	////////////////////////////
	static void firstMethod() {
		System.out.println("firstMethod()�� ���۵Ǿ���");
		SecondMethod();
		System.out.println("firstMethod()�� ������.");
	}
	static void SecondMethod() {
		System.out.println("SecondMethod()�� ���۵Ǿ���");
		System.out.println("SecondMethod()�� ������.");
	}
	///////////////////////////////////////
	 
	static int change(int x) {
		x = 1000;
		System.out.println("change() : x " + x);
		return x;

	}
	}
