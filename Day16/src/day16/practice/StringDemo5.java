package day16.practice;

import java.net.InetAddress;

public class StringDemo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {78,43,1,5,6,34};
		String s1 = toString_1(arr);
		System.out.println(s1);
	
		

	}
	
	public static String toString_1 (int[] arr){
		String str= ",";
		for(int i=0; i<arr.length; i++){
			
			if (i!= arr.length)
				str += arr[i]+str;
			else
				str += arr[i]+"]";
		}
		
		return null;
	}

}
