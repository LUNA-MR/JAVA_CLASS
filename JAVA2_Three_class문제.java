package java2_third;

 

class Student{
	 int ban, no, kor,eng,math;
	 String name;
	 //return :반환형 
	 int getTotal() {
		 return kor + eng+ math;
	 }//this가 뭔지 확인하기 
	 float getAverage() {
		 return (float)this.getTotal()/3;
	 }
}

 
public class JAVA2_Three_class문제 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("이름: " + s.name);
		System.out.println("총점: " + s.getTotal());
		System.out.println("평균" + s.getAverage());

	 
	}

}

