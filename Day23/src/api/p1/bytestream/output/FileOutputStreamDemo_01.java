/**
 * @Discribe:�ֽ���������
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
		fos.write("hello FileOutputStream for IO".getBytes());  //д�뵽�ֽ�����
		fos.write("FileOutputStream�ֽ���!".getBytes());
		
		fos.close();
		
		System.out.println("is ok !");
	}

}
