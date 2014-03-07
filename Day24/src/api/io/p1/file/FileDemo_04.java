/**
 * @Discribe:�ļ���������ʹ��
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
	
	//����sys�ļ�
	public static void FilterMethod_01(){
		File file = new File("c:\\");
		
		String[] names = file.list(new FilterBySuffix("sys"));  //���������洫�����ļ�������
		for(String name:names){
			System.out.println(name);
		}
	}
	
	//���������ļ�
	
	public static void FilterMethod_02(){
		
		File file = new File("C:\\");
		
		File[] files = file.listFiles(new FilterByHidden());
		for (File f : files){
			if(f.isFile() && f != null)
			System.out.println(f);
		}
	}

}
