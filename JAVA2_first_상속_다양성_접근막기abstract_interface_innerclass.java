package java2_first;

class Myparent1st{
	protected int pi = 100;
	public void pDisplay() {
		System.out.println("pDisplay():pi=" + pi);			
	}
}
class MyChild1st extends Myparent1st{
	protected int ci = 200;
	public void cDisplay() {
		System.out.println("cDisplay(): ci"+ci);
		
	}
}
public class JAVA2_first_상속_다양성_접근막기abstract_interface_innerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyChild1st cobj = new MyChild1st();
		cobj.pDisplay(); //상위 클래스로부터 상속받은 매서드
		cobj.cDisplay();//하위클래스에서 추가된 메서드
		Myparent1st pobj = cobj;//업캐스팅(묵시적으로 지원)
		pobj.pDisplay();
		//업캐스팅된 상위 클래스형의 참조로는 확장된 하위 클래스의 맴버는 접근할 수 없다 
		//pobj.cDisplay();//오류
	}

}
