package six;

import java.util.Arrays;

public class Six_Arrays_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//toString : ���ڿ��� �ٲ��ּ���
		//	(a,2,b,3,4) a�� �迭���� �ε���2�����͵ڷθ�, b�� �迭���� 3��° �ε������� �ٿ��� 4����
			int[] a = {1,2,3,4,5,6};
			int[] b = {0,0,0,0,0,0,0};
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(b));
			System.arraycopy(a, 2, b, 3, 4);
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(b));
	}

}
