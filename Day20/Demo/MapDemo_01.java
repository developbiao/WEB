/**
 * @Discribe: ������Map����ϰһ��ϤMap�еķ���
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

		//ͨ��KeySet������ȡMap�����еļ���

		Set<Integer> keySet = map.keySet();

		Iterator<Integer> it = keySet.iterator();
		while(it.hasNext()){
			Integer key = it.next();
			String value = map.get(key);
			System.out.println(value);
		}

	

	}

	/*
	 * ��ʾMap�е���Ҫ��ʽ֮��:Set<Map.Entry<k,v>>;
	 *
	 */

	public static void mapMethod2(Map<Integer, String> map){

		map.put(1,"�ײ�");
		map.put(2,"С���");
		map.put(3,"���ȳ�");
		map.put(4,"�ཷ����");

		//ͨ��map���ϵ�entrySet,����ֵӳ������ϵ��Set������
		Set<Map.Entry<Integer, String>> entrySet  =  map.entrySet();

		//ͨ��Set���ϻ�ȡ������
		Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();

		while(it.hasNext()){
		
			Map.Entry<Integer, String> me = it.next();

			Integer key = me.getKey();
			String value = me.getValue();

			System.out.println(key + "����������������" + value);
		}





	
	}
}

