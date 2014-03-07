/**
 * @Discuribe:查找字符串
 * @Date:2014-01-06
 * @Author:Gongbiao
 */
class StringTest1{
	public static void main(String[] args){

		String str = "abcdefdadbnbdadsfdsfwebiao";
		String key = "biao";

		int count = getSubCount(str, key);

		System.out.println(key + "出现的次数为：" + count);

	}

	//查找字符串出现多少次
	/**
	 * 获取一个子串字符串中出现的次数
	 * @param str 给定字符串
	 * @param key 要找的字符串
	 * @return 返回key的次数
	 */

	public static int getSubCount(String str, String key){
		int count = 0;
		int index = 0;

		while((index = str.indexOf(key,index))!= -1){
			index += index + key.length();	
			count ++;
		}

		return count;
	}
}
