package java2_five_list;
import java.util.Stack;

class Coin{//동전 케이스를 구현한 클래스
	private int value;
	public Coin (int value) {
		this.value = value;
	}
	public int getValue() {
		return value;		
	}
}

public class JAVA2_five_Stack_coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Coin> coinBox = new Stack<Coin>();
		
		//동전을 끼움
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while (!coinBox.isEmpty()) {//동전 케이스가 비어있는지 확인
			Coin coin = coinBox.pop();//동전 케이스의 제일 위의 동전을 꺼냄
			System.out.println("꺼내온 동전: "+ coin.getValue()+"원");			
		}
	}

}
