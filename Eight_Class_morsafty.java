package eight;

public class Eight_Class_morsafty {
	String StudentName;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student student1 = new Student();
	//���ּҴ� student1�� �����
	///���� student1.studentName = "�ȿ���";
	student1.setStudentName("�ȿ���");
	 
	System.out.println(student1.getStudentName());
	
	Student student2 = new Student();
	//student2.studentName = "ȫ�浿";
	student2.setStudentName("ȫ�浿");
	System.out.println(student2.getStudentName());
	
	student1 = student2;
	//�ּ� ���� sutndent1 �� 2�� �ٲ� 
	System.out.println(student1);
	System.out.println(student2);
	System.out.println(student1.getStudentName());
	System.out.println(student2.getStudentName());
	}

}
