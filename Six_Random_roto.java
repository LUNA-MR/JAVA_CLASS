package six;

public class Six_Random_roto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//45개의 정수값을 저장하기 위한 배열 생성.
		//로또는 중복번호를 쓸 수 없다  temp사용(예, 카드섞기 )
		//자릿수만 바꿔치기 temp쓰기 
		//어떤수를 random 에 곱하면 나오는 수는  어떤수-1까지 만 얻을 수 있음
		int[] ball = new int[45]; //공 45개 필요
		
			
		for(int i = 0; i<ball.length;i++)
			ball[i] = i+1;//ball[0]에 1이 저장된다. 
						  //배열의 각 요소에 1~45의 값을 저장한다.
		
		int temp = 0;
		int j = 0;
		
		//배열에 저장된 값이 잘 섞이도록 충분히 큰 반복횟소를 지정한다.
		//배열의 첫 번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
		for(int i = 0; i<1000 ;i++) {
			j = (int)(Math.random()*45);//배열 범위(0~44)의 임의의 값을 얻는다. 
			temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
			
		}
		// 배열 ball의 앞에서 부터 6개의 요소를 출력한다 
		for(int i=0; i<6; i++)
			System.out.print(ball[i]+" ");
		
		
	}

}
