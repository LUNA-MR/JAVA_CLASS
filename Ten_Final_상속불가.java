package ten;

class FinalClass{//final이 붙었는것은 상속만 불가능
	int number = 4;//상수
}
class Parents extends FinalClass // error발생
{
	final void finalMethod() { //오버라이딩 불가한 메소드 //상속가능하나 오버라이딩 불가
	// void finalMethod() {
		System.out.println("상속 불가한 메소드");
		}
}
class Son extends Parents{ //parent상속 받는 건 문제 없지만
	//void finalMethod() {//finalmethod를 사속받으려니 에러 발생
}

public class Ten_Final_상속불가{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalClass member1 = new FinalClass();
		System.out.println(member1.number);
		member1.number = 5;//상수는 변경 불가
		 
	}
}
