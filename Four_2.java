package four;
import java.util.*;
public class Four_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String answer = "Y"; // while�� ���۵� �� �ֵ��� ���� ���� �ʱ�ȭ
		int count = 0;
		
		while (answer.equals("Y")) {
			System.out.println("������ ����Ͻðڽ��ϱ�? (Y)");
			answer = sc.nextLine(); //������� ������ �޽��ϴ�.
			
			if (answer.equals("Y")){
				++count;
				System.out.println("������" + count + "�� ����߽��ϴ�.");
			}
		}
		System.out.println("�������");
		
		
		//do_while�� do:�ѹ��� �� ��µǴ°� 
		int z = 100;
		do {
			System.out.println("��� �ѹ��� ��µǴ� ����");
		}while(z <50);

		
		//����� ������� �ݺ�Ƚ�縦 ���� �� �ִ�.  while(True) ; Ʈ���ϰ�� ���ѹݺ���.
		//nextline : ���ڿ�, nextint : ����
		Scanner ac = new Scanner(System.in);
		int sum = 0;
		int i;
		while(true){
			System.out.println("���� ���ڸ� �Է��ϼ��� : (�����Ϸ��� 0�Է�)");
			i = ac.nextInt();//�����Է¹޾Ƽ� i�� ����
			if (i==0) {//���� 0�� �Է��ߴٸ� ���� 
				break;
			}
			sum += i ;//�Է¹��� ���� �����ֱ� 
		
		}
		System.out.println("��������� ���� = "+ sum);
		
		
		//continue: �� �ؿ� ���ǽ��� �������� �ʰ� �ٽ� ó������ continue������ �ݺ��Ѵ�. VS break�� �� �ݺ� ���ǹ� ��ü�� ������ ���.
		int money =10000;
		System.out.println("���� ���� ����"+ money+"�� �Դϴ�. ");
		Scanner done = new Scanner(System.in);
		
		while(true) {
			System.out.println("�󸶸� ����Ͻðڽ��ϱ�?");
			int m = done.nextInt();//������ �Է¹���
			
			if(!(m >=0 && m <money)) {
				//if ( m >=00|| m<money){
				//���� ���� ������ ũ�ų�, ������ �Է��ϸ� �ٽ� �Է� �䱸
				System.out.println("�ٽ� �Է����ּ���.(�������� Ʋ�Ƚ��ϴ�.)");
				continue; //������ �ݺ��� ����� �ٽ� �ݺ��� �����ϱ�
			}
			money = money - m;
			System.out.printf("���� %d���� ���Ҿ��ϴ�.\n", money);
			//���� �� ���� ���
			if(money == 0 ) {//���� 0���� �Ǹ� ����
				break;
			}
		}
		System.out.println("��� ���� ����߽��ϴ�. ����");
		
		
		
		
		}
	
	}
	
		

