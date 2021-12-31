package java2_second;
//public 접근 모두 가능
//final 한번 정하면 더이상 변경 불가 
//static 객체 생성 안해도 사용 가능
//추상클래스를 상속받게 되면 다른 class를 더 상속 받을 수 없음
//class는 단일 상속 , 상속을 하나만 받을 수 있따. 
//인터페이스를 사용하면 상속하나를 받고  implements를 써서 구현을 추가 하는 데 즉, 상속을 하나 더 받을 수 있는 장점이 있다. 


//인터페이스
interface Providable{
	void leisureSports();//public abstract 생략하더라도 컴파일러가 알아서 붙여줌
	void sightseeing();
	void food();
}
class KoreaTour implements Providable{ //추상클래스와 동일하게 아래 세개를 구현해야함.
	public void leisureSports() {
		System.out.println("한강에서 수상스키 투어");
		}
	public void sightseeing() {
		System.out.println("경복궁 관람 투어");
		
	}
	public void food() {
		System.out.println("전주 비빔밥 투어");
		
	}
}
class TourGuide{
	private Providable tour = new KoreaTour();
	//인터페이스로 타입 선언
	public void leisureSports() {
		tour.leisureSports();
	}
	public void sightseeing() {
		tour.sightseeing();
	}
	public void food() {
		tour.food();
	}
 }
public class JAVA2_two_Interface {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TourGuide guide = new TourGuide();
		guide.leisureSports();
		guide.sightseeing();
		guide.food();
	}

}
