/**
 * @Discribe:编码解码学习
 * @Author:GongBiao
 * @Date:2014/02/04
 */
package api.p4.transstream;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TransstreamDemo_06 {
	
	public static void main(String[] args) throws IOException{
		
		writeTextByGBK();
		readTxt();
		System.out.println("is ok !");
	}

	//通过gbk的编码将中文件写入到一个文件中
	private static void writeTextByGBK() throws IOException {
		//第一种
//		FileWriter fw = new FileWriter("tempfile\\gbk.txt"); //默认码表
//		fw.write("你好~！");
//		fw.close();
		
		//第二种
		
//		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("tempfile\\gbk.txt"),"utf-8"));
//		
//		bufw.write("你好！");
//		bufw.newLine();
//		bufw.flush();
//		bufw.close();
		
		//第三种方法
		
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("tempfile\\utf.txt"), "utf-8");
		osw.write("我和我的小伙伴都惊呆了！");
		osw.close();
		
	}
	
	
	//读取编码
	public static void readTxt() throws IOException{
		
//		FileReader fr = new FileReader("tempfile\\gbk.txt");
//		char[] buf = new char[1024];
//		int len = 0;
//		while((len = fr.read(buf)) != -1){
//		
//			System.out.println((char)len);   //读不出来，乱码
		
		InputStreamReader isr = new InputStreamReader(new FileInputStream("tempfile//utf.txt"),"utf-8");
		//用指定的utf-8 或gb2312的方式读取
		
		char[] buf = new char[1024];
		
		int len = isr.read(buf);
		String str = new String(buf,0,len);
		
		System.out.println(str);
		
		isr.close();
		
			
		}
	}

/**
 * 小结:
 * gbk 单个字占2个字节
 * utf-8 单个字占3个字节
 * 
 * 
 */

