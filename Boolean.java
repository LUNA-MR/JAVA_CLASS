package two;

public class Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//boolean: True or False 두가지"값"만 나오는 참이냐 거짓이냐를 저장하기 위해 사용함.
		
		boolean a = true;
		boolean b = false;
		boolean c = !b;//b의 값을 반대로 바꾸어 출력
		
		System.out.println(a); //ture가 출력
		System.out.println(b); //false가 출력
		
		System.out.println(b); //false가 출력
		System.out.println(c); //ture가 출력
		
		
	//증가  ++
		int d = 1;
		System.out.println(d); //1
		d++;  // a의 값을 1 증가 시켜라  d 가 단독으로 한번만 사용할깨에는 앞에 ++를 붙이든 뒤에 ++ 붙이든 둘다 +1을 시키는 것이지만
		
		// 여러번 출력하는 경우 앞에 붙는 것과 뒤에 붙는 것은 차이가 있다. 
		
		
		System.out.println(d); //2
		System.out.println(++d); //: 기본 2 에 + 1 를 한뒤 d를 출력 하라 ; 증가 시킨 후 출력
		System.out.println(d++); // 먼저 d를 출력하고 그다음에 ++해놓아라  ; 출력 후 증가 
		System.out.println(d); //앞서 숫자에서 마지막에 ++ 해주라고 했으니까 여기서 출력된것은 전 값의 +1 한 값이 출력되어야함.
		
		
//if문이나 제어문에서 true,false값을 반환하기 위해 비교연산자 를 씀 
		System.out.println("비교연산자 :  ");
		int e = 10;
		int f = 20;
		int g = 30;
		System.out.println(e<f);
		System.out.println(e>f);
		System.out.println(e+f<=g);
		System.out.println(e+f>=g);
		
		
		//언어일치 불일치
		System.out.println("언어불일치: ");
		double h = 3.14;
		double i = 5.14;
		System.out.println(h ==i);
		System.out.println(h != i );
		
		String c1 = "Hello JAVA!";
		System.out.println(c1.equals("Hello java!"));
		System.out.println(c1.equals("Hello JAVA!"));
		
//논리연산자  and(&&) , or(||),xor(^)
		System.out.println("논리 연산자 : ");
		int z = 10;
		System.out.println(5<z && z <15);// true && true
		System.out.println((5<z && z<15) && z %2 ==0);
		System.out.println((5<z && z<15) && z %2!= 0 );
		
		z = 4;
		System.out.println((4<=z && z<15) && z%2 == 0); //true && true
		System.out.println((5<z && z<15) || z%2 != 0); //true ||false
		
		
//삼항연산자 조건?항목1(true이면 출력) : 항목2(false이면 출력)   -> 초기값 생성할때 많이함. 
		
		System.out.println("삼항연산자: 나이가 18살이면 ? ");
		int age = 18 ;
		System.out.println(age > 20? "성인입니다.": "청소년입니다.");

		
// 대입연산자
		System.out.println(" 대입 연산자:");
		int x = 3;
		int y = 5;
		System.out.println(y); //5
		y = x;
		System.out.println(y); //3
		
		System.out.println(x); //3
		x += 1;  //x = 1 + x  
		System.out.println(x);//4
		x /= 2;  // x = x/2
		System.out.println(x);//2
		x *= x ; // x = x * x
		System.out.println(x);//4
		
		
// &&(and)연산자 , || (or)연산자  
		System.out.println("제어문에서 많이 쓰이기 때문에 다시 한번 ");
		System.out.println(true && true);  //true
		System.out.println(true && false); //false
		System.out.println(false && true); //fasle
		System.out.println(false && false);  // false
		
		System.out.println(true || true); // true
		System.out.println(false || true); // true
		System.out.println(true || false); // true
		System.out.println(false|| false); // false
		
		
		
	}

}
