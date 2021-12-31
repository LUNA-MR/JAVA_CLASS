package java2_second;
interface MyInterface{
	//추상클래스 객체생성가능
	//4가지다 같은 말임. 여기 안에서는 강제로 public static final 붙음 
	//finall의 속성 초기화하기 = 10;이런식으로 
	int w = 10;//public static final생략
	static int x= 20;//public final생략
	final int y = 30;// public static 생략
	public static final int z = 40;
}

public class JAVA2_two_Interfae_publicStaticFinal생략 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyInterface mi = new MyInterface();//complie Error // 단독으로 객체생성 불가 
		//MyInterface.w  = 50; //Compile Error상수는 값을 못바꾸기 때문에 상수의값을 바꾸려고 시도했기때문에 에러 뜨는거임
		System.out.println("w =  " + MyInterface.w);
		System.out.println("x =  " + MyInterface.x);
		System.out.println("y =  " + MyInterface.y);
		System.out.println("z =  " + MyInterface.z);
	}

}
