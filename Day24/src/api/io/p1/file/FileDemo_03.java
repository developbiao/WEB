/**
 * @Discribe: �ļ�list��ϰ
 * @Author:GongBiao
 * @Date:2014/02/05
 */
package api.io.p1.file;

import java.io.File;

public class FileDemo_03 {
	
	public static void main(String[] args){
		
		File file = new File("C:\\");
		String[] names = file.list();
		//�����Ǹ��ļ��з�װ����һ�����ڵ�Ŀ¼ 
		for(String name : names)
			System.out.println(name);
		
		System.out.println("is ok !");
	}

}
