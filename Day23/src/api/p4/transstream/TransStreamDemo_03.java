/**
 * @Discribe:将键入的文字打印到屏幕  
 * @Author:GongBiao
 * @Date:2014/02/04
 */
package api.p4.transstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TransStreamDemo_03 {
	
	public static void main(String[] args) throws IOException{
		
		PrintMointor_01();
		System.out.println("is ok !");
	}
	
	//打印到显示器，流程是最重要的。
	public static void PrintMointor_01() throws IOException{
		
		InputStream in = System.in;
		InputStreamReader isr = new InputStreamReader(in);
		OutputStream out = System.out;  //输出到Mointor
		BufferedReader bufr = new BufferedReader(isr);
		
		OutputStreamWriter osw = new OutputStreamWriter(out);
		BufferedWriter bufw = new BufferedWriter(osw);
		
		String line = null;
		while((line = bufr.readLine()) != null){
			
			if("over".equals(line)){
				System.out.println("输入完毕!");
				break;
			}
			bufw.write(line.toUpperCase());
			bufw.newLine();
			bufw.flush();
		}
		
	}

}
