/**
 * @Discribe:StringBufferµÄÁ·Ï°
 * @Date:2014-01-08   ÉÏÎç
 * @Author:Gongbiao
 */

class StringTest5{

	public static void main(String[] args){

		StringBuffer sb = new StringBuffer("abcdefg");
		sb.append("this").append("dog");
		sb.append(true);

		sb.insert(0,true);

	    char ch = sb.charAt(0);

		System.out.println(ch);

		System.out.println(sb);

		System.out.println(".....>>>.......");

		//sb.delete(0,sb.length());
		//
		//
		
	//	sb.replace(1,3,"good");
	//
	   System.out.println(sb.reverse());




	
		System.out.println("is ok !");
	}
}
