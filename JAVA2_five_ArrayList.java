package java2_five_list;
 //컬렉션 프레임워크
import java.util.*; 

public class JAVA2_five_ArrayList {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	
			List<String> list = new ArrayList<String>();
			list.add("A");
			list.add("C");
			list.add("E");
			list.add("G");
			System.out.println("초기상태");
			System.out.println("list");//[A,C,E,G]
//배열추가하는것처럼 그냥 데이터만 추가하고 , 추가된 순서대로 들어감. 
			System.out.println("인덱스 1위치에 B추가:");
			list.add(1,"B");//[A,B,C,E,G
			System.out.println(list);
//1,b집어넣으면 1번인덱스자리에 추가해서 b를 집어넣음
			
			System.out.println("인덱스 2위치의 값 삭제:");
			list.remove(2);
			System.out.println(list);
			
			System.out.print("인덱스 2번 위치의 값 반환 :"+ list.get(2));
	}

	 
	}

	 


