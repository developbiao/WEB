/**
 * @Discribe:�ı���Copy
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
			fw.write(ch);  //�ڶ���ʱ�����д��Ŀ�ĵ�
		}
		
		fr.close();
		fw.close();
		
		System.out.println("д�����!");
		
		System.out.println("is ok !");
	}

}
