/**
 * @Discribe:文本的Copy
 * @Date:2014/01/24
 * @Author:GongBiao
 */
package api.copytest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextTest_01 {
	
	public static void main(String[] args) throws IOException{
		
		FileReader fr = new FileReader("d:\\TEMP\\demo2.txt");
		FileWriter fw = new FileWriter("d:\\TEMP\\demo3.txt", true);
		
		int ch = 0;
		while((ch = fr.read()) != -1){
			fw.write(ch);  //在读的时候就是写到目的地
		}
		
		fr.close();
		fw.close();
		
		System.out.println("写入完成!");
		
		System.out.println("is ok !");
	}

}
