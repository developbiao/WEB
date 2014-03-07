package day16.practice;

import java.util.Arrays;

public class WrapperTest {
	private static final String SPACE_SEPARATOR=" ";
	
	public static void main(String[] args){
		String numStr = "20 78 9 -7 88 36 29";
		
		System.out.println(numStr); 
		numStr = sortStringNumber(numStr);  //������
		System.out.println(numStr);
	}

	/**
	 * ���ַ�����������
	 * @param numStr
	 * @return
	 */
	public static String sortStringNumber(String numStr) {
		// TODO Auto-generated method stub
		//1�����ַ�������ַ�������
		String[] str_arr = stringToArry(numStr);
		//2�����ַ���������int����
		int[] num_arr = toIntArray(str_arr);
		//3����int ��������
		mysortArray(num_arr);
		//4�������ַ�����
		String temp = arrayToString(num_arr);
		
		return temp;
	}
	/**
	 * StringBuffer ���ش������ַ���
	 * @param num_arr
	 * @return
	 */
	private static String arrayToString(int[] num_arr) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i<num_arr.length; i++){
			if(i!=num_arr.length-1)
				sb.append(num_arr[i]+SPACE_SEPARATOR);
			else
				sb.append(num_arr[i]);
		}
		return sb.toString();
	}

	/**
	 * ��int�����������
	 * @param num_arr
	 * @author admin
	 */
	
	private static void mysortArray(int[] num_arr) {
		// TODO Auto-generated method stub
		Arrays.sort(num_arr);
	}

	/**
	 * ���ַ���ת����int����
	 * @param str_arr
	 * @return
	 */

	private static int[] toIntArray(String[] str_arr) {
		// TODO Auto-generated method stub
		int[] arr = new int[str_arr.length];
		for(int i=0; i<str_arr.length; i++){
			arr[i] = Integer.parseInt(str_arr[i]);
		}
		
		return arr;
	}

	/**
	 * ���ַ�������ַ�������
	 * @param numStr
	 * @return
	 */
	private static String[] stringToArry(String numStr) {
		// TODO Auto-generated method stub
		String[] str_arr = numStr.split(SPACE_SEPARATOR);
		return str_arr;
	}

}
