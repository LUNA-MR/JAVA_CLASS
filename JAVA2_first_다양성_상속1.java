package java2_first;

 
class Animal{
	void breath() {
		System.out.println("숨쉬기");
	}
}

class Lion extends Animal{
	public String toString() {
		return "사자";
	}
}

class Zookeeper{//사육사 클래스
	void feed(Lion lion) {//사자에게 먹이주는 매소드  //feed(매개변수 매개변수)
		System.out.println(lion + "에게 고기 주기");
	}
}
public class JAVA2_first_다양성_상속1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion lion1 = new Lion();//Lion인스턴스 생성
		Zookeeper james = new Zookeeper();//james라는 이름의 사육사 인스턴스 생성
		james.feed(lion1);//james가 lion1에게 먹이를 줌
		System.out.println(lion1);
	}

}
