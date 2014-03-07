/**
 * @Discribe:删除一个文件夹里面的内容，包括子文件夹
 * @Author:GongBiao
 * @Date:2014/02/06
 */
package api.io.p2.file;

import java.io.File;

import api.io.bean.MyFileException;

public class FileTest_02 {

	public static void main(String[] args)throws MyFileException{
		
		/**
		 * 练习:删除一个带内容的文件夹
		 * 思路
		 * 1、删除一个带内容的目录，必须按照windows的规则由内向外
		 * 2、要删除最里面使用递归
		 * 
		 */
		try{
		File dir = new File("TEMP\\hacker");
		removeDir(dir);
		}catch(MyFileException my){
			//throw new MyFileException("文件不存在，请检查...");
			my.printStackTrace();
			System.out.println("Are you really your file?");
			
		}
		System.out.println("is ok !");
	}

	private static void removeDir(File dir) throws MyFileException {
		// 删除方法
		
		File[] files = dir.listFiles();

		for(File file : files){
			if(file.exists()){
				if(file.isDirectory()){
					removeDir(file);  //递归
				}
				else{
					System.out.println("file:" + file.delete()); //如果是个文件就干掉
				}
			}
			else
				throw  new MyFileException("文件夹或文件不存在，空针异常!");
		}
		
		System.out.println("dir:" + dir.delete());
	}
}
