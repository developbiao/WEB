/**
 * @Discribe:TransStream���̵�¼��
 * @Author:GongBiao
 * @Date:2014/02/04
 */
package api.p4.transstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TransStreamDemo_01 {

		public static void main(String[] args) throws IOException{
			
			//����¼�룬�ֽڶ�ȡ��
			InputStream in = System.in;
			
			//����һ��ת��������һ���ַ������ڹ���ʱ�����ֽ�����Ϊ�������빹�캯��
			InputStreamReader ist = new InputStreamReader(in);
			//System.out.println((char)ist.read());
			
			BufferedReader bufr = new BufferedReader(ist);
			
			OutputStream out = new FileOutputStream(".//tempfile//demo2.txt",true);
			
			OutputStreamWriter osw = new OutputStreamWriter(out);  //�ַ���ת��Ϊ�ֽ���
			
			//������BufferedWriter
			BufferedWriter bufw = new BufferedWriter(osw);
			
			//��ȡд�뵽�ļ���
			String line = null;
			while((line = bufr.readLine()) != null){
				
				if("over".equals(line))
					break;
				bufw.write(line.toUpperCase());
				bufw.newLine();
				bufw.flush();
			}
			
			osw.close();
			
			
			
			System.out.println("is ok !");
		}
}
