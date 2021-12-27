package third;
import java.util.*; 
public class Third_if_and_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner stdIn = new Scanner(System.in);
		System.out.print("계절을 표시합니다. \n 몇 월 입니까?:");
		int month = stdIn.nextInt();
		
		if (month>=3 && month<=5) {
			System.out.println(month+" 월은 봄입니다.");			
		}
		else if(month >= 6 && month <=8) {
			System.out.println(month + "월은 여름입니다.");
		}
		else if(month >=9 && month <=11) {
			System.out.println(month + "월은 가을입니다.");
		}
		else if(month == 12 || month <=2) {
			System.out.println(month + "월은 겨울입니다.");
		}
		else {
			System.out.println("잘못된 입력값입니다.");
		}
		
		switch(month) {
		case 1: case 2: case 12:
			System.out.println(month + "월은 겨울입니다.");
			break;
		case 3: case 4: case 5:
			System.out.println(month+" 월은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println(month + "월은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println(month + "월은 가을입니다.");
			break;
		default:
			System.out.println("잘못된 입력값입니다.");
		}
	}
}
