package ten;

class Person{// 사람클래스
	void breath() {
		System.out.println("숨쉬기");
	}
	void eat() {
		System.out.println("먹기");
	}
	void say() {
		System.out.println("말하기");
	}
	
}

class Student extends Person{//사람 클래스를 상속한 학생 클래스
	void learn (){
		System.out.println("배우기");
	}
}

class Teacher extends Person{//사람 클래스를 상속한 선생님 클래스
	void teach(){
		System.out.println("가르치기");
	}
}


public class Ten_객체지향_상속과다양성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//상속
		 Student s1 = new Student();//학생 인스턴스 s1생성
		 s1.breath();//사람 클래스의 breath메서드를 상속 받았음
		 s1.learn();
		 
		 Teacher t1 = new Teacher();//선생 인스턴스 t1생성
		 t1.eat();//사람 클래스의 eat메서드를 상속받았음
		 t1.teach();
		 
	}

}
