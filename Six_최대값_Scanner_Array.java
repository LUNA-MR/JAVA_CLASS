package six;

import java.util.*;
public class Six_�ִ밪_Scanner_Array {
	//�ܺο� �Լ� ����� 3���� ���� ���޹޾Ƽ� �ִ밪�� �����ִ� �Լ��� ����.
	static int max(int a, int b,int c) {
		int max = a;  
		if(b>max)max = b;
		if(c>max)max = c; 
		return max; //max�� ��ȯ�ϱ� max���� ���� �Լ����� ��������� �ؼ� return�� ��
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//3���� ����, ü��, ������ �ִ밪�� ���ؼ� ǥ��
		Scanner stdIn = new Scanner(System.in);
		int[] height = new int[3]; //����
		int[] weight = new int[3];
		int[] age = new int[3];
		for (int i = 0; i<3; i++) {//�Է�
			System.out.print("[" + (i+1 )+ "]");
			System.out.print("����:"); height[i] = stdIn.nextInt();
			System.out.print("ü��:"); weight[i] = stdIn.nextInt();
			System.out.print("����:"); age[i] = stdIn.nextInt();
		}
		
		//������ �ִ밪�� ���ϱ� �������
	//	int maxHeight = height[0];
	//	if (height[1] > maxHeight) maxHeight = height[1];
	//	if (height[2] > maxHeight) maxHeight = height[2];
		
	//	int maxWeight = weight[0];
	//	if(weight[1]>maxWeight) maxWeight = weight[1];
	//	if(weight[2]>maxWeight) maxWeight = weight[2];
		
	//	int maxAge = age[0];
	//	if(age[1]>maxAge) maxAge = age[1];
	//	if(age[2]>maxAge) maxAge = age[2];
		//�ִ밪 �ι�° ���(�Լ�)
		//������ ����� �ݺ��� ��� �ϳ����Լ��� ����� ����ϸ� ������.���߿� �ٸ������� ��밡��
		int maxHeight = max(height[0],height[1],height[2]);
		int maxWeight = max(weight[0],weight[1],weight[2]);
		int maxAge = max(age[0],age[1],age[2]);
		
		System.out.println("���� ū Ű:"+ maxHeight);
		System.out.println("���� ���� ������ ü��:"+ maxWeight);
		System.out.println("���� ���� ����:"+ maxAge);
	}

}
