package api.FileReader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo_02 {
	
	public static void main(String[] args) throws IOException{
		//先进的一中方法
		FileReader fr = new FileReader("D:\\TEMP\\demo2.txt");
		
		//创建一个字符数组
		char[] buf = new char[1024];
		//调用了Reader中的read(char[]); 方法
		//将读取到的字符存储了数组中，并返回了读到的个数
		//int len1 = fr.read(buf);
		//System.out.println(len1 + ":" + new String(buf, 0, len1));
		int len = 0;
		while((len = fr.read(buf)) != -1){
			System.out.println(new String(buf, 0, len));  //三个参数开始位置结束位置
		}
		
		fr.close();
		System.out.println("is ok !");
	}

}
