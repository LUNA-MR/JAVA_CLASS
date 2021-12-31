package java2_first;


//override를 햇을경우 어떤게 실행되느냐

class Myparent2nd{
	protected int pi = 100;
	public void pDisplay() {
		System.out.println("Myparent2nd 첫번째  : pDisplay():pi=" + pi);			
	}
}
class MyChild2nd extends Myparent2nd{
	protected int ci = 200;
	//재정의된 메서드
	@Override
	public void pDisplay() {
		System.out.println("Override pDisplay(): pi"+pi);
		
	}
	public void cDisplay() {
		System.out.println("cDisplay():ci"+ci);	
	}
} 

public class JAVA2_first_abstract_interface_innerclass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 			// TODO Auto-generated method stub
			MyChild2nd cobj = new MyChild2nd();
			cobj.pDisplay(); //상위 클래스로부터 상속받은 매서드v//override pldisplay():pi=100
			cobj.cDisplay();//하위클래스에서 추가된 메서드 // cdisplay():ci=200
			
			Myparent2nd pobj = cobj;
			//재정의된 메서드로 업캐스팅이 되면 오히려 상위 클래스의매서드가 은닉되고 
			//하위 클래스에서 재정의도니 메서드가 호출된다.
			pobj.pDisplay();//override pdisplay():pi= 100
		}

	

}
