package java2_third;

import java2_third.OuterClass.StaticInner;

class OuterClass{
	int a = 3; 
	static int b = 4;
	
	class Inner{//���� Ŭ����
		int c = 5;
		public void innerMethod() {
			System.out.println("<Inner Class>");
			
		}
	}
	static class StaticInner{//static ���� Ŭ����
		int d = 6;
		static int stat = 10;
		public static void staticMethod() {
			System.out.println("<Static Inner>");
		}
	}
	 
}
public class JAVA2_Three_��øclass�ҷ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass oc = new OuterClass();
		System.out.println("OutherClass�� a�� = " + oc.a);//3
		
		//static������ Ŭ���������� ���� ����
		System.out.println("OuterClass�� b�� =" + OuterClass.b);//4
		System.out.println("OuterClass�� StaticInner�� stat�� = " + OuterClass.StaticInner.stat);
		//System.out.println("OuterClass�� b�� = " + OuterClass.StaticInner.d);//���� �Ұ� 
		
		System.out.println("\n====== inner Ŭ���� �����ϱ� ======");
		OuterClass oc2 = new OuterClass();
		OuterClass.Inner i= oc2.new Inner();
		
		System.out.println("Inner�� c�� = " + i.c); //5
		i.innerMethod();//<Iner class>
		
		OuterClass.StaticInner si = new OuterClass.StaticInner();
		System.out.println("StaticInner�� d�� = " + si.d);//6
		
		//��ü�� ����� ����
		StaticInner.staticMethod();//<static Inner>
		
		//Ŭ���������ε� ���� ����
		OuterClass.StaticInner.staticMethod();//<Static Inner>

	}

}
