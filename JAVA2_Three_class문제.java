package java2_third;

 

class Student{
	 int ban, no, kor,eng,math;
	 String name;
	 //return :��ȯ�� 
	 int getTotal() {
		 return kor + eng+ math;
	 }//this�� ���� Ȯ���ϱ� 
	 float getAverage() {
		 return (float)this.getTotal()/3;
	 }
}

 
public class JAVA2_Three_class���� {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.name = "ȫ�浿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("�̸�: " + s.name);
		System.out.println("����: " + s.getTotal());
		System.out.println("���" + s.getAverage());

	 
	}

}

