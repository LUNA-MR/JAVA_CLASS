package java2_six_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class JAVA2_six_HashSet_iterator_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hashset중복을 허용안함.
		//set은 인덱스 없음. 순서저장 아님. 
		//treeset은 오름차순으로 정리됨.
		
		HashSet hs = new HashSet();
		hs.add("demon");
		hs.add("banana");
		hs.add("tomato");
		hs.add("apple");
		hs.add("cargo");
		
		TreeSet ts = new TreeSet();
		ts.add("demon");
		ts.add("banana");
		ts.add("tomato");
		ts.add("apple");
		ts.add("cargo");
		
		Iterator it = hs.iterator();
		System.out.println("<HashSet출력>");
		
		while (it.hasNext()) {
			System.out.println(""+it.next());//banana appel demon tomato cargo
			
		}
		Iterator it2 = ts.iterator();
		System.out.println("<TreeSet 출력>");
		
		while (it2.hasNext()) {
			System.out.println(""+it2.next());
			
		}
		System.out.println("현재 TreeSet의 크기: "+ ts.size());
	}

}
