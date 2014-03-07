/**
 * @Discribe:键盘录入写入到文件练习02
 * @Author:GongBiao
 * @Date:2014/02/04
 */
package api.p4.transstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TransStreamDemo_02 {
	
	public static void main(String[] args) throws IOException{
		
		long start = System.currentTimeMillis();
		
		Write_01();
		
		long end = System.currentTimeMillis();
		System.out.println("耗时：" + (end - start));
		
		System.out.println("is ok !");
	}
	
	public static void Write_01() throws IOException{
		
		InputStream in = System.in;
		InputStreamReader isr = new InputStreamReader(in);
		OutputStream out = new FileOutputStream(".//tempfile//demo3.txt",true);
		BufferedReader bufr = new BufferedReader(isr);
		
		OutputStreamWriter osw = new OutputStreamWriter(out);
		BufferedWriter bufw = new BufferedWriter(osw);
		
		String line = null;
		while((line = bufr.readLine()) != null){
			
			if(line.equals("over"))
				break;
			
			bufw.write(line);
			bufw.newLine();
			bufw.flush();
			
			
		}
		
		bufw.close();
		
		
	}

}
