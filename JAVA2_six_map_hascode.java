package java2_six_set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
 
//데이터 순회하기 ->key를 set으로 변경해서 순회.
public class JAVA2_six_map_hascode {
//해시코드를 사용하면 속도가 빠름
//키 값을 가지고 검색하는것을 좋음 
//키를 set으로 변경 map에서 키만 뽑아서 set으로 변경해도 에러 안남
//1.모든 key를 set으로 변경
//2.set 과 같은 순서로 입력, .next로 오고 
//map 객체에 remove 메소드 사용
	
	//entrySet을 이용
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();//<String, Integer>->string을 키값으로, integer를 값으로사용
			
		//객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군",80);
		map.put("홍길동", 95);//키가 같기 때문에 제일 마지막 저장한 값으로 대체
		System.out.println("총 Entry수: " + map.size());
		
		//객체 찾기
		//이름(키)으로 점수(값)를 검색
		System.out.println("\t 홍길동: "+ map.get("홍길동"));//홍길동 : 95
		System.out.println();
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet();//keySet():모든 키를 set객체에 담아서 리턴 
		//	set은 중복값 저장 안함. 
			//	데이터 순회->키 값을 set으로 만들어 하나하나 순회함.
			//	key값으로 value를 가져옴.
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key+":" + value);
			
		}
		/*
		 홍길동:95
		 신용권:85
		 동장군:80
		 */
		System.out.println();
		
		//객체 삭제
		map.remove("홍길동");//키로 map.entry를 제거
		System.out.println("총 entry 수:"+map.size());//총 entry수 :2
		//객체를 하나씩 처리
		//entrySet(): 키와 값의 쌍으로 구성된 모든 Map.Entry 객체를 Set에 담아서 리턴
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+ key +":"+value);
			
			
		}
		/*
		신용권 : 85
		동장군: 80
		 */
		System.out.println();
		
		//객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());//총 Entry 수 : 0 
	}

}
