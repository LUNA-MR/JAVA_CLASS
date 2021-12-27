package five;

public class Five_Second_array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //문제  sum구하기
		   int[]arr= {10,20,30,40,50};
		   int s=0;
		   for(int n = 0; n <arr.length; n++) {
			   s += arr[n];
		   }
		   System.out.println("총점 : " + s);
		   System.out.println("평균 : "+ s/(float)arr.length);
		   
	
		//입력된 데이터만 출력하기 
		double[] data = new double[5];
		int size = 0;
		data[0] = 10.0; size++;
		data[1] = 20.0; size++;
		data[2] = 30.0; size++;
		
		for(int i = 0; i<size; i++) {
			System.out.println(data[i]);
		}
		
		
		//최대값/최소값 백엔드 월평균 접속자수 그래프로 뽑은뒤 많이 들어온것, 적게들어온날 쓸때 혹은 매출별 
		int[] score = { 1,2,344,10,34,453,234,7,68,8,65};
		int max = score[0];//배열의 첫 번째 값으로 최대값을 초기화한다. 
		int min = score[0];
		for(int i = 0; i<score.length;i++) {
			if (score[i]>max){
				max = score[i];
			}
			if (score[i]<min){
				min = score[i];
				
			}
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);

		
		//횟수를 충분히 섞기 위해 1000번을 넣음.적은 회수를 넣을시 제자리에 있는 숫자가 많음.
		//랜덤
		int[] number = new int[10];
		for(int i=0; i<number.length;i++) {
			number[i] = i;//배열을 0~9의 숫자로 초기화한다. 
			System.out.println(number[i]);
		}
		System.out.println();
		for(int i =0; i<100; i++) {
			System.out.print(i);
			int n = (int)(Math.random()*10); //0~9중의 한 값을 임의로 얻는다. 
			//0.0*10 = 0,0.9*10 = 9이니까 소수점이 다 잘림.
			//Math.random(): 0.0이상, 1.0미만의
			//double 값의 난수를 균일한 분포로 반환
			//System.out.println(Math.random());
			System.out.println("7미만으로:" + (int)(Math.random()*7)); //곱하기 했던 숫자 -1 까지만 나온다.
			int temp = number[0];
			number[0] = number[n];
			number[n] = temp; 
		}  // temp를 사용하여 같은자리의 번호를 바꾸기 할때 
		for (int i =0; i<number.length ; i++) {
			System.out.println(number[i]); // 배열의 내용을 출력한다. 
		}
		
}
}
