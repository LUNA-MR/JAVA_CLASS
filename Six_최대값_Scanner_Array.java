package six;

import java.util.*;
public class Six_최대값_Scanner_Array {
	//외부에 함수 만들기 3개의 값을 전달받아서 최대값을 정해주는 함수를 만듬.
	static int max(int a, int b,int c) {
		int max = a;  
		if(b>max)max = b;
		if(c>max)max = c; 
		return max; //max를 반환하기 max값을 메인 함수값에 전달해줘야 해서 return을 씀
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//3명의 신장, 체중, 나이의 최대값을 구해서 표시
		Scanner stdIn = new Scanner(System.in);
		int[] height = new int[3]; //신장
		int[] weight = new int[3];
		int[] age = new int[3];
		for (int i = 0; i<3; i++) {//입력
			System.out.print("[" + (i+1 )+ "]");
			System.out.print("신장:"); height[i] = stdIn.nextInt();
			System.out.print("체중:"); weight[i] = stdIn.nextInt();
			System.out.print("나이:"); age[i] = stdIn.nextInt();
		}
		
		//신장의 최대값을 구하기 기존방법
	//	int maxHeight = height[0];
	//	if (height[1] > maxHeight) maxHeight = height[1];
	//	if (height[2] > maxHeight) maxHeight = height[2];
		
	//	int maxWeight = weight[0];
	//	if(weight[1]>maxWeight) maxWeight = weight[1];
	//	if(weight[2]>maxWeight) maxWeight = weight[2];
		
	//	int maxAge = age[0];
	//	if(age[1]>maxAge) maxAge = age[1];
	//	if(age[2]>maxAge) maxAge = age[2];
		//최대값 두번째 방법(함수)
		//동일한 기능을 반복할 경우 하나의함수로 만들어 사용하면 편리해짐.나중에 다른데서도 사용가능
		int maxHeight = max(height[0],height[1],height[2]);
		int maxWeight = max(weight[0],weight[1],weight[2]);
		int maxAge = max(age[0],age[1],age[2]);
		
		System.out.println("제일 큰 키:"+ maxHeight);
		System.out.println("제일 많이 나가는 체중:"+ maxWeight);
		System.out.println("제일 많은 나이:"+ maxAge);
	}

}
