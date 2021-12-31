package java2_second;
//추상 메서드 // 공동개발을 위한 것임.

 

abstract class MyAbsParent{
	protected String name="MyAbsParent";
	//일반 메서드
	public void show() {
		System.out.println(name);
	}
	//구현부가 없는 추상 메소드
	public abstract void abstrctShow();
}

class MyChild extends MyAbsParent{
	//추상 메서드는 반드시 재정의 해야 한다. 
	@Override
	public void abstrctShow() {
		System.out.println("MyChild's abstracShow()");
	}
}
public class JAVA2_two_Abstract_추상메소드_override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyChild child = new MyChild();
		child.show(); //MyAbsParent//상속받은 일반 메서드 호출
		child.abstrctShow();//MyChild's abstractShow()//재정의된 추상 메서드 호출
	}

}
