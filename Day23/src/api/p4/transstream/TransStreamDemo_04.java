/**
 * @Discribe:将一个文件数据写入到另一个文件中。
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

public class TransStreamDemo_04 {
	
	public static void main(String[] args) throws IOException{
		//记牢这两句简写
	//Reader
	BufferedReader bufr = new BufferedReader(new InputStreamReader(new FileInputStream("tempfile//demo2.txt")));
	//BufferedReader bufr = new BufferedReader(new InputStreamReader(new FileInputStream(...)));
	//BuffereadWriter bufw  = new BufferedWriter(new OutputStreamWriter(new FileOutputStream));
	//Writer
	
	BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("tempfile//demo4.txt")));
		
	//频繁的读写操作
	String line = null;
	while((line = bufr.readLine()) != null){
		
		bufw.write(line);
		bufw.newLine();
		bufw.flush();
	}
	
	
		System.out.println("is ok !");
	}

}
