package java2_five_list;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class JAVA2_five_LinkedList_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		
		long startTime;
		long endTime;
		
		//1.�߰��� �߰��ϴ� ���
		System.out.println("1.�߰��� �߰��ϴ� ���");
		startTime = System.nanoTime();
		for(int i=0;i<10000;i++) {
			list1.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList �ɸ��ð�: "+(endTime-startTime)+"ns");//ArrayList �ɸ��ð� : 7323600ns
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList �ɸ��ð� : "+ (endTime-startTime)+ " ns");//LinkedList�ɸ��ð�:1632300ns
		
		//2.���� ���������� �߰��ϴ� ���
		System.out.println("2.���� ���������� �߰��ϴ� ���");
		startTime = System.nanoTime();
		for(int i = 0; i<10000;i++) {
			list1.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList�ɸ��ð� : "+ (endTime-startTime)+"ns");//ArrayList �ɸ��ð� 880399ns
	
		startTime = System.nanoTime();
		for(int i = 0; i <10000; i ++) {
			list2.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList �ɸ��ð�: "+(endTime-startTime)+"ns");//LinkedList �ɸ��ð� : 1058300ns
		
	}

}
