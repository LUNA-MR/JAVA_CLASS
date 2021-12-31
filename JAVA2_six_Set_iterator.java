package java2_six_set;
//중복되는 데이터는 하나만 저장됨. 더이상 저장되지 않음.

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JAVA2_six_Set_iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("IBATIS");
		
		int size = set.size(); //저장된 객체 수 얻기
		System.out.println("총 객체수 : " + size); // 총 객체수 : 4
		
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
			}
		//hasNext 가 있어야 하나씩 확인 그다음 데이터가 잇는지 없는지 확인할때 유용함.
		 //while사용문 중요
		System.out.println();
		
		for(String str : set) {
			System.out.println("\t"+str);
		}
		set.remove("JDBC");
		set.remove("IBATIS");
		
		System.out.println("총 객체수:" + set.size());
		
		for(String element: set) {
			System.out.println("\t"+element);
		}
		set.clear();
		if(set.isEmpty()) {System.out.println("비어 있음");}
		//isEmpty 비어있냐없냐 "상태"를 묻는것임.
			
		}
	}
	

