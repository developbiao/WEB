/**
 * @describe���ַ�����reverseArray
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
	 * �������ַ�����ת������
	 * @param str
	 * @return str
	 */

	public static String reverseString(String str){
		//1�����ַ���ת���ַ�����
		
		char[] chs = str.toCharArray();
		reverseArray(chs);

		return new String(chs);  //ͨ�����������ַ�����ת���ַ���

	}


	/**
	 * ��һ��������з�ת
	 */

	private static void reverseArray(char[] chs){
		for(int start = 0, end=chs.length-1; start < end ; start++,end--){
			swap(chs,start,end);  //����
		}



	
	}

	/*
	 * ���ַ�����Ԫ�ؽ���λ�õ�ת��
	 */
	private static  void swap(char[] chs, int start, int end){
		char temp = chs[start];
		chs[start] = chs[end];
		chs[end] = temp;
	}
}
