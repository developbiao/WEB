/**
 * @Discribe:Properties ��ϰ:�����������
 * @Author:GongBiao
 * @Date:2014/02/06
 */
package api.io.propertices;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiescTest_01 {
	
	public static void main(String[] args) throws IOException{
		
		if(countDemo()){
			System.out.println("���������У�");
		}else{
			
			System.out.println("�����ڵ�����ע�ᣡ");
		}
		
		
		System.out.println("is ok !");
	}
	
	public static boolean countDemo() throws IOException{
		Properties prop = new Properties();
		
		int count = 0;
		
		//�����ļ�
		File confile = new File("TEMP\\config.ini");
		if(!confile.exists())
			confile.createNewFile();
		FileInputStream fis = new FileInputStream(confile);
		
		//���ļ��е����ݼ��ص�prop��
		prop.load(fis);
		
		//��ȡ�����ļ��еĴ���
		String value = prop.getProperty("count");
		if(value != null){
			count = Integer.parseInt(value);
			if(count >= 5){
				
				//System.out.println("�����ڵ����븶�ѣ�");
				return false;
			}
		}
		count ++;
		System.out.println("����" + count + "��");
		
		//����������ݴ洢��������
		prop.setProperty("count", String.valueOf(count));
		
		//�������е�����д�뵽�ļ��д洢
		FileOutputStream fos = new FileOutputStream(confile,true);
		prop.store(fos,"UserLocaL");
		
		fos.close();
		fis.close();
		return true;
	}

}
