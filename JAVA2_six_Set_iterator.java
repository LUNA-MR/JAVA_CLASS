package java2_six_set;
//�ߺ��Ǵ� �����ʹ� �ϳ��� �����. ���̻� ������� ����.

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
		
		int size = set.size(); //����� ��ü �� ���
		System.out.println("�� ��ü�� : " + size); // �� ��ü�� : 4
		
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
			}
		//hasNext �� �־�� �ϳ��� Ȯ�� �״��� �����Ͱ� �մ��� ������ Ȯ���Ҷ� ������.
		 //while��빮 �߿�
		System.out.println();
		
		for(String str : set) {
			System.out.println("\t"+str);
		}
		set.remove("JDBC");
		set.remove("IBATIS");
		
		System.out.println("�� ��ü��:" + set.size());
		
		for(String element: set) {
			System.out.println("\t"+element);
		}
		set.clear();
		if(set.isEmpty()) {System.out.println("��� ����");}
		//isEmpty ����ֳľ��� "����"�� ���°���.
			
		}
	}
	

