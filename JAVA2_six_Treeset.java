package java2_six_set;
//2진 tree를 사용하여 중복제거 기본으로 적용, 오름차순으로 데이터를 알아서 정렬함.
//set은 데이터를 빨리 찾아주는 목적으로 만듬. 그래서 순서대로 정렬하지 않음. 마음대로 저장되어 있음
//treeSet은 list의 순서와 다르게 그냥 오름차순으로 데이터를 정렬해줌. 데이터를 추가해도 오름차순으로 정렬해버림.
import java.util.TreeSet;
public class JAVA2_six_Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		
		for(String str: treeSet) {
			System.out.println(str);
		}
		//오름차순으로 정렬이 되어 출력
	}

	public void add(String string) {
		// TODO Auto-generated method stub
		
	}

	public String size() {
		// TODO Auto-generated method stub
		return null;
	}

}
