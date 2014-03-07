/**
 * @Discribe:练习统计字符出现的次数
 * @Date:2014-01-14
 * @Author:GongBiao
 */
import java.util.Map;
import java.util.TreeMap;

class TreeMapDemo_03{

	public static void main(String[] args){

		String str1 = "hello mynameisgongbiao";   //  空格问题的Bug
		String str2 = stringToCount(str1); 
		System.out.println(str2);
	
		System.out.println("is ok!");
	}


	public static String stringToCount(String str){

		char[] chars = str.toCharArray();

		Map<Character, Integer> map = new TreeMap<Character, Integer>();

		for(int i=0; i<chars.length; i++){ 
			if(chars[i]==' ')
				continue;

			if(!(chars[i] >= 'a' &&  chars[i] <= 'z' || chars[i] >='A' && chars[i] <='Z'))
				continue;

			Integer value = map.get(chars[i]);
			if(value==null)
				map.put(chars[i],1);
			else
				map.put(chars[i],++value);


		
		}

		return mapToString(map);
	
	}

	public static String mapToString(Map<Character, Integer> map){

		StringBuilder sb = new StringBuilder();

		for(Map.Entry<Character, Integer>me : map.entrySet()){

			Integer value = me.getValue();
			Character key = me.getKey();

			sb.append(key + "(" + value + "),");
		

		}

		return sb.toString();


	
	}

}
