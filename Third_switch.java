package third;
import java.util.*; // * :�ڹ� �ȿ� ������ �ܾ�´�.
public class Third_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
//		
		Scanner stdIn = new Scanner(System.in);
	//	int book = input.nextLine();	
		System.out.printf("�ϳ� ���� ���� å ����?:");
		int book = stdIn.nextInt();
		book = book/10;
		switch(book) {
		case 0:
			System.out.println("���� �� ����ϼ���!");
			break;
		case 1:
			System.out.println("10��~ 20�� �̸� :å �д� ���� ���� ���̽ó׿�!");
			break;
		case 2:
			System.out.println("20��~30�ǹ̸� : å�� ����ϴ� ���̽ó׿�!");
			break;
		default:
			System.out.println("30���̻� : ����� �ٵ����Դϴ�.");
		}
		
		
		int ranking =1 ;
		char medalColor;
		switch(ranking){
			case 1:
				medalColor = 'G';
				break;
			case 2:
				medalColor = 'S';
				break;
			case 3:
				medalColor = 'B';
				break;
			
			default:
				medalColor = 'A';
				break;
		}
		System.out.println(ranking + "�� �޴��� ������" + medalColor + "�Դϴ�.");
		 
		
		
		//�� 
		int month = 10;
		int day;
		
		switch(month){
			
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				day = 31;
				break;
				
			case 4: case 6: case 9: case 11:
				day = 30;
				break;
				
			case 2:
				day = 28;
				break;
				
			default: 
				day = 0;
				System.out.println("�������� �ʴ� ���Դϴ�.");
		}
		System.out.println(month +"����"+ day+"���� �ֽ��ϴ�.");
	
		 
//�񿬼� ������ ���or��밡��
		if  (month == 10 || month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 12 ) {
			day = 31;
			System.out.println(month +"����"+ day+"���� �ֽ��ϴ�.");	
		}
		else if (month == 6 ||month == 4 || month == 9 ||month== 11){
			day = 30;
			System.out.println(month +"����"+ day+"���� �ֽ��ϴ�.");	
		}
		else {
		System.out.println("�������� �ʴ� ���Դϴ�.");
		}
		
	
	}

	
	
	
}
