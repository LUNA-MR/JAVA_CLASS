package five;

import java.util.Arrays;
//array를 import 해야 print할때 [ㅇ,,ㅇ,ㅇㅇ,]list처럼 나옴.
public class Five_First2011_11_22array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열의 좋은점 :  int 하나 설정해서 100개이상을 한번에 만들수 있고, for문에 사용하기 좋음
		//while 몇 번째 까지 반복문, for문  배열출력 목적 + 반복
		// first 첫번째  초기값이 0으로 할 경우.
		int[] student = new int[3]; //길이가 3인 배열 생성
		System.out.println("현재 자동으로 초기화된 값:"+student[0]);
		
		student[0] = 30;//배열의 첫 번째 요소에 30을 저장
		student[1] = 20; // 배열의 두 번째 요소에 20을 저장
		student[2] = 10;//배열의 세 번째 요소에 10을 저장
		
		System.out.println("현재 첫 번째 요소의 값:"+ student[0]);
		student[2] = 100;
		System.out.println("제일 마지막 요소의 값:"+ student[2]);
		
		
		//여러가지 배열 설정 방법  
		//1.for 문을 이용한 출력
		//길이가 5인 배열 생성, 배열길이 생략
		int[] a= new int[] {10,20,30,3,15};
	
//		2.new int 생략가능 
		//방 번호 따로 안하고, 옆에 따로 적으면됨
		//길이가 7인 배열 생성, new int[] 생략 가능
		int[] b = { 1,2,3,4,5,6,7};
	
		
//		3.for 문 배열 초기화 10개 생성이니까 길이는 .length 로 배열의 개수 나옴.
		int[] c = new int[10];
		for(int i = 0; i< c.length;i++) {
			c[i] = i;
		}
		System.out.println(c.length);
		
//		4.foreach문 을사용하여 출력 ,  int d: 자동으로 배열의 개수만큼 0번부터 돈다. c는 배열이름.
		
		for(int i = 0; i<c.length; i ++) {
			System.out.print(c[i]);
		}
		
//		5.배열을 문자열로 바꾸는 방법  importjava 있어야함. 연산은 불가능함. 뭐가 들어있는지 확인하기 위해 출력하여 보는 용도임. 
		System.out.println();
		for(int d:c) {
			System.out.print(d);
		}
		System.out.println();
		System.out.println(Arrays.toString(c));
		//Arrays.toString 매서드 사용
	
//    배열을 통한 평균 점수 내기 
	   int[] score = {100,96,90,88,93};
	   int sum = 0;
	   for (int i = 0; i<score.length; i++) {
		   sum += score[i];
		   
	   }

	   System.out.println("시험 평균 점수 : "+ sum/(float)score.length);
	   
	   
	   
	   
	  
	   
	}
}
