/**
 * @Discribe: LinkedHashMap ��ʾ  ���������ص�
 * @Date:2014-01-14
 * @Author:GongBiao
 */
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map;

class LinkedHashMapDemo_01{

	public static void main(String[] args){

		//LinkedHashMapʵ����ô��ľ���ôȡ����

		HashMap<Integer, String> hm = new LinkedHashMap<Integer,String>();
		hm.put(5,"�");
		hm.put(3,"��ǿǿ");
		hm.put(7,"С�ײ�");
		hm.put(6,"Toms");

		
		//��һ�ֵ����ķ���1.0
		/*

		Iterator<Map.Entry<Integer, String>> it = hm.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<Integer, String> me = it.next();
			Integer key = me.getKey();
			String value = me.getValue();

			System.out.println(key + "----" + value);
		}

		*/

		//�򻯵ĵ�������2.0

		//Set<Integer> keySet = hm.keySet();

		for(Integer i: hm.keySet()){
		
			String value = hm.get(i);

			System.out.println(i + "----" + value);
		}


		//�򻯵�������3.0
		for(Map.Entry<Integer, String> me: hm.entrySet()){
		
			Integer key = me.getKey();
			String value = me.getValue();
			System.out.println("����3.0: " + key + "----" + value);
		}


		System.out.println(" is ok !");
	}
}
