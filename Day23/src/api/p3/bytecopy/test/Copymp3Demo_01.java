/**
 * @Discribe:Copy mp3 练习题
 * @Author:GongBiao
 * @Date:2014/02/03
 */
package api.p3.bytecopy.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copymp3Demo_01 {
	
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		//Copy_01();
		Copy_02();
		long end = System.currentTimeMillis();
		System.out.println( "耗时：" +  (end - start));
		System.out.println("is ok !");
	}
	
	
	//第一种Copy 方法自定义Buffer
	public static void Copy_01() throws IOException{
		FileOutputStream fos = new FileOutputStream("tempfile\\copy_2Your Love Is My Drug.mp3");  //明确存储目的
		FileInputStream fis = new FileInputStream("tempfile\\Your Love Is My Drug.mp3");  //读取mp3文件,和mp3关联
		
		byte[] buf = new byte[1024];
		int len = 0;
		while((len = fis.read(buf)) != -1){
			fos.write(buf,0,len);
		}
		
		fos.close();
		fis.close();
	}
	
	//第二种方法 Copy 使用默认Buffer
	
	public static void Copy_02() throws IOException{
		
		//关联文件
		FileOutputStream fos = new FileOutputStream("tempfile\\copy_3_Your Love Is My Drug.mp3");
		FileInputStream fis = new FileInputStream("tempfile\\Your Love Is My Drug.mp3");
		
		//创建Buffer
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		int len = 0;
		while((len = bis.read()) != -1){
			bos.write(len);  //写入到缓冲区
		}
		
		bos.close();
		bis.close();
		
		
		
	}
	


}
