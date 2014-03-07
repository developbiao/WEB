package api.FileReader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo_01 {
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("d:\\TEMP\\demo2.txt");
		//一次读一个字符的数字
//		int ch1 = fr.read();
//		int ch2 = fr.read();
//		int ch3 = fr.read();
		
		//System.out.println("ch1=" + (char)ch1);
		//System.out.println("ch2=" + (char)ch2);
		//System.out.println("ch3=" + (char)ch3);
		
		//代码使用循环解决
		
		int ch = 0;
		while((ch = fr.read() )!= -1){
			
			System.out.print((char)ch);
			
		}
		
		
		System.out.println("is ok !");
	}
}
