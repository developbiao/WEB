package api.FileReader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo_02 {
	
	public static void main(String[] args) throws IOException{
		//�Ƚ���һ�з���
		FileReader fr = new FileReader("D:\\TEMP\\demo2.txt");
		
		//����һ���ַ�����
		char[] buf = new char[1024];
		//������Reader�е�read(char[]); ����
		//����ȡ�����ַ��洢�������У��������˶����ĸ���
		//int len1 = fr.read(buf);
		//System.out.println(len1 + ":" + new String(buf, 0, len1));
		int len = 0;
		while((len = fr.read(buf)) != -1){
			System.out.println(new String(buf, 0, len));  //����������ʼλ�ý���λ��
		}
		
		fr.close();
		System.out.println("is ok !");
	}

}
