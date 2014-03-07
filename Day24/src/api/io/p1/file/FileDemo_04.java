/**
 * @Discribe:文件过虑器的使用
 * @Author:GongBiao
 * @Date:2014/02/05
 */
package api.io.p1.file;

import java.io.File;

import api.io.FileNameFilter.FilterByHidden;
import api.io.FileNameFilter.FilterBySuffix;

public class FileDemo_04 {
	
	public static void main(String[] args){
		
		FilterMethod_02();
		
		System.out.println("is ok !");
	}
	
	//过虑sys文件
	public static void FilterMethod_01(){
		File file = new File("c:\\");
		
		String[] names = file.list(new FilterBySuffix("sys"));  //构造器里面传到是文件构造器
		for(String name:names){
			System.out.println(name);
		}
	}
	
	//过虑隐藏文件
	
	public static void FilterMethod_02(){
		
		File file = new File("C:\\");
		
		File[] files = file.listFiles(new FilterByHidden());
		for (File f : files){
			if(f.isFile() && f != null)
			System.out.println(f);
		}
	}

}
