/**!
 * @Discribe:��д�����ͻ���
 * @Date:2014/01/23
 * @Author:GongBiao
 */
package api.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo_02 {
	
	private static final String LINE_SPARATOR = System.getProperty("line.separator");
	
	
	public static void main(String[] args) throws IOException{
		
		//��д����������һ�����캯������һ��bool
		FileWriter fw = new FileWriter("d:\\TEMP\\demo.txt",true);
		fw.write("this is ok !" + LINE_SPARATOR);
		fw.write("LINE_SPARATOR IS OK " + LINE_SPARATOR);  //���뻻�з�LINE_SPARATOR
		fw.write("Write Over!");
		fw.flush();
		fw.close();
		System.out.println("is ok!");
	}

}
