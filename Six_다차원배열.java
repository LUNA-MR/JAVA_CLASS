package six;

public class Six_�������迭 {
			//2���� �̻��� �迭�� �������迭�̶�� ��.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = {{100,100,100},
				         {20,20,20},{30,30,30},{40,40,40},{50,50,50}
		};
		int KoreaTotal = 0;
		int EnglisthTotal = 0;
		int MathTotal = 0;
		
		System.out.println("��ȣ ���� ���� ���� ���� ���");
		System.out.println("=============================");
		//System.out.println(score.length); -> 5
		for(int i = 0; i <score.length; i++) {//��
			int sum = 0;// ����
			KoreaTotal += score[i][0];
			EnglisthTotal += score[i][1];
			MathTotal += score[i][2];
			
			System.out.print(" " + (i+1) + " "); //3 ��ȣ
			//Ststem.out.println(score[i].length);3
			for (int j=0;j<score[i].length;j++) {
				sum += score[i][j]; // ����
						System.out.print(score[i][j]+" ");//����, ����, ����
				
			}
			
			System.out.println(sum + " " + sum/(float)score[i].length);
		System.out.println("===========================");
		System.out.println("����" +KoreaTotal+ " " + EnglisthTotal + " " + MathTotal);
		}
	}

}
