package day16.practice;

public class StringDemo3 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args){
			
		String text = "abcdefg";
		text = reverseString(text);
		System.out.println("reserver is : "+ text);
	}

	/**
	 * ���ַ��н��з�ת
	 * @param str
	 * @return
	 */
	public static String reverseString(String str) {
		// TODO Auto-generated method stub
		//���ַ���ת�����ַ�����
		char[] chs = str.toCharArray();
		for(int start=0,end=chs.length-1;start<end; start++,end--){
			
			swap(chs, start,end);
		}
		return String.copyValueOf(chs);
	}

	private static void swap( char[]chs, int start, int end) {
		// ��������
		    char temp = chs[start];	
			chs[start] = chs[end];
			chs[end] = temp;
		
		
		
		
	}
	

}
