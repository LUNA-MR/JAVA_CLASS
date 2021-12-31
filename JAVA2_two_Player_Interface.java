package java2_second;

 
//클래스를 만들면서 interface player를 만들면서 오버라이딩 해줘야함. 
//퍼블릭 strat생략되어  있음 ->java complie이 알아서 붙여줌 두개 오버라이딩을 위해 밑에 각 만듬
interface Player{
	void play();  //재생
	void stop(); //정지
}

//비디오 플레이어
class VideoPlayer implements Player{
	//static 객체 저장 가능
	//videoplayer= 생성자
	private int id; //제조번호
	private static int count = 0 ; //현재까지 할당된 제조번호
	
	public VideoPlayer() {  //생성자
		id = ++count;
	}
	public void play() {  //재생
		System.out.println("비디오 재생시작");
			}
	public void stop() { //정지
		System.out.println("비디오 재생종료!");
	}
	public void printInfo() { //제조번호 표시
		System.out.println("이 기계의 제조번호는 {"+ id +"}입니다.");
	}
}




//cd플레이어 
class CDPlayer implements Player{
//player를 구현
//play = stop 오버라이딩, 기능 두개 같음 
	public void play() { //재생
		System.out.println("CD 재생 시작!");
	}
	public void stop() {//정지
		System.out.println("CD 재생 종료!");
	}
	public void cleaning() {//헤드 종료
		System.out.println("헤드를 청소했습니다. ");
	}
}
public class JAVA2_two_Player_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player[] a = new Player[2];
		//[2] 배열 생성  vs ()는 객체생성 구분 하기!
		a[0] = new VideoPlayer(); //비디오 플레이어
		a[1] = new CDPlayer(); //CD플레이어
		
		//다양성을 이용. 두개의 다른 클래스를 묶을 수 있는것은 interface에서 묵어서?
// for each문에서는 인덱스 번호가 궅이 필요없기 때문에 
		//for(player p배열이름ew CDplayer: a 반복횟수임)을 말하는 것임.
		for (Player p:a) {
			p.play();//재생
			p.stop();//정지
			System.out.println();
		}
			
			
	 //제조번호 5번까지 나오도록 해보기 
	//	VideoPlayer[]b = new VideoPlayer[3];
	 
		 
		
	//	for(Player x:b) {
	//		if (x == b[3]){
	//			System.out.println();
		//	}		
	//	}

	    //teacher:
		VideoPlayer[] b1 = new VideoPlayer[4];
		for (int i = 0; i < b1.length;i++) {
			b1[i] = new VideoPlayer();
		}
		b1[b1.length - 1 ].printInfo();
	}

	 
}
