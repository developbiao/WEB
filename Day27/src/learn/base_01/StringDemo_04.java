/**
 * @Date:2014/03/07
 * @Discribe:String��ķ�����ϰ04
 * @Author:GongBiao
 */
package learn.base_01;

public class StringDemo_04 {
	public static void main(String[] args){
		String s = "Welcome to Java World!";
		System.out.println(s.startsWith("Welcome"));  //ture;
		System.out.println(s.endsWith("World"));  //false
		
		String str1 = "ABCDEFG";
		System.out.println(str1.toLowerCase());
		String str2 = "I love You LZH";
		System.out.println(str2.toUpperCase());
		String str3 = str2.substring(11, str2.length());  //out put LZH
		System.out.println(str3);
		System.out.println("is ok !");
	}
}
