package java2_five_list;
 //�÷��� �����ӿ�ũ
import java.util.*; 

public class JAVA2_five_ArrayList {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	
			List<String> list = new ArrayList<String>();
			list.add("A");
			list.add("C");
			list.add("E");
			list.add("G");
			System.out.println("�ʱ����");
			System.out.println("list");//[A,C,E,G]
//�迭�߰��ϴ°�ó�� �׳� �����͸� �߰��ϰ� , �߰��� ������� ��. 
			System.out.println("�ε��� 1��ġ�� B�߰�:");
			list.add(1,"B");//[A,B,C,E,G
			System.out.println(list);
//1,b��������� 1���ε����ڸ��� �߰��ؼ� b�� �������
			
			System.out.println("�ε��� 2��ġ�� �� ����:");
			list.remove(2);
			System.out.println(list);
			
			System.out.print("�ε��� 2�� ��ġ�� �� ��ȯ :"+ list.get(2));
	}

	 
	}

	 


