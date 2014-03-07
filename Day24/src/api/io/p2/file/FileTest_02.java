/**
 * @Discribe:ɾ��һ���ļ�����������ݣ��������ļ���
 * @Author:GongBiao
 * @Date:2014/02/06
 */
package api.io.p2.file;

import java.io.File;

import api.io.bean.MyFileException;

public class FileTest_02 {

	public static void main(String[] args)throws MyFileException{
		
		/**
		 * ��ϰ:ɾ��һ�������ݵ��ļ���
		 * ˼·
		 * 1��ɾ��һ�������ݵ�Ŀ¼�����밴��windows�Ĺ�����������
		 * 2��Ҫɾ��������ʹ�õݹ�
		 * 
		 */
		try{
		File dir = new File("TEMP\\hacker");
		removeDir(dir);
		}catch(MyFileException my){
			//throw new MyFileException("�ļ������ڣ�����...");
			my.printStackTrace();
			System.out.println("Are you really your file?");
			
		}
		System.out.println("is ok !");
	}

	private static void removeDir(File dir) throws MyFileException {
		// ɾ������
		
		File[] files = dir.listFiles();

		for(File file : files){
			if(file.exists()){
				if(file.isDirectory()){
					removeDir(file);  //�ݹ�
				}
				else{
					System.out.println("file:" + file.delete()); //����Ǹ��ļ��͸ɵ�
				}
			}
			else
				throw  new MyFileException("�ļ��л��ļ������ڣ������쳣!");
		}
		
		System.out.println("dir:" + dir.delete());
	}
}
