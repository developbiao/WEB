/**
 * @Date:2014/03/07
 * @Discribe:String类的复习
 * @Author:GongBiao
 */
package learn.base_01;

public class StringDemo_01 {
	
	public static void main(String[] args){
		
		String s1 = "hello";
		String s2 = "world";
		String s3 = "hello";
		System.out.println(s1 == s3); //true
		s1 = new String("hello");
		s2 = new String("hello");
		System.out.println(s1 == s2);  //false;
		System.out.println(s1.equals(s2));
		char c[] = {'s', 'u', 'n', ' ', 'j', 'a', 'v', 'a'};
		String s4 = new String(c);
		String s5 = new String(c, 1, c.length - 1);   //String (c ,4, 4);  指定了截取的字符串的长度
		System.out.println(s4);
		System.out.println(s5);
		System.out.println("is ok !");
	}
}
