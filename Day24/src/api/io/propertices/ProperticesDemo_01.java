/**
 * @Discribe:Propertices���Լ��ϵ�ѧϰ
 * @Author:GongBiao
 * @Date:2014/02/06
 */
package api.io.propertices;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Set;

public class ProperticesDemo_01 {
	
	public static void main(String[] args) throws IOException{
		
		//methodDemo_01();  //������ʾ
		//methodDemo_02();  //IO�������
		//methodDemo_03(); //Properties load
		methodDemo_04(); //��ȡ�����ļ�
		
		
		System.out.println("is ok !");
	}

	//��ȡ�����ļ���ϰ04
	private static void methodDemo_04() throws IOException {
		
		Properties prop = new Properties();
		//BufferedReader bufr = new BufferedReader(new InputStreamReader(new FileInputStream("TEMP\\info.ini")));
		BufferedReader bufr = new BufferedReader(new FileReader("TEMP\\info.ini"));
		
		String line = null;
		while((line = bufr.readLine()) != null){
			
			//String[] strs = new String[1024];
			
			String[] strs = line.split("=");  //�ڴ��������
			
			prop.setProperty(strs[0], strs[1]);
		}
		
		bufr.close();
		prop.list(System.out);
		
	}

	// Properties load ������
	private static void methodDemo_03() throws IOException {
		
		Properties prop = new Properties();
		
		File file = new File("TEMP\\info.ini");
		if(!file.exists())
			file.createNewFile();
		
		FileInputStream fis = new FileInputStream("TEMP\\info.ini");
		
		//1������Ԫ��
		
//		prop.setProperty("С��","19");
//		prop.setProperty("С��","13");
//		prop.setProperty("����","17");
		
		//2�������е����ݼ��ص�����load����
		
		prop.load(fis);
		//prop.list(System.out);  //�����в�������
		
		//3���޸ļ����е�����
		prop.setProperty("caicai", "29");
		prop.setProperty("xiaopao","17");
		//prop.list(System.out);
		
		
		//4���������е����ݴ��浽�ļ���
		
		FileOutputStream fos = new FileOutputStream("TEMP\\info.ini",true);
		
		prop.store(fos, "Perosn");
		fos.close(); 
		fis.close();
		
		
		
		
		
		
	}

	//Properties������ϰ��IO���
	private static void methodDemo_02() {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		
		prop.setProperty("����","18");
		prop.setProperty("������","22");
		prop.setProperty("����", "33");
		
		prop.list(System.out);
		
		
	}

	//Propertices������ϰһ������ʾ
	private static void methodDemo_01() {
		
		//1������Propertices����
		Properties prop = new Properties();
		
		//2������Ԫ��
		prop.setProperty("����","18");
		prop.setProperty("������","22");
		prop.setProperty("����", "33");
		
		//3��ȡԪ��,����
		Set<String> nameset = prop.stringPropertyNames();
		
		for(String name : nameset){
			
			String value = prop.getProperty(name);
			System.out.println(name + ":" + value);
		}
		
		
		
	}
	
	

}
