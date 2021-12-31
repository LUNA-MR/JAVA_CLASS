package java2_six_set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
 
//������ ��ȸ�ϱ� ->key�� set���� �����ؼ� ��ȸ.
public class JAVA2_six_map_hascode {
//�ؽ��ڵ带 ����ϸ� �ӵ��� ����
//Ű ���� ������ �˻��ϴ°��� ���� 
//Ű�� set���� ���� map���� Ű�� �̾Ƽ� set���� �����ص� ���� �ȳ�
//1.��� key�� set���� ����
//2.set �� ���� ������ �Է�, .next�� ���� 
//map ��ü�� remove �޼ҵ� ���
	
	//entrySet�� �̿�
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();//<String, Integer>->string�� Ű������, integer�� �����λ��
			
		//��ü ����
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺",80);
		map.put("ȫ�浿", 95);//Ű�� ���� ������ ���� ������ ������ ������ ��ü
		System.out.println("�� Entry��: " + map.size());
		
		//��ü ã��
		//�̸�(Ű)���� ����(��)�� �˻�
		System.out.println("\t ȫ�浿: "+ map.get("ȫ�浿"));//ȫ�浿 : 95
		System.out.println();
		//��ü�� �ϳ��� ó��
		Set<String> keySet = map.keySet();//keySet():��� Ű�� set��ü�� ��Ƽ� ���� 
		//	set�� �ߺ��� ���� ����. 
			//	������ ��ȸ->Ű ���� set���� ����� �ϳ��ϳ� ��ȸ��.
			//	key������ value�� ������.
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key+":" + value);
			
		}
		/*
		 ȫ�浿:95
		 �ſ��:85
		 ���屺:80
		 */
		System.out.println();
		
		//��ü ����
		map.remove("ȫ�浿");//Ű�� map.entry�� ����
		System.out.println("�� entry ��:"+map.size());//�� entry�� :2
		//��ü�� �ϳ��� ó��
		//entrySet(): Ű�� ���� ������ ������ ��� Map.Entry ��ü�� Set�� ��Ƽ� ����
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+ key +":"+value);
			
			
		}
		/*
		�ſ�� : 85
		���屺: 80
		 */
		System.out.println();
		
		//��ü ��ü ����
		map.clear();
		System.out.println("�� Entry �� : " + map.size());//�� Entry �� : 0 
	}

}
