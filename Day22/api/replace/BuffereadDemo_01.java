/**
 * @Discribe:Java IOÁ÷¸´Ï°
 * @Author:GongBiao
 * @Date:2014/02/03
 */
package api.replace;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BuffereadDemo_01 {
	
	public static void main(String[] args) throws IOException{
		
		FileReader fr = new FileReader("D:\\TEMP\\demo2.txt");
		BufferedReader bufr = new BufferedReader(fr);
		
		String line = null;
		while((line = bufr.readLine()) != null){
			System.out.println(line);
		}
		
		System.out.println("is ok !");
	}
}
