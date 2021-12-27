package third;
import java.util.*; // * :자바 안에 모든것을 긁어온다.
public class Third_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
//		
		Scanner stdIn = new Scanner(System.in);
	//	int book = input.nextLine();	
		System.out.printf("일년 동안 읽은 책 수는?:");
		int book = stdIn.nextInt();
		book = book/10;
		switch(book) {
		case 0:
			System.out.println("조금 더 노력하세요!");
			break;
		case 1:
			System.out.println("10권~ 20권 미만 :책 읽는 것을 즐기는 분이시네요!");
			break;
		case 2:
			System.out.println("20권~30권미만 : 책을 사랑하는 분이시네요!");
			break;
		default:
			System.out.println("30권이상 : 당신은 다독왕입니다.");
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
		System.out.println(ranking + "등 메달의 색깔은" + medalColor + "입니다.");
		 
		
		
		//달 
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
				System.out.println("존재하지 않는 달입니다.");
		}
		System.out.println(month +"월은"+ day+"까지 있습니다.");
	
		 
//비연속 숫자일 경우or사용가능
		if  (month == 10 || month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 12 ) {
			day = 31;
			System.out.println(month +"월은"+ day+"까지 있습니다.");	
		}
		else if (month == 6 ||month == 4 || month == 9 ||month== 11){
			day = 30;
			System.out.println(month +"월은"+ day+"까지 있습니다.");	
		}
		else {
		System.out.println("존재하지 않는 달입니다.");
		}
		
	
	}

	
	
	
}
