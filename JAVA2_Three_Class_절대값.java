package java2_third;
 
 
class Abs{
	public static int abs(int value) {	
		
		if (value>=0) {
				return value;
			}
		//	else {
				return value*-1;
	
//	public static int abs(int value){
//	return (value>0)?value:value*-1;
		}
	
}
 

public class JAVA2_Three_Class_���밪 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 5;
		System.out.println(value+"�� ���밪:" +   Abs.abs(value));
		value = -10;
		System.out.println(value+"�� ���밪:" + Abs.abs(value));
	}

	 
}
	 


