/**
 * @Discribe:MapÓ³Éä
 * @Date:2014-01-07    ÍíÉÏ22:00
 * @Authro:Gongbiao
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
class MapDemo_01{
	public static void main(String[] args){

		HashMap<String,String> m1 = new HashMap<String,String>();
		m1.put("s1","Ä¢¹½");
		m1.put("s2","İ«Ëñ");
		m1.put("s3","°×²Ë");
		m1.put("s4","¶¹¸¯");

		HashMap<String,String> m2 = new HashMap<String, String>();
		m2.put("s5","Çà²Ë");
		m2.put("s1","ÍÁ¶¹");

		m1.putAll(m2);

		/*

		Iterator it =m1.iterator();

		while(it.hasNex()){
		
			System.out.println(m1.get(it.next()));
		}
		*/


		//±éÀúMap¼¯ºÏ
		//
		Set<String> s =  m1.keySet();

		Iterator<String> it = s.iterator();
		while(it.hasNext()){
		
			System.out.println(m1.get(it.next()));
		}



		System.out.println("is ok ...");
	
	}

}
