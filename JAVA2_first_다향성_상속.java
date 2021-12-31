package java2_first;
//다양성 = 상속관계를 말함.
class A{
	void methodA() {
		System.out.println("methodA");
	}
}

class B extends A { //B가 A를 상속
	void methodB() {
		System.out.println("methodB");
	}
}

 
 
public class JAVA2_first_다향성_상속 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new B();//B는 메소드 B로 쓸수 있음 원래 new 뒤에 인스턴스 앞에랑 같음 b에 변수를 만드는데 앞에 b 말고 a를 붙임. //원래 A자리에 br가 오는데, A가 왔기 때문에 A의 메소드를 사용가능.
		// B obj = new B();이렇게 하면 부모, 자식 둘다 사용 가능 
		obj.methodA();//앞에 a가 오므로써 변수 앞a가 오므로  class a만 사용가능
//		obj.methodB(); error뜸
	}

}
