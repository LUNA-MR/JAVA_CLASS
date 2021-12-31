package java2_five_list;
//배열은 삭제 추가가 아니라 값이 변경이 가능하지만
//인덱스는 삭제를하면 당겨짐 자동으로 중간에 비어지는게 아님고로 삭제 가능함.
//메모리 관련 내용

import java.util.List;
import java.util.Vector;
//List컬렉션 은 총 3개  Array와 vector내부구조 같고 linked는 다름
//ArrayLIst, Vector,LinkedList  차이가 있음. 

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
		//Board객체를 저장
		list.add(new Board("제목1", "내용1","글쓴이1"));
		list.add(new Board("제목2","내용2","글쓴이2"));
		list.add(new Board("제목3","내용3","글쓴이3"));
		list.add(new Board("제목4","내용4","글쓴이4"));
		list.add(new Board("제목5","내용5","글쓴이5"));
		//2번 인텍스 객체(제목3)삭제 (뒤의 인덱스는 1씩 앞으로 당겨짐)
		list.remove(2);
		//3번 인덱스 객체(제목5)삭제
		list.remove(3);
		//저장된 총 객체 수만큼 루핑
		for(int i = 0 ; i<list.size();i++) {
			
		Board bord=list.get(i) ;//for문안에있으니까 for문 안에서만 작동함.
		//객체를 저장하다 - > 데이터를 저장한 주소를 board에?에 저장한다는것 주소를 저장
		try {
			System.out.println(bord.subject = "\t" + bord.content + "\t" + bord.writer);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		}

}
