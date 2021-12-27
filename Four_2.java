package four;
import java.util.*;
public class Four_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String answer = "Y"; // while이 시작될 수 있도록 응닶 값을 초기화
		int count = 0;
		
		while (answer.equals("Y")) {
			System.out.println("음악을 재생하시겠습니까? (Y)");
			answer = sc.nextLine(); //사용자의 응답을 받습니다.
			
			if (answer.equals("Y")){
				++count;
				System.out.println("음악을" + count + "번 재생했습니다.");
			}
		}
		System.out.println("재생종료");
		
		
		//do_while문 do:한번은 꼭 출력되는것 
		int z = 100;
		do {
			System.out.println("적어도 한번은 출력되는 문장");
		}while(z <50);

		
		//사용자 마음대로 반복횟루를 정할 수 있다.  while(True) ; 트루일경우 무한반복임.
		//nextline : 문자열, nextint : 숫자
		Scanner ac = new Scanner(System.in);
		int sum = 0;
		int i;
		while(true){
			System.out.println("더할 숫자를 입력하세요 : (종료하려면 0입력)");
			i = ac.nextInt();//정수입력받아서 i에 저장
			if (i==0) {//만약 0을 입력했다면 종료 
				break;
			}
			sum += i ;//입력받은 값을 더해주기 
		
		}
		System.out.println("현재까지의 총합 = "+ sum);
		
		
		//continue: 그 밑에 조건식을 실행하지 않고 다시 처음부터 continue전까지 반복한다. VS break는 그 반복 조건문 전체를 완전히 벗어남.
		int money =10000;
		System.out.println("현재 가진 돈은"+ money+"원 입니다. ");
		Scanner done = new Scanner(System.in);
		
		while(true) {
			System.out.println("얼마를 사용하시겠습니까?");
			int m = done.nextInt();//정수를 입력받음
			
			if(!(m >=0 && m <money)) {
				//if ( m >=00|| m<money){
				//현재 가진 돈보다 크거나, 음수를 입력하면 다시 입력 요구
				System.out.println("다시 입력해주세요.(사용범위가 틀렸습니다.)");
				continue; //현재의 반복을 벗어나서 다시 반복을 시작하기
			}
			money = money - m;
			System.out.printf("이제 %d원이 남았씁니다.\n", money);
			//남은 돈 양을 출력
			if(money == 0 ) {//돈이 0원이 되면 종료
				break;
			}
		}
		System.out.println("모든 돈을 사용했습니다. 종료");
		
		
		
		
		}
	
	}
	
		

