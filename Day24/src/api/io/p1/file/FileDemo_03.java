/**
 * @Discribe: 文件list练习
 * @Author:GongBiao
 * @Date:2014/02/05
 */
package api.io.p1.file;

import java.io.File;

public class FileDemo_03 {
	
	public static void main(String[] args){
		
		File file = new File("C:\\");
		String[] names = file.list();
		//必须是该文件中封装的是一个存在的目录 
		for(String name : names)
			System.out.println(name);
		
		System.out.println("is ok !");
	}

}
