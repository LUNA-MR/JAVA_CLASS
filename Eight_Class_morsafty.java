package eight;

public class Eight_Class_morsafty {
	String StudentName;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student student1 = new Student();
	//집주소는 student1에 저장됨
	///기존 student1.studentName = "안연수";
	student1.setStudentName("안연수");
	 
	System.out.println(student1.getStudentName());
	
	Student student2 = new Student();
	//student2.studentName = "홍길동";
	student2.setStudentName("홍길동");
	System.out.println(student2.getStudentName());
	
	student1 = student2;
	//주소 복사 sutndent1 이 2로 바뀜 
	System.out.println(student1);
	System.out.println(student2);
	System.out.println(student1.getStudentName());
	System.out.println(student2.getStudentName());
	}

}
