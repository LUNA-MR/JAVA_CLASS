package five;

import java.util.Arrays;
//array�� import �ؾ� print�Ҷ� [��,,��,����,]listó�� ����.
public class Five_First2011_11_22array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�迭�� ������ :  int �ϳ� �����ؼ� 100���̻��� �ѹ��� ����� �ְ�, for���� ����ϱ� ����
		//while �� ��° ���� �ݺ���, for��  �迭��� ���� + �ݺ�
		// first ù��°  �ʱⰪ�� 0���� �� ���.
		int[] student = new int[3]; //���̰� 3�� �迭 ����
		System.out.println("���� �ڵ����� �ʱ�ȭ�� ��:"+student[0]);
		
		student[0] = 30;//�迭�� ù ��° ��ҿ� 30�� ����
		student[1] = 20; // �迭�� �� ��° ��ҿ� 20�� ����
		student[2] = 10;//�迭�� �� ��° ��ҿ� 10�� ����
		
		System.out.println("���� ù ��° ����� ��:"+ student[0]);
		student[2] = 100;
		System.out.println("���� ������ ����� ��:"+ student[2]);
		
		
		//�������� �迭 ���� ���  
		//1.for ���� �̿��� ���
		//���̰� 5�� �迭 ����, �迭���� ����
		int[] a= new int[] {10,20,30,3,15};
	
//		2.new int �������� 
		//�� ��ȣ ���� ���ϰ�, ���� ���� �������
		//���̰� 7�� �迭 ����, new int[] ���� ����
		int[] b = { 1,2,3,4,5,6,7};
	
		
//		3.for �� �迭 �ʱ�ȭ 10�� �����̴ϱ� ���̴� .length �� �迭�� ���� ����.
		int[] c = new int[10];
		for(int i = 0; i< c.length;i++) {
			c[i] = i;
		}
		System.out.println(c.length);
		
//		4.foreach�� ������Ͽ� ��� ,  int d: �ڵ����� �迭�� ������ŭ 0������ ����. c�� �迭�̸�.
		
		for(int i = 0; i<c.length; i ++) {
			System.out.print(c[i]);
		}
		
//		5.�迭�� ���ڿ��� �ٲٴ� ���  importjava �־����. ������ �Ұ�����. ���� ����ִ��� Ȯ���ϱ� ���� ����Ͽ� ���� �뵵��. 
		System.out.println();
		for(int d:c) {
			System.out.print(d);
		}
		System.out.println();
		System.out.println(Arrays.toString(c));
		//Arrays.toString �ż��� ���
	
//    �迭�� ���� ��� ���� ���� 
	   int[] score = {100,96,90,88,93};
	   int sum = 0;
	   for (int i = 0; i<score.length; i++) {
		   sum += score[i];
		   
	   }

	   System.out.println("���� ��� ���� : "+ sum/(float)score.length);
	   
	   
	   
	   
	  
	   
	}
}
