package java2_five_list;
import java.util.LinkedList;
import java.util.Queue;

//Queue�� �̿��� �޽��� ť
class Message{
	public String command;
	public String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}

	 
}
public class JAVA2_five_Queue_�̻��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Message> queue = new LinkedList<Message>();
		//�޼��� ����
		queue.offer(new Message("sendMail", "ȫ�浿"));
		queue.offer(new Message("sendSMS", "�ſ��"));
		queue.offer(new Message("sendKaKaotalk", "ȫ�β�"));
		
		while(!queue.isEmpty()){//�޽��� ť�� ������� Ȯ�� 
			Message message = queue.poll();//�޼��� ť���� 1���� �޼����� ����
		
//poll ���ڸ� �� �����ϰ� ���� ���� ��ܼ� ���ڸ��� �ٽ� ����
			switch (message.command) {
				case "sendMail": 
					System.out.println(message.to + "�Կ��� ������ �����ϴ�.");
				case "sendSMS":
					System.out.println(message.to + "�Կ��� SMS�� �����ϴ�.");
					break;
				case "sendKaKaotalk":
					System.out.println(message.to + "�Կ��� īī������ �����ϴ�.");
					break;
			}
			 
			}
			 
		//�ش�Ǵ� �ڷ����� ����� ��� ��︮���� Ȯ���ϱ� 
		
	}

}
