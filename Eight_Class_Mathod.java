package eight;

 
class Account{
	String name;//계좌명의
	String no;//계좌번호
	long balance; //예금잔고
}
  
public class Eight_Class_Mathod {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Account chulsoo = new Account();철수의 계좌
		
		Account chulsoo;
		chulsoo = new Account();
		
		Account yonghee = new Account();//영희의 계좌
		
		chulsoo.name = " 철수";   //철수의 계좌명의
		chulsoo.no = "12345";     //철수의 계좌번호
		chulsoo.balance = 1000;    //철수의 예끔잔고
		 
		yonghee.name = "영희";   //영희의 계좌명의
		yonghee.no = " 78901";   //영희의 계좌번호
		yonghee.balance = 500;   //영희의 예금잔고
		
		chulsoo.balance -= 200;//철수가 200원을 인출
		yonghee.balance += 100;//영희가 100원을 예금
		
		System.out.println(" ---철수의 계좌 ---");
		System.out.println(" 계좌명의 : " + chulsoo.name);
		System.out.println(" 계좌번호 : " + chulsoo.no);
		System.out.println(" 예금잔고 : " +chulsoo.balance);
		
		System.out.println(" ---영희의 계좌---");
		System.out.println("계좌명의:"+yonghee.name);
		System.out.println("계좌번호:" + yonghee.no);
		System.out.println("예금잔고:"+yonghee.balance);
	}
}
		
 
 