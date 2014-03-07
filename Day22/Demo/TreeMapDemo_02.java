/**
 * @Discribe:获取字符串的中的字母出现的次数
 * @Date:2014-01-14
 * @Author:GongBiao
 */
import java.util.Map;
import java.util.TreeMap;

class TreeMapDemo_02{

	public static void main(String[] args){
		String str = "abcdefab,,,fdsfdsfsdfsd,,,....safsdfcdefadcfeladfsdlkfflksdl";
		String str2 = getCharCount(str);
		System.out.println(str2);
	
		System.out.println("is ok !");
	}

	public static String getCharCount(String str){
	
		//1、先将字符串转成字符数组

		char[] chars = str.toCharArray();

		//2、定义一个map容器，作为存储字母和次数的表

		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		for(int i=0; i< chars.length; i++){
			//判断是标点符号就不存

			if(!(chars[i]>='a' && chars[i] <='z' || chars[i]>='A' && chars[i] <= 'Z'))
				continue;
		
			//3、将遍历的每个字母都作为键去查表.获取次数
			
			Integer value = map.get(chars[i]);


			int count = 0;
			if(value!=null){  //该字母不存在，将该字母和1次存入
				count = value;
			}
			count ++;
			map.put(chars[i], count);

			//System.out.println(map);

		
		}

		return  mapToString(map);
	}

	private static String mapToString(Map<Character, Integer> map){
		StringBuilder sb = new StringBuilder();

		for(Map.Entry<Character, Integer>me : map.entrySet()){

			Character key = me.getKey();
			Integer value = me.getValue();
			sb.append(key + "(" + value + "),");

		
		}

		return sb.toString();
	}
}
