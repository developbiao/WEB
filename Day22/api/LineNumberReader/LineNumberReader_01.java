/**
 * @Discribe:LineNumberReader学习
 * @Author:GongBiao
 * @Date:2014/02/03
 */
package api.LineNumberReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReader_01 {
	
	public static void main(String[] args) throws IOException{
		
		FileReader fr = new FileReader("tempfile\\Person.java");
		LineNumberReader lnr = new LineNumberReader(fr);
		
		String line = null;
		lnr.setLineNumber(30); //从30行后开始读
		while((line = lnr.readLine()) != null){
			System.out.println(lnr.getLineNumber() + " "  + line);
		}
				
		lnr.close();
		System.out.println("is ok !");
	}

}

/**
 * 主要的两个方法
 * getLineNubmer();
 * setLineNumber();
 * 作用读代码非常有用
 */
