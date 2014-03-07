/**
 * @Discribe:����¼��洢��ӡ
 * @Author:GongBiao
 * @Date:2014/02/04
 */
package api.p3.bytecopy.test;

import java.io.IOException;
import java.io.InputStream;

public class ReadKeyTest_01 {
	
	public static void main(String[] args) throws IOException{
		
		readKey();
		
		System.out.println("is ok !");
	}

	private static void readKey() throws IOException {
		// TODO Auto-generated method stub
		
		//1����ȡ����¼��������
		
		InputStream in = System.in;
		
		//2������һ���������ڴ洢��ȡ�����ֽ� 
		
		StringBuilder sb = new StringBuilder();
		
		//3��ѭ����ȡ����
		
		int ch = 0;
		while((ch = in.read()) != -1){
			
			//��Ҫ�Զ�ȡ���ֽڽ����ж�
			//�����/r ���� /n�����洢������Ϊһ��¼�����ݽ�������ǰ��¼�����ݽ����ж�
			
			if(ch == '\r')
				continue;
			if(ch == '\n'){
				String s = sb.toString();
				if("over".equals(s)){
					break; //����¼��һ��Ҫ�������ʶ
				}
				else{
					System.out.println(s.toUpperCase());  //ת��д
					sb.delete(0,sb.length());  //���������
				}
			}
			
			else
				sb.append((char)ch);
			
		}
		
	}

}
