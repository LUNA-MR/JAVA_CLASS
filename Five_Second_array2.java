package five;

public class Five_Second_array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //����  sum���ϱ�
		   int[]arr= {10,20,30,40,50};
		   int s=0;
		   for(int n = 0; n <arr.length; n++) {
			   s += arr[n];
		   }
		   System.out.println("���� : " + s);
		   System.out.println("��� : "+ s/(float)arr.length);
		   
	
		//�Էµ� �����͸� ����ϱ� 
		double[] data = new double[5];
		int size = 0;
		data[0] = 10.0; size++;
		data[1] = 20.0; size++;
		data[2] = 30.0; size++;
		
		for(int i = 0; i<size; i++) {
			System.out.println(data[i]);
		}
		
		
		//�ִ밪/�ּҰ� �鿣�� ����� �����ڼ� �׷����� ������ ���� ���°�, ���Ե��³� ���� Ȥ�� ���⺰ 
		int[] score = { 1,2,344,10,34,453,234,7,68,8,65};
		int max = score[0];//�迭�� ù ��° ������ �ִ밪�� �ʱ�ȭ�Ѵ�. 
		int min = score[0];
		for(int i = 0; i<score.length;i++) {
			if (score[i]>max){
				max = score[i];
			}
			if (score[i]<min){
				min = score[i];
				
			}
		}
		System.out.println("�ִ밪 : "+max);
		System.out.println("�ּҰ� : "+min);

		
		//Ƚ���� ����� ���� ���� 1000���� ����.���� ȸ���� ������ ���ڸ��� �ִ� ���ڰ� ����.
		//����
		int[] number = new int[10];
		for(int i=0; i<number.length;i++) {
			number[i] = i;//�迭�� 0~9�� ���ڷ� �ʱ�ȭ�Ѵ�. 
			System.out.println(number[i]);
		}
		System.out.println();
		for(int i =0; i<100; i++) {
			System.out.print(i);
			int n = (int)(Math.random()*10); //0~9���� �� ���� ���Ƿ� ��´�. 
			//0.0*10 = 0,0.9*10 = 9�̴ϱ� �Ҽ����� �� �߸�.
			//Math.random(): 0.0�̻�, 1.0�̸���
			//double ���� ������ ������ ������ ��ȯ
			//System.out.println(Math.random());
			System.out.println("7�̸�����:" + (int)(Math.random()*7)); //���ϱ� �ߴ� ���� -1 ������ ���´�.
			int temp = number[0];
			number[0] = number[n];
			number[n] = temp; 
		}  // temp�� ����Ͽ� �����ڸ��� ��ȣ�� �ٲٱ� �Ҷ� 
		for (int i =0; i<number.length ; i++) {
			System.out.println(number[i]); // �迭�� ������ ����Ѵ�. 
		}
		
}
}
