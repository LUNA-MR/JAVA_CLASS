package six;

public class Six_다차원배열 {
			//2차원 이상의 배열을 다차원배열이라고 함.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = {{100,100,100},
				         {20,20,20},{30,30,30},{40,40,40},{50,50,50}
		};
		int KoreaTotal = 0;
		int EnglisthTotal = 0;
		int MathTotal = 0;
		
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("=============================");
		//System.out.println(score.length); -> 5
		for(int i = 0; i <score.length; i++) {//행
			int sum = 0;// 총점
			KoreaTotal += score[i][0];
			EnglisthTotal += score[i][1];
			MathTotal += score[i][2];
			
			System.out.print(" " + (i+1) + " "); //3 번호
			//Ststem.out.println(score[i].length);3
			for (int j=0;j<score[i].length;j++) {
				sum += score[i][j]; // 총점
						System.out.print(score[i][j]+" ");//국어, 영어, 수학
				
			}
			
			System.out.println(sum + " " + sum/(float)score[i].length);
		System.out.println("===========================");
		System.out.println("총점" +KoreaTotal+ " " + EnglisthTotal + " " + MathTotal);
		}
	}

}
