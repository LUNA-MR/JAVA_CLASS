package java2_eight�����;

import java.io.FileInputStream;
import java.io.IOException;

public class �����_�迭�̿�_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//bs���� �Ѿ�°� �ƴ϶� �޸��ּҰ� �Ѿ�� ����
		//ds���ٰ� new byte[10]�� ������.
		 try(FileInputStream fis=new FileInputStream("C:\\input.txt")){
			 byte[] bs = new byte[10];
			 int i;
			 while((i = fis.read(bs))!=-1) {//���� �о����� i�� ����
				 //�׷��� bs[0] = a�� ����ȴ� �̷�������
			 //for���� �̿��Ͽ� i���� �������Ѽ� 10���� �б� �� 
				 //foreach���� �迭 ĭ�� ��ŭ �� �о �ߺ��� �ȴ�?
				 /*for(byte b :bs){
				  * System.out.print((char)b);
				  }*/
				 for(int k=0;k<i;k++) {
					 System.out.print((char)bs[k]);
				 }
				 System.out.println(":"+i+"����Ʈ ����");
			 }
		 } 
		 
		catch (Exception e) {
		 
			 e.printStackTrace();
		 }
		 System.out.println("end");
	}

}
