/**
 * @Discribe:键盘录入存储打印
 * @Author:GongBiao
 * @Date:2014/02/04
 */
package api.p3.bytecopy.test;

import java.io.IOException;
import java.io.InputStream;

public class ReadKeyTest_01 {
	
	public static void main(String[] args) throws IOException{
		
		readKey();
		
		System.out.println("is ok !");
	}

	private static void readKey() throws IOException {
		// TODO Auto-generated method stub
		
		//1、获取键盘录入流对象
		
		InputStream in = System.in;
		
		//2、定义一个容器用于存储读取到的字节 
		
		StringBuilder sb = new StringBuilder();
		
		//3、循环读取键盘
		
		int ch = 0;
		while((ch = in.read()) != -1){
			
			//需要对读取的字节进行判断
			//如果是/r 或者 /n，不存储，并视为一次录入内容结束符这前的录入数据进行判断
			
			if(ch == '\r')
				continue;
			if(ch == '\n'){
				String s = sb.toString();
				if("over".equals(s)){
					break; //键盘录入一定要如结束标识
				}
				else{
					System.out.println(s.toUpperCase());  //转大写
					sb.delete(0,sb.length());  //清除缓冲区
				}
			}
			
			else
				sb.append((char)ch);
			
		}
		
	}

}
