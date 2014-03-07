/**
 * @Discribe:�������ѧϰ
 * @Author:GongBiao
 * @Date:2014/02/04
 */
package api.p4.transstream;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TransstreamDemo_06 {
	
	public static void main(String[] args) throws IOException{
		
		writeTextByGBK();
		readTxt();
		System.out.println("is ok !");
	}

	//ͨ��gbk�ı��뽫���ļ�д�뵽һ���ļ���
	private static void writeTextByGBK() throws IOException {
		//��һ��
//		FileWriter fw = new FileWriter("tempfile\\gbk.txt"); //Ĭ�����
//		fw.write("���~��");
//		fw.close();
		
		//�ڶ���
		
//		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("tempfile\\gbk.txt"),"utf-8"));
//		
//		bufw.write("��ã�");
//		bufw.newLine();
//		bufw.flush();
//		bufw.close();
		
		//�����ַ���
		
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("tempfile\\utf.txt"), "utf-8");
		osw.write("�Һ��ҵ�С��鶼�����ˣ�");
		osw.close();
		
	}
	
	
	//��ȡ����
	public static void readTxt() throws IOException{
		
//		FileReader fr = new FileReader("tempfile\\gbk.txt");
//		char[] buf = new char[1024];
//		int len = 0;
//		while((len = fr.read(buf)) != -1){
//		
//			System.out.println((char)len);   //��������������
		
		InputStreamReader isr = new InputStreamReader(new FileInputStream("tempfile//utf.txt"),"utf-8");
		//��ָ����utf-8 ��gb2312�ķ�ʽ��ȡ
		
		char[] buf = new char[1024];
		
		int len = isr.read(buf);
		String str = new String(buf,0,len);
		
		System.out.println(str);
		
		isr.close();
		
			
		}
	}

/**
 * С��:
 * gbk ������ռ2���ֽ�
 * utf-8 ������ռ3���ֽ�
 * 
 * 
 */

