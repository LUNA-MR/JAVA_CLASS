package four;

public class Four_2021_11_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for( �ʱⰪ ; ���ǽ� ; ������)
		//1)�ʱⰪ ���� ù��°
		//2) ���ǽ�Ȯ�� �ι�°(�ι��� ,�������;��ϴ� ����)
		//3) ���ǽ��� ���̸� ��ɹ� ����
		//4)������ ���� ����°
		//5)���ǽ� Ȯ�� �ι�°
		//6) ���ǽ��� ���̸� ��ɹ� ����
		//4)5)6) �ݺ�
		
		
		
		
		int sum = 0;//�� ���� ���� ����
		for(int i = 1; i <= 10; i++) {//int sum=0;int=num;    for(num = 1; sum <100; num++){sum += num; System.out.println("num:" + num +"/sum:"+sum);}
			//1���� 10������ ��
			System.out.printf("i = %d sum = %d/n", i ,sum += i);
		
			}
		int num ;  // for�� �ۿ� ����������� ��ü���� ��밡��
		for(num = 0; sum<100; num++) {
			sum += num;
			System.out.println("num : " + num+"/sum :" + sum);
		}
		System.out.println("num:"+num); //for ( 1;2;3) -> 1�ѹ� ������ 2�� ����, 3�������� - 2�������� �ݺ���.
		System.out.println("sum:"+sum);
		
		
		
		
		//for - if ��
		int s = 0;
		int n = 0;
		for (n=0;;n++) {
			s += n;
			System.out.println("n: "+n+"/s:"+s);
			if (s >= 100)
				break;	
		}
		System.out.println("n:"+n);
		System.out.println("s:"+s);
	}

}
