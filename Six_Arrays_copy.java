package six;

import java.util.Arrays;

public class Six_Arrays_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//toString : 문자열로 바꿔주세요
		//	(a,2,b,3,4) a의 배열에서 인덱스2번부터뒤로를, b의 배열에서 3번째 인덱스부터 붙여라 4개만
			int[] a = {1,2,3,4,5,6};
			int[] b = {0,0,0,0,0,0,0};
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(b));
			System.arraycopy(a, 2, b, 3, 4);
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(b));
	}

}
