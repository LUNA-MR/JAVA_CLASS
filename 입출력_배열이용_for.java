package java2_eight입출력;

import java.io.FileInputStream;
import java.io.IOException;

public class 입출력_배열이용_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//bs값이 넘어가는게 아니라 메모리주소가 넘어가는 것임
		//ds에다가 new byte[10]에 저장함.
		 try(FileInputStream fis=new FileInputStream("C:\\input.txt")){
			 byte[] bs = new byte[10];
			 int i;
			 while((i = fis.read(bs))!=-1) {//몇자 읽었는지 i에 저장
				 //그래서 bs[0] = a가 저장된다 이런식으로
			 //for문을 이용하여 i값을 변동시켜서 10개씩 읽기 등 
				 //foreach문은 배열 칸수 만큼 다 읽어서 중복이 된다?
				 /*for(byte b :bs){
				  * System.out.print((char)b);
				  }*/
				 for(int k=0;k<i;k++) {
					 System.out.print((char)bs[k]);
				 }
				 System.out.println(":"+i+"바이트 읽음");
			 }
		 } 
		 
		catch (Exception e) {
		 
			 e.printStackTrace();
		 }
		 System.out.println("end");
	}

}
