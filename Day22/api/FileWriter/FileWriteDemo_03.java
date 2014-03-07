/**
 * @Discribe:IO流中的异常处理
 * @Date:2014/01/23
 * @Author:GongBiao
 */
package api.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo_03 {
	
	public static void main(String[] args){
		//IO异常的处理规范，创建流对象。在try外创建流对象的引用，在try内流对象进行初始化
		FileWriter fw = null;
		try{
			
			fw = new FileWriter("k:\\demo3.txt");
			fw.write("abcdefg");
			fw.flush();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(fw != null)
				try{
					fw.close();
					//System.out.println("try runing...");
				}catch(IOException e){
					throw new RuntimeException("关闭失败!");
					//相关的代码处理，比始说关闭失败的信息记录到日志文件中.
				}
		}
		System.out.println("is ok !");
	}

}
