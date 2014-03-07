/**
 * @Discribe:ReadKey读取键盘练习02  小写转大写
 * @Author:GongBiao
 * @Date:2014/02/04
 */
package api.p3.bytecopy.test;

import java.io.IOException;
import java.io.InputStream;

public class ReadKeyTest_02 {
	
	public static void main(String[] args) throws IOException{
		
		readKey();
		
		System.out.println("is ok !");
	}

	private static void readKey() throws IOException {
		//读取键的方法
		
		InputStream  in = System.in;
		
		//定义一个缓冲区
		
		StringBuilder sb = new StringBuilder();
		
		//定义一个存储字节流的变量
		
		int ch = 0;
		//循环读取

		while((ch = in.read()) != -1){
			
			if(ch == '\n')
				continue;
			if(ch == '\r'){
				String s = sb.toString();
				if("over".equals(s)  || "OVER".equals(s))
					break;
				else{
					System.out.println(s.toUpperCase());
					sb.delete(0,sb.length());
				}
			}
			else
				sb.append((char) ch);
		}
		
		
		
	}

}
