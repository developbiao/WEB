/**
 * @Discribe:��ȡ�ַ������е���ĸ���ֵĴ���
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
	
		//1���Ƚ��ַ���ת���ַ�����

		char[] chars = str.toCharArray();

		//2������һ��map��������Ϊ�洢��ĸ�ʹ����ı�

		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		for(int i=0; i< chars.length; i++){
			//�ж��Ǳ����žͲ���

			if(!(chars[i]>='a' && chars[i] <='z' || chars[i]>='A' && chars[i] <= 'Z'))
				continue;
		
			//3����������ÿ����ĸ����Ϊ��ȥ���.��ȡ����
			
			Integer value = map.get(chars[i]);


			int count = 0;
			if(value!=null){  //����ĸ�����ڣ�������ĸ��1�δ���
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
