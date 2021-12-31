package java2_first;

 
 
//복합 에제  최종;
abstract class Animals{
	private String name;//이름
	public Animals(String name) {this.name = name;}
	public abstract void bark(); //짖는다
	public abstract String toString() ;//문자열 표현을 반환한다.
	
	public String getName() {return name;}
	public void instroduce() {
		System.out.println(toString() + "입니다.");
		bark();
	 
	}
}
//고양이 클래스
class Cat extends Animals{
	private int age;//나이
	public Cat(String name, int age) {super(name); this.age =age;}
	public void bark() {System.out.println("야옹!");}
	public String toString() {return age + "살인" + getName();	}
		
	
}
//개 클래스
class Dog extends Animals{
	private String type;// 견종
	public Dog(String name, String type) {
		super(name); this.type = type;
		
	}
	public void bark() {System.out.println("멍멍!!");}
	public String toString() {return type +"인 "+ getName();
		
	}
}

public class JAVA2_first_추상상속_for_each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals[] a = {
			new Dog("바둑이","삽살개"),
			new Cat("아롱이", 7),
			new Dog("백두"," 진돗개")};
	for(Animals k : a) {
		k.instroduce();//k가 참조하고 있는 인스턴스의 형에 따라서 
		System.out.println();//메소드 호출된다.
	}
	}

}
