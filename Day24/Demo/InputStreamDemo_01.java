/**
 * @Discribe:InputStreamDemo�����ӡ��ϰ
 * @Author:GongBiao
 * @Date:2014/02/07
 */

import java.io.*;
class InputStreamDemo_01{

	public static void main(String[] args)throws IOException{

		//��Ļ������
	
		OutputStream os = System.out;
		InputStream is = System.in;

		byte[] buf = new byte[16];
		int len = is.read(buf);
		System.out.println(new String(buf,0,len));
		System.out.println(buf.length);
		System.out.println(len);
		
		System.out.println("is ok !");
	}
}
