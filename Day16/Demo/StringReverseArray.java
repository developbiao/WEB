/**
 * @describe：字符串的reverseArray
 * @Date: 2014-01-06
 * @Author:Gongbiao
 */

class StringReverseArray{
	public static void main(String[] args){

		String str = "I Love you Linux/GUN";
		String str2 = reverseString(str);

		System.out.println("...>>"+str2);

		System.out.println("is ok!");
	}

	/**
	 * 将给定字符串反转并返回
	 * @param str
	 * @return str
	 */

	public static String reverseString(String str){
		//1、将字符串转成字符数组
		
		char[] chs = str.toCharArray();
		reverseArray(chs);

		return new String(chs);  //通过构造器将字符串组转成字符串

	}


	/**
	 * 将一个数组进行反转
	 */

	private static void reverseArray(char[] chs){
		for(int start = 0, end=chs.length-1; start < end ; start++,end--){
			swap(chs,start,end);  //交换
		}



	
	}

	/*
	 * 对字符数组元素进行位置的转换
	 */
	private static  void swap(char[] chs, int start, int end){
		char temp = chs[start];
		chs[start] = chs[end];
		chs[end] = temp;
	}
}
