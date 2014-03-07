/**
 * @Discribe:buffer的方法读的速度
 * @Date:2014/01/24
 * @Author:GongBiao
 */
package api.FileReader;

import java.io.FileReader;
import java.io.IOException;
public class FileReaderDemo_03 {
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("d:\\TEMP\\demo2.txt");
		char[] buf = new char[1024];
		
		int point = 0;
		while((point = fr.read(buf)) != -1){
			System.out.println(new String(buf, 0, point));
		}
		fr.close();
		
		System.out.println("is ok!");
	}
}
