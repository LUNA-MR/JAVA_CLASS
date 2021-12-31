package java2_third;

import java2_third.OuterClass.StaticInner;

class OuterClass{
	int a = 3; 
	static int b = 4;
	
	class Inner{//내부 클래스
		int c = 5;
		public void innerMethod() {
			System.out.println("<Inner Class>");
			
		}
	}
	static class StaticInner{//static 내부 클래스
		int d = 6;
		static int stat = 10;
		public static void staticMethod() {
			System.out.println("<Static Inner>");
		}
	}
	 
}
public class JAVA2_Three_중첩class불러오기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass oc = new OuterClass();
		System.out.println("OutherClass의 a값 = " + oc.a);//3
		
		//static변수라서 클래스명으로 접근 가능
		System.out.println("OuterClass의 b값 =" + OuterClass.b);//4
		System.out.println("OuterClass의 StaticInner의 stat값 = " + OuterClass.StaticInner.stat);
		//System.out.println("OuterClass의 b값 = " + OuterClass.StaticInner.d);//접근 불가 
		
		System.out.println("\n====== inner 클래스 접근하기 ======");
		OuterClass oc2 = new OuterClass();
		OuterClass.Inner i= oc2.new Inner();
		
		System.out.println("Inner의 c값 = " + i.c); //5
		i.innerMethod();//<Iner class>
		
		OuterClass.StaticInner si = new OuterClass.StaticInner();
		System.out.println("StaticInner의 d값 = " + si.d);//6
		
		//객체를 사용해 접근
		StaticInner.staticMethod();//<static Inner>
		
		//클래스명으로도 접근 가능
		OuterClass.StaticInner.staticMethod();//<Static Inner>

	}

}
