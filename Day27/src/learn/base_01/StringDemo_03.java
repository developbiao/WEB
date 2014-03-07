/**
 * @Date:2014/03/07
 * @Discribe:String类的方法复习
 * @Author:GongBiao
 * 
 */
package learn.base_01;

public class StringDemo_03 {
	
	public static void main(String[] args){
		String str1 = "       I am a Java Programer";
		str1.trim();
		System.out.println(str1);
		String str3 = "prefix java good!";
		if (str3.startsWith("prefix")){
			System.out.println("开头发现了prefix");
		}
		System.out.println("is ok !");
	}

}
