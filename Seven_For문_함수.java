package seven;
import java.util.*;




public class Seven_For��_�Լ� {
	
	//--���� '*'�� n�� ���� ǥ�� --//
	//void �޼ҵ�
		
	static void purStarts(int n) {
		while(n-->0)
			System.out.print('*');
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner stdIn = new Scanner(System.in);
	System.out.println("���Ϻ��� ������ �����簢���� ǥ���մϴ�.");
	System.out.print("�� ��? : ");
	int n = stdIn.nextInt();
	
	for (int i=1;i<=n;i++) {
		purStarts(i);
		System.out.println();
	}
	}

}
