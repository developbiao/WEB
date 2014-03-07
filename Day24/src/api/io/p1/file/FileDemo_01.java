/**
 * @Discribe:File对象的学习_01
 * @Author:GongBiao
 * @Date:2014/02/05
 */
package api.io.p1.file;

import java.io.File;

public class FileDemo_01 {
	
	private static final String NAME_SEPARATOR = File.separator;
	
	public static void main(String[] args){
		
		fileConsDemo();
		
		System.out.println("is ok !");
	}

	//将文件或目录封闭成对象
	private static void fileConsDemo() {
		// File对象的创建
		File f1 = new File("D:\\TEMP","demo.txt");
		File f2 = new File("D:\\TEMP\\demo2.txt");  //Windows上面使用
		File f3 = new File("D:" + NAME_SEPARATOR + "TEMP" + "NAME_SEPARATOR" + "demo2.txt");  //通用平台
		File f4 = new File("TEMP" + NAME_SEPARATOR);
		System.out.println(f1);
		System.out.println(f3);
		System.out.println(f4);
		
	}

}
