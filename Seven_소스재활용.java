package seven;
import java.util.Scanner;

public class Seven_�ҽ���Ȱ�� {
	static int max(int a, int b,int c) {
		int max = a;  
		if(b>max)max = b;
		if(c>max)max = c; 
		return max; //max�� ��ȯ�ϱ� max���� ���� �Լ����� ��������� �ؼ� return�� ��
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdInScanner = new Scanner(System.in);
		
		System.out.println("���� a : "); int a = stdInScanner.nextInt();
		System.out.println("���� b : "); int b = stdInScanner.nextInt();
		System.out.println("���� c : "); int c = stdInScanner.nextInt();
		
		System.out.println("�ִ밪��" + max(a, b, c)+ "�Դϴ�.");
	}

	
	//���� �ִ밪�� ��ȯ
//	if(a<b)
//		return b;
//	else return a;
}
