package six;

public class Six_Random_roto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//45���� �������� �����ϱ� ���� �迭 ����.
		//�ζǴ� �ߺ���ȣ�� �� �� ����  temp���(��, ī�弯�� )
		//�ڸ����� �ٲ�ġ�� temp���� 
		//����� random �� ���ϸ� ������ ����  ���-1���� �� ���� �� ����
		int[] ball = new int[45]; //�� 45�� �ʿ�
		
			
		for(int i = 0; i<ball.length;i++)
			ball[i] = i+1;//ball[0]�� 1�� ����ȴ�. 
						  //�迭�� �� ��ҿ� 1~45�� ���� �����Ѵ�.
		
		int temp = 0;
		int j = 0;
		
		//�迭�� ����� ���� �� ���̵��� ����� ū �ݺ�Ƚ�Ҹ� �����Ѵ�.
		//�迭�� ù ��° ��ҿ� ������ ��ҿ� ����� ���� ���� �ٲ㼭 ���� ���´�.
		for(int i = 0; i<1000 ;i++) {
			j = (int)(Math.random()*45);//�迭 ����(0~44)�� ������ ���� ��´�. 
			temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
			
		}
		// �迭 ball�� �տ��� ���� 6���� ��Ҹ� ����Ѵ� 
		for(int i=0; i<6; i++)
			System.out.print(ball[i]+" ");
		
		
	}

}
