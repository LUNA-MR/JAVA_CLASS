package java2_first;
//메소드가 줄어듬
//3개에서 1개로 줄어듬

class Zookeeper2{
	void feed(Animal animal) {//사자에게 먹이 주는 메소드
		System.out.println(animal + "에게 고기 주기");
	}
}


public class JAVA2_first_다양성_상속_최종 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal lion1 = new Lion();//Lion 인스턴스 생성
		Zookeeper2 james= new Zookeeper2();//james라는 이름의 사육사 인스턴스 생성
		james.feed(lion1);//james가 lion1에게 먹이를 줌
		
		Animal rabbit1 = new Rabbit();
		james.feed(rabbit1);
		
		Animal monkey1 = new Monkey();
		james.feed(monkey1);
	}

}
