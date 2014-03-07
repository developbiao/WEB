/**
 * @Discribe:ReadKey��ȡ������ϰ02  Сдת��д
 * @Author:GongBiao
 * @Date:2014/02/04
 */
package api.p3.bytecopy.test;

import java.io.IOException;
import java.io.InputStream;

public class ReadKeyTest_02 {
	
	public static void main(String[] args) throws IOException{
		
		readKey();
		
		System.out.println("is ok !");
	}

	private static void readKey() throws IOException {
		//��ȡ���ķ���
		
		InputStream  in = System.in;
		
		//����һ��������
		
		StringBuilder sb = new StringBuilder();
		
		//����һ���洢�ֽ����ı���
		
		int ch = 0;
		//ѭ����ȡ

		while((ch = in.read()) != -1){
			
			if(ch == '\n')
				continue;
			if(ch == '\r'){
				String s = sb.toString();
				if("over".equals(s)  || "OVER".equals(s))
					break;
				else{
					System.out.println(s.toUpperCase());
					sb.delete(0,sb.length());
				}
			}
			else
				sb.append((char) ch);
		}
		
		
		
	}

}
