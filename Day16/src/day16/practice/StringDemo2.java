package day16.practice;

public class StringDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "hello , my name is gongbiao ,i love you , love linux , linux is very system OS breaking is my love";
		String key = "love";
		int count = getSubCount(text,key);
		System.out.println(count);
		
		

	}
	/**
	 * @param str  传入一个字符串
	 * @param key  传入一个key
	 * @author Administrator
	 */
	
	public static int getSubCount(String str, String key){
		int index = 0 ;  //定义初始化位置
		int count = 0; //定义计数器的位置
		
		while((index=str.indexOf(key,index))!= -1){
			index += key.length();
			count ++;
			
		}
		
		return count;
	}

}
