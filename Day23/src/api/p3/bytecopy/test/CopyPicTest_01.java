/**
 * @Discribe:Copy图片的测试
 * @Author:GongBiao
 * @Date:2014/02/03
 */
package api.p3.bytecopy.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyPicTest_01 {
	
	public static void main(String[] args) throws IOException{
		
		long start = System.currentTimeMillis();
		//CopyPic_01();  //字符的方式写入
		CopyPic_02();   //Stream流方式写入
		long end = System.currentTimeMillis();
		System.out.println("耗时: " + (end - start));
		System.out.println("is ok !");
	}
	
	//以字符流方式Copy图片测试
	
	public static void CopyPic_01() throws IOException{
		
		FileReader fr = new FileReader("tempfile\\mode1.jpg");
		FileWriter fw = new FileWriter("tempfile\\copy_pic01.jpg");
		
		int ch = 0;
		while((ch = fr.read()) != -1){
			fw.write(ch);
		}
		
		fr.close();
		fw.flush();
		fw.close();
		
		System.out.println("写入完成!");
	}
	
	//以流的方式Copy图片
	
	public static void CopyPic_02() throws IOException{
		
		FileInputStream fis = new FileInputStream("tempfile\\mode1.jpg");
		FileOutputStream fos = new FileOutputStream("tempfile\\copy_pic02.jpg");
		
		//Stream Buffer
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int len = 0;
		while((len = bis.read()) != -1){
			
			bos.write(len);
		}
		
		fis.close();
		fos.close();
	
	}
	
	

}
