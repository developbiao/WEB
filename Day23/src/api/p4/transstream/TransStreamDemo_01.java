/**
 * @Discribe:TransStream键盘的录入
 * @Author:GongBiao
 * @Date:2014/02/04
 */
package api.p4.transstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TransStreamDemo_01 {

		public static void main(String[] args) throws IOException{
			
			//键盘录入，字节读取流
			InputStream in = System.in;
			
			//创建一个转换流，是一个字符流，在构造时，将字节流作为参数传入构造函数
			InputStreamReader ist = new InputStreamReader(in);
			//System.out.println((char)ist.read());
			
			BufferedReader bufr = new BufferedReader(ist);
			
			OutputStream out = new FileOutputStream(".//tempfile//demo2.txt",true);
			
			OutputStreamWriter osw = new OutputStreamWriter(out);  //字符流转换为字节流
			
			//缓冲区BufferedWriter
			BufferedWriter bufw = new BufferedWriter(osw);
			
			//读取写入到文件中
			String line = null;
			while((line = bufr.readLine()) != null){
				
				if("over".equals(line))
					break;
				bufw.write(line.toUpperCase());
				bufw.newLine();
				bufw.flush();
			}
			
			osw.close();
			
			
			
			System.out.println("is ok !");
		}
}
