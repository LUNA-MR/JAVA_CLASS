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
		
		//1.중간에 추가하는 경우
		System.out.println("1.중간에 추가하는 경우");
		startTime = System.nanoTime();
		for(int i=0;i<10000;i++) {
			list1.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: "+(endTime-startTime)+"ns");//ArrayList 걸린시간 : 7323600ns
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간 : "+ (endTime-startTime)+ " ns");//LinkedList걸린시간:1632300ns
		
		//2.끝에 순차적으로 추가하는 경우
		System.out.println("2.끝에 순차적으로 추가하는 경우");
		startTime = System.nanoTime();
		for(int i = 0; i<10000;i++) {
			list1.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList걸린시간 : "+ (endTime-startTime)+"ns");//ArrayList 걸린시간 880399ns
	
		startTime = System.nanoTime();
		for(int i = 0; i <10000; i ++) {
			list2.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: "+(endTime-startTime)+"ns");//LinkedList 걸린시간 : 1058300ns
		
	}

}
