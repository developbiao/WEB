/**
 * @Discribe: LinkedHashMap 演示  迭代方法重点
 * @Date:2014-01-14
 * @Author:GongBiao
 */
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map;

class LinkedHashMapDemo_01{

	public static void main(String[] args){

		//LinkedHashMap实现怎么存的就怎么取出来

		HashMap<Integer, String> hm = new LinkedHashMap<Integer,String>();
		hm.put(5,"李骏");
		hm.put(3,"李强强");
		hm.put(7,"小白菜");
		hm.put(6,"Toms");

		
		//第一种迭代的方法1.0
		/*

		Iterator<Map.Entry<Integer, String>> it = hm.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<Integer, String> me = it.next();
			Integer key = me.getKey();
			String value = me.getValue();

			System.out.println(key + "----" + value);
		}

		*/

		//简化的迭代方法2.0

		//Set<Integer> keySet = hm.keySet();

		for(Integer i: hm.keySet()){
		
			String value = hm.get(i);

			System.out.println(i + "----" + value);
		}


		//简化迭代方法3.0
		for(Map.Entry<Integer, String> me: hm.entrySet()){
		
			Integer key = me.getKey();
			String value = me.getValue();
			System.out.println("迭代3.0: " + key + "----" + value);
		}


		System.out.println(" is ok !");
	}
}
