package java2_five_list;
//�迭�� ���� �߰��� �ƴ϶� ���� ������ ����������
//�ε����� �������ϸ� ����� �ڵ����� �߰��� ������°� �ƴ԰�� ���� ������.
//�޸� ���� ����

import java.util.List;
import java.util.Vector;
//List�÷��� �� �� 3��  Array�� vector���α��� ���� linked�� �ٸ�
//ArrayLIst, Vector,LinkedList  ���̰� ����. 

class Board{
	String subject;
	String content;
	String writer;
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
}
public class JAVA2_five_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Board> list = new Vector<Board>();
		//Board��ü�� ����
		list.add(new Board("����1", "����1","�۾���1"));
		list.add(new Board("����2","����2","�۾���2"));
		list.add(new Board("����3","����3","�۾���3"));
		list.add(new Board("����4","����4","�۾���4"));
		list.add(new Board("����5","����5","�۾���5"));
		//2�� ���ؽ� ��ü(����3)���� (���� �ε����� 1�� ������ �����)
		list.remove(2);
		//3�� �ε��� ��ü(����5)����
		list.remove(3);
		//����� �� ��ü ����ŭ ����
		for(int i = 0 ; i<list.size();i++) {
			
		Board bord=list.get(i) ;//for���ȿ������ϱ� for�� �ȿ����� �۵���.
		//��ü�� �����ϴ� - > �����͸� ������ �ּҸ� board��?�� �����Ѵٴ°� �ּҸ� ����
		try {
			System.out.println(bord.subject = "\t" + bord.content + "\t" + bord.writer);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		}

}
