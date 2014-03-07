/**
 * @Discribe:复习传统的读的方法
 * @Author:GongBiao
 * @Date:2014/02/03
 */
package api.replace;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo_02 {
	
	public static void main(String[] args) throws IOException{
		
		FileWriter fw = new FileWriter("D:\\TEMP\\demo05.txt" , true);
		FileReader fr = new FileReader("D:\\TEMP\\demo2.txt");
		
		//Demo Reader
		int ch = 0;
		while((ch = fr.read()) != -1){
			
			fw.write(ch);
			
		}
		
		fr.close();
		fw.flush();
		fw.close();
		
		System.out.println("is ok !");
	}

}
