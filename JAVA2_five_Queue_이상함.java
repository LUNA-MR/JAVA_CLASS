package java2_five_list;
import java.util.LinkedList;
import java.util.Queue;

//Queue를 이용한 메시지 큐
class Message{
	public String command;
	public String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}

	 
}
public class JAVA2_five_Queue_이상함 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Message> queue = new LinkedList<Message>();
		//메세지 저장
		queue.offer(new Message("sendMail", "홍길동"));
		queue.offer(new Message("sendSMS", "신용권"));
		queue.offer(new Message("sendKaKaotalk", "홍두께"));
		
		while(!queue.isEmpty()){//메시지 큐가 비었는지 확인 
			Message message = queue.poll();//메세지 큐에서 1개의 메세지를 꺼냄
		
//poll 그자리 값 삭제하고 다음 값을 당겨서 그자리에 다시 넣음
			switch (message.command) {
				case "sendMail": 
					System.out.println(message.to + "님에게 메일을 보냅니다.");
				case "sendSMS":
					System.out.println(message.to + "님에게 SMS를 보냅니다.");
					break;
				case "sendKaKaotalk":
					System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
					break;
			}
			 
			}
			 
		//해당되는 자료형이 어떤건지 어떤게 어울리는지 확인하기 
		
	}

}
