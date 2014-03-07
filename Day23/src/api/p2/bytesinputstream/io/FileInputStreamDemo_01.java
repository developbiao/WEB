/**
 * @Discribe：字节流的输入FileInputStream
 * @Author:GongBiao
 * @Date:2014/02/03
 */
package api.p2.bytesinputstream.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo_01 {
	
	public static void main(String[] args) throws IOException{
		
		/*
		 * 需求:读取 一个文件,用字节流
		 */
		String local = "tempfile\\demo1.txt";
		FileInputStream fis = new FileInputStream(local);
		
		//int ch = fis.read();
		//System.out.println(ch);
		
		//第一种读在方法
//		int ch = 0;
//		while((ch = fis.read()) != -1){
//			System.out.print((char)ch);
//		}
		
		//第二种读的方法
//		byte[] buf = new byte[1024];
//		
//		int len = 0;
//		while((len = fis.read(buf)) != -1){
//			System.out.println(new String(buf,0,len) );  
//		}
		
		System.out.println("统计的字节数: " + fis.available());  //开始统计
		
		//第三种方法创建一个刚刚好大小的缓冲区
		byte[] buf = new byte[fis.available()];  //不常用的方法，安全问题内存溢出
		fis.read(buf);
		
		System.out.println(new String(buf));
		System.out.println(fis.available());
		fis.close();
		
		
		System.out.println("is ok !");
	}

}
