/**
 * @Date:2014/03/07
 * @Discribe:String类练习_02
 * @Author:GongBiao
 */
package learn.base_01;

public class StringDemo_02 {
	
	public static void main(String[] args){
		
		String s1 =  "sun java";
		String s2 = "sun Java";
		System.out.println(s1.charAt(2));    //out put is n
		System.out.println(s2.length());  //获取长度
		System.out.println(s1.indexOf("java"));  //index of 的位置
		System.out.println(s1.indexOf("Java"));  // - 1
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		String str = "我是程序员，我在学习java";
		String str2 = str.replace('我', '你');
		System.out.println(str2);
		
		System.out.println("is ok !");
	}

}
