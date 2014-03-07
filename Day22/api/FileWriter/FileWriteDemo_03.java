/**
 * @Discribe:IO���е��쳣����
 * @Date:2014/01/23
 * @Author:GongBiao
 */
package api.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo_03 {
	
	public static void main(String[] args){
		//IO�쳣�Ĵ���淶��������������try�ⴴ������������ã���try����������г�ʼ��
		FileWriter fw = null;
		try{
			
			fw = new FileWriter("k:\\demo3.txt");
			fw.write("abcdefg");
			fw.flush();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(fw != null)
				try{
					fw.close();
					//System.out.println("try runing...");
				}catch(IOException e){
					throw new RuntimeException("�ر�ʧ��!");
					//��صĴ��봦����ʼ˵�ر�ʧ�ܵ���Ϣ��¼����־�ļ���.
				}
		}
		System.out.println("is ok !");
	}

}
