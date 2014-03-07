/**
 * @Discribe:��ϰ��дTransDemo
 * @Author:GongBiao
 * @Date:2014/02/04
 */
package api.p4.transstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TreansDemo_05 {
	
	public static void main(String[] args) throws IOException{
		
		//��һ���ļ�д�뵽��һ���ļ�
		
		//BufferedReader
		BufferedReader bufr = new BufferedReader(new InputStreamReader(new FileInputStream("tempfile\\demo3.txt")));
		
		//BufferedWriter
		
		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("tempfile\\demo5.txt")));
		
		String line = null;
		while((line = bufr.readLine()) != null){
			
			bufw.write(line.toLowerCase());
			bufw.newLine();
			bufw.flush();
		}
		
		bufw.close();
		
		System.out.println("д��ɹ���");
		
		System.out.println("is ok !");
	}

}
