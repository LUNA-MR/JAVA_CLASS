package two;

public class Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//boolean: True or False �ΰ���"��"�� ������ ���̳� �����̳ĸ� �����ϱ� ���� �����.
		
		boolean a = true;
		boolean b = false;
		boolean c = !b;//b�� ���� �ݴ�� �ٲپ� ���
		
		System.out.println(a); //ture�� ���
		System.out.println(b); //false�� ���
		
		System.out.println(b); //false�� ���
		System.out.println(c); //ture�� ���
		
		
	//����  ++
		int d = 1;
		System.out.println(d); //1
		d++;  // a�� ���� 1 ���� ���Ѷ�  d �� �ܵ����� �ѹ��� ����ұ����� �տ� ++�� ���̵� �ڿ� ++ ���̵� �Ѵ� +1�� ��Ű�� ��������
		
		// ������ ����ϴ� ��� �տ� �ٴ� �Ͱ� �ڿ� �ٴ� ���� ���̰� �ִ�. 
		
		
		System.out.println(d); //2
		System.out.println(++d); //: �⺻ 2 �� + 1 �� �ѵ� d�� ��� �϶� ; ���� ��Ų �� ���
		System.out.println(d++); // ���� d�� ����ϰ� �״����� ++�س��ƶ�  ; ��� �� ���� 
		System.out.println(d); //�ռ� ���ڿ��� �������� ++ ���ֶ�� �����ϱ� ���⼭ ��µȰ��� �� ���� +1 �� ���� ��µǾ����.
		
		
//if���̳� ������� true,false���� ��ȯ�ϱ� ���� �񱳿����� �� �� 
		System.out.println("�񱳿����� :  ");
		int e = 10;
		int f = 20;
		int g = 30;
		System.out.println(e<f);
		System.out.println(e>f);
		System.out.println(e+f<=g);
		System.out.println(e+f>=g);
		
		
		//�����ġ ����ġ
		System.out.println("������ġ: ");
		double h = 3.14;
		double i = 5.14;
		System.out.println(h ==i);
		System.out.println(h != i );
		
		String c1 = "Hello JAVA!";
		System.out.println(c1.equals("Hello java!"));
		System.out.println(c1.equals("Hello JAVA!"));
		
//��������  and(&&) , or(||),xor(^)
		System.out.println("�� ������ : ");
		int z = 10;
		System.out.println(5<z && z <15);// true && true
		System.out.println((5<z && z<15) && z %2 ==0);
		System.out.println((5<z && z<15) && z %2!= 0 );
		
		z = 4;
		System.out.println((4<=z && z<15) && z%2 == 0); //true && true
		System.out.println((5<z && z<15) || z%2 != 0); //true ||false
		
		
//���׿����� ����?�׸�1(true�̸� ���) : �׸�2(false�̸� ���)   -> �ʱⰪ �����Ҷ� ������. 
		
		System.out.println("���׿�����: ���̰� 18���̸� ? ");
		int age = 18 ;
		System.out.println(age > 20? "�����Դϴ�.": "û�ҳ��Դϴ�.");

		
// ���Կ�����
		System.out.println(" ���� ������:");
		int x = 3;
		int y = 5;
		System.out.println(y); //5
		y = x;
		System.out.println(y); //3
		
		System.out.println(x); //3
		x += 1;  //x = 1 + x  
		System.out.println(x);//4
		x /= 2;  // x = x/2
		System.out.println(x);//2
		x *= x ; // x = x * x
		System.out.println(x);//4
		
		
// &&(and)������ , || (or)������  
		System.out.println("������� ���� ���̱� ������ �ٽ� �ѹ� ");
		System.out.println(true && true);  //true
		System.out.println(true && false); //false
		System.out.println(false && true); //fasle
		System.out.println(false && false);  // false
		
		System.out.println(true || true); // true
		System.out.println(false || true); // true
		System.out.println(true || false); // true
		System.out.println(false|| false); // false
		
		
		
	}

}
