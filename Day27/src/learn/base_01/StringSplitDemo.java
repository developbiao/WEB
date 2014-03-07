/**
 * @Date:2014/03/07
 * @Discribe:String的split方法使用
 * @Author:GongBiao
 */
package learn.base_01;

public class StringSplitDemo {
	
	public static void main(String[] args){
		
		int j = 1234567;
		String sNumber = String.valueOf(j);
		System.out.println("j 是" + sNumber.length() + "位数");
		
		//字符中的split演示
		String str = "Hello, Moto, ME525, Defy";
		String [] Split = str.split(",");
		for (String s : Split){
			System.out.println(s);
		}
		
		System.out.println("is ok !");
	}

}
