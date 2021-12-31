package java2_first;
//private 는 같은 class내에서만 적용가능,접근가능.
//abstract = 추상메소드라는것

abstract class Pokemon{//포켓몬 추상 클래스 만듬
	//  abstract + class/method하면 추상이라는것임.
	String nameString; 

	//선언만 하기  
	abstract void attack();//공격 추상 메소드 상속받은 클래스에서 무조건 구현해야함.
	abstract void sound();
	//추상 메소드를 설정하면 무조건 구현해야함.	
	
	public String getName() {//포켓몬의 이름을 리턴하는 메서드 
		return this.nameString;
	}

}

class Pikachu extends Pokemon{//피타츄 클래스
	Pikachu(){//이름을 지정하는 생성자
		this.nameString = "피카츄"; //this는 변수의 범위를 나타냄?
	}
	void attack() {//구체적으로 구현
		System.out.println("전기 공격");
	}
	void sound() {
		System.out.println("피카피카!");
	}
}
class Squirtle extends Pokemon{//피카츄 클래스
	Squirtle() {//이름을 지정하는 생성자
		this.nameString="꼬부기";
	}
	void attack() {//구체적으로 구현
		System.out.println("물 공격");
		
	}	
	void sound() {
		System.out.println("꼬북 꼬북!");
	}

}

public class JAVA2_first_상속_추상메서드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pikachu pikachu1 = new Pikachu();
		System.out.println("이 포켓몬은" + pikachu1.getName());
		pikachu1.attack();
		pikachu1.sound();
		
		Squirtle squirtle1 = new Squirtle();
		System.out.println("이 포켓몬은"+ squirtle1.getName());
		squirtle1.attack();
		squirtle1.sound();
	}

}
