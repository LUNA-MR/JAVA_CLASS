package third;
import java.util.*; 
public class Third_if_and_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner stdIn = new Scanner(System.in);
		System.out.print("������ ǥ���մϴ�. \n �� �� �Դϱ�?:");
		int month = stdIn.nextInt();
		
		if (month>=3 && month<=5) {
			System.out.println(month+" ���� ���Դϴ�.");			
		}
		else if(month >= 6 && month <=8) {
			System.out.println(month + "���� �����Դϴ�.");
		}
		else if(month >=9 && month <=11) {
			System.out.println(month + "���� �����Դϴ�.");
		}
		else if(month == 12 || month <=2) {
			System.out.println(month + "���� �ܿ��Դϴ�.");
		}
		else {
			System.out.println("�߸��� �Է°��Դϴ�.");
		}
		
		switch(month) {
		case 1: case 2: case 12:
			System.out.println(month + "���� �ܿ��Դϴ�.");
			break;
		case 3: case 4: case 5:
			System.out.println(month+" ���� ���Դϴ�.");
			break;
		case 6: case 7: case 8:
			System.out.println(month + "���� �����Դϴ�.");
			break;
		case 9: case 10: case 11:
			System.out.println(month + "���� �����Դϴ�.");
			break;
		default:
			System.out.println("�߸��� �Է°��Դϴ�.");
		}
	}
}
