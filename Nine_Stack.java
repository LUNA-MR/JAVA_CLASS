package nine;
 
class Data{int x;}

public class Nine_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main(String[] args)이 시작되었음.");
		firstMethod();
		System.out.println("main(String[] args)이 끝났음");
		
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
		System.out.println("firstMethod()이 시작되었음");
		SecondMethod();
		System.out.println("firstMethod()이 끝났음.");
	}
	static void SecondMethod() {
		System.out.println("SecondMethod()이 시작되었음");
		System.out.println("SecondMethod()이 끝났음.");
	}
	///////////////////////////////////////
	 
	static int change(int x) {
		x = 1000;
		System.out.println("change() : x " + x);
		return x;

	}
	}
