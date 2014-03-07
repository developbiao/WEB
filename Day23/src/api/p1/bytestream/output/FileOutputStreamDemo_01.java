/**
 * @Discribe:字节流的输入
 * @Author:GongBiao
 * @Date:2014/02/03
 */
package api.p1.bytestream.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo_01 {
	
	public static void main(String[] args) throws IOException{
		
		FileOutputStream fos = new FileOutputStream(".\\tempfile\\demo1.txt",true);
		fos.write("hello FileOutputStream for IO".getBytes());  //写入到字节数组
		fos.write("FileOutputStream字节流!".getBytes());
		
		fos.close();
		
		System.out.println("is ok !");
	}

}
