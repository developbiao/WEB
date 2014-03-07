/**
 * @Discribe: 集合类Map的练习一熟悉Map中的方法
 * @Date:2014-01-13
 * @Author:GongBiao
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class MapDemo_01{

	public static void main(String[] args){

		Map<Integer, String> map = new HashMap<Integer,String>();
		//mapMethodDemo(map);

		mapMethod2(map);


	
		System.out.println("is ok !");
	}

	public static void mapMethodDemo(Map<Integer,String> map){

		map.put(1,"abc1");
		map.put(2,"abc2");
		map.put(3,"abc3");
		map.put(4,"abc4");
		map.put(5,"abc5");
		map.put(6,"abc6");

		//通过KeySet方法获取Map集合中的键集

		Set<Integer> keySet = map.keySet();

		Iterator<Integer> it = keySet.iterator();
		while(it.hasNext()){
			Integer key = it.next();
			String value = map.get(key);
			System.out.println(value);
		}

	

	}

	/*
	 * 演示Map中的重要方式之二:Set<Map.Entry<k,v>>;
	 *
	 */

	public static void mapMethod2(Map<Integer, String> map){

		map.put(1,"白菜");
		map.put(2,"小青菜");
		map.put(3,"火腿肠");
		map.put(4,"青椒炒肉");

		//通过map集合的entrySet,将键值映射来关系到Set集合中
		Set<Map.Entry<Integer, String>> entrySet  =  map.entrySet();

		//通过Set集合获取迭代器
		Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();

		while(it.hasNext()){
		
			Map.Entry<Integer, String> me = it.next();

			Integer key = me.getKey();
			String value = me.getValue();

			System.out.println(key + "————————" + value);
		}





	
	}
}

