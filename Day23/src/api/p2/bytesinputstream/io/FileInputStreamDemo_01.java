/**
 * @Discribe���ֽ���������FileInputStream
 * @Author:GongBiao
 * @Date:2014/02/03
 */
package api.p2.bytesinputstream.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo_01 {
	
	public static void main(String[] args) throws IOException{
		
		/*
		 * ����:��ȡ һ���ļ�,���ֽ���
		 */
		String local = "tempfile\\demo1.txt";
		FileInputStream fis = new FileInputStream(local);
		
		//int ch = fis.read();
		//System.out.println(ch);
		
		//��һ�ֶ��ڷ���
//		int ch = 0;
//		while((ch = fis.read()) != -1){
//			System.out.print((char)ch);
//		}
		
		//�ڶ��ֶ��ķ���
//		byte[] buf = new byte[1024];
//		
//		int len = 0;
//		while((len = fis.read(buf)) != -1){
//			System.out.println(new String(buf,0,len) );  
//		}
		
		System.out.println("ͳ�Ƶ��ֽ���: " + fis.available());  //��ʼͳ��
		
		//�����ַ�������һ���ոպô�С�Ļ�����
		byte[] buf = new byte[fis.available()];  //�����õķ�������ȫ�����ڴ����
		fis.read(buf);
		
		System.out.println(new String(buf));
		System.out.println(fis.available());
		fis.close();
		
		
		System.out.println("is ok !");
	}

}
