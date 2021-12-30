package ten;

 

class USer{
	//public String name;
	private String name;  
	//public int age;
	private int age; //데이터의 경우 앞에 아무것도 안붙이면 private; 접근 제한 목적
	//같은 class외에는 접근 불가 
	//메소드를 통해서만 접근가능해짐
	USer(String name, int age){//매개변수를 가진 생성자
		this.name = name;
		this.age = age;
	}
	
	//private의 경우 접근 가능한거는 set임
	//1. 위에 private를 만들었기 때문에 아래 4개 public 이 필요함.(필수는 아님)
	public void setName(String name) {
		//setName 을 굳이 할 필욘없지만  변수변경시 set을 쓰는 것을 암묵적으로 쓰기로 함
		this.name = name;
		 
	}
	public String getName() {
		//이름이 필요할 경우? 가져오는것?
		return name;
	}
	public void setAge(int age) {
//		 if(age<150) {
			this.age= age;
	
		//}
	}
	public int getAge() {
		return age;
	}
}

public class Ten_GET_SET접근제한자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		USer user1 = new USer("철수", 20);//인스턴스 생성
		USer user2 = new USer("영희", 19);//인스턴스 생성
		//user2.age = 99;//error발생, 직접적 접근 불가
	
		
		user2.setAge(2021);
		System.out.println(user2.getName()+"의 나이는 : "+user2.getAge());
	
		
		
		//	System.out.println(user1.name + "의 나이는 " + user1.age); //private경우 에러뜸
	//	user2.age=2021;
	//	System.out.println(user2.name+ "의 나이는"+user2.age);
		}

}
