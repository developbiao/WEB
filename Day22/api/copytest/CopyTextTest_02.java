/**
 * @Discribe��Copy�ڵ���2����
 * @Date:2014/01/24
 * @Author:GongBiao
 */
package api.copytest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextTest_02 {
	
	/*��Ч�Ķ�д����*/
	//��ȷ�Ĵ�����try catch finally
	public static void main(String[] args){
		
		FileReader fr = null;
		FileWriter fw = null;
		try{
			
			fr = new FileReader("d:\\TEMP\\demo2.txt");
			fw = new FileWriter("d:\\TEMP\\demo3.txt", true);
			
			char[] buf = new char[1024];  //������
			
			//1��������
			int len = 0;
			while((len = fr.read(buf)) != -1){
				fw.write(new String(buf, 0, len));
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(fw != null)
				try{
					fw.close();
				}catch(IOException e){
					throw new RuntimeException("д��ر�");
				}
			if(fr !=null)
				try{
					fr.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			
		}
		
		System.out.println("is ok !");
	}

}
