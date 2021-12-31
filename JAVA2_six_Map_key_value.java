package java2_six_set;
//검색을 위해 사용되는 것
//파이썬의 딕셔너리
//Set은 인덱스 없이 저장 순서대로 저장 x
//map은 key와 value로 구성됨. set처럼 hashcode와 equals를 사용함.
//key 타입은 주로 string을 많이 사용함. 문자열이 같을 경우 동등 객체가 될 수 있도록 hasecode와 equals메소드가 재정의 해서 기준을 맞춤

import java.util.HashMap;
import java.util.Scanner;

 
public class JAVA2_six_Map_key_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap();
		Scanner sc = new Scanner(System.in);
		hm.put("apple", "사과");
		hm.put("paper", "종이");
		hm.put("flower", "꽃");
		String voca;
		System.out.println("알고 싶은 단어를 입력하세요:");
		voca = sc.nextLine();
		
		if(hm.containsKey(voca)) {
			System.out.println("해당하는 뜻은: " + hm.get(voca));
		}
		else {
			System.out.println("해당 단어에 대한 뜻은 데이터베이스에 없습니다.");
		}
 //get(voca)를 하면 해당 키의 value값을 반환함.
	}

}
