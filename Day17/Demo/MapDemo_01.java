/**
 * @Discribe:Mapӳ��
 * @Date:2014-01-07    ����22:00
 * @Authro:Gongbiao
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
class MapDemo_01{
	public static void main(String[] args){

		HashMap<String,String> m1 = new HashMap<String,String>();
		m1.put("s1","Ģ��");
		m1.put("s2","ݫ��");
		m1.put("s3","�ײ�");
		m1.put("s4","����");

		HashMap<String,String> m2 = new HashMap<String, String>();
		m2.put("s5","���");
		m2.put("s1","����");

		m1.putAll(m2);

		/*

		Iterator it =m1.iterator();

		while(it.hasNex()){
		
			System.out.println(m1.get(it.next()));
		}
		*/


		//����Map����
		//
		Set<String> s =  m1.keySet();

		Iterator<String> it = s.iterator();
		while(it.hasNext()){
		
			System.out.println(m1.get(it.next()));
		}



		System.out.println("is ok ...");
	
	}

}
