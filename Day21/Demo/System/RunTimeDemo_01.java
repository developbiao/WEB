/**
 * @Discribe:Runtimeѧϰ
 * @Date:2014-01-16
 * @Author:GongBiao
 */

import java.io.IOException;

class RunTimeDemo_01{

	public static void main(String[] args) throws Exception{

		Runtime r = Runtime.getRuntime();
		//r.exec("notepad.exe e://hello.txt");

		Process p = r.exec("notepad.exe e:\\hello.txt");
		Thread.sleep(4000);

		p.destroy(); //distroyɱ�����ӽ���
	
		System.out.println("is ok !");
	}
}
