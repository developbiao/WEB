/**
 * @Discribe: 传统我读的方式
 * @Author:GongBiao
 * @Date:2014/02/03
 */
package api.replace;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo_02 {
	public static void main(String[] args) throws IOException{
		
		FileReader fr = new FileReader("D:\\TEMP\\demo2.txt");
		int ch = 0;
		
		while((ch = fr.read()) != -1){
			
			System.out.print((char)ch);
			
		}
		
		System.out.println("is ok !");
	}

}
