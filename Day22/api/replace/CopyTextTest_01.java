/**
 *@Discribe: �ۺ���ϰBuffered
 *@Author:GongBiao
 *@Date:2014/02/03
 *
 */
package api.replace;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextTest_01 {
	
	public static void main(String[] args){
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try{
			fr = new FileReader("D:\\TEMP\\demo2.txt");
			fw = new FileWriter("D:\\TEMP\\demo06.txt", true);
			
			char[] buf = new char[1024];
			
			int len = 0;
			while((len = fr.read(buf)) != -1){
				fw.write(buf,0,len);  //д��ʱ��ע��һ��д��λ��
			}
			
		}catch(IOException e){
			e.printStackTrace();
			
		}finally{
			
			if(fw != null)
				try{
					fw.close();
				}catch(IOException e){
					throw new RuntimeException("д��ʧ��!");
				}
			if(fr != null){
				try{
					fr.close();
					
				}catch(IOException e){
					System.out.println(e.toString());
				}
			}
			
		}
		
		System.out.println("is ok !");
	}

}
