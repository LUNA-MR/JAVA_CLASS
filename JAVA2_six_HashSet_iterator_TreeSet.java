package java2_six_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class JAVA2_six_HashSet_iterator_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hashset�ߺ��� ������.
		//set�� �ε��� ����. �������� �ƴ�. 
		//treeset�� ������������ ������.
		
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
		System.out.println("<HashSet���>");
		
		while (it.hasNext()) {
			System.out.println(""+it.next());//banana appel demon tomato cargo
			
		}
		Iterator it2 = ts.iterator();
		System.out.println("<TreeSet ���>");
		
		while (it2.hasNext()) {
			System.out.println(""+it2.next());
			
		}
		System.out.println("���� TreeSet�� ũ��: "+ ts.size());
	}

}
