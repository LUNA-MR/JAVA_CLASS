package java2_six_set;
//2�� tree�� ����Ͽ� �ߺ����� �⺻���� ����, ������������ �����͸� �˾Ƽ� ������.
//set�� �����͸� ���� ã���ִ� �������� ����. �׷��� ������� �������� ����. ������� ����Ǿ� ����
//treeSet�� list�� ������ �ٸ��� �׳� ������������ �����͸� ��������. �����͸� �߰��ص� ������������ �����ع���.
import java.util.TreeSet;
public class JAVA2_six_Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("ȫ�浿");
		treeSet.add("������");
		treeSet.add("�̼���");
		
		for(String str: treeSet) {
			System.out.println(str);
		}
		//������������ ������ �Ǿ� ���
	}

	public void add(String string) {
		// TODO Auto-generated method stub
		
	}

	public String size() {
		// TODO Auto-generated method stub
		return null;
	}

}
