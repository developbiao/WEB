/**
 * @Discribe:��ȡָ��Ŀ¼���������ݰ�����Ŀ¼
 * @Author:GongBiao
 * @Date:2014/02/05
 */

package api.io.p2.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileTest_01 {
	
	public static void main(String[] args) throws IOException{
		
		File dir = new File("D:TEMP\\"); // ����һ��Ŀ¼ 
		File dis = new File("TEMP\\log.txt");  //Ŀ��λ����־�ļ�
		if(!dis.exists()){
			System.out.println(">>����Ŀ�겻���ڣ�");
			dis.createNewFile();   //��������ھʹ�����
			System.out.println(">>���´����ɹ���");
		}
		
		//����һ��������
//		FileOutputStream fos = new FileOutputStream("TEMP\\log.txt");
//		OutputStreamWriter osw = new OutputStreamWriter(fos);
//		BufferedWriter bufw = new BufferedWriter(osw);
//		bufw.write(showDir(dir,0));
//		bufw.newLine();
//		bufw.flush();
//		bufw.close();
		
		
		showDir(dir, 0);
		
		

		System.out.println("is ok !");
	}

	/**
	 * @see ��ӡtree
	 * @param dir
	 * @param count
	 * @throws IOException 
	 */
	private static void showDir(File dir, int count) throws IOException {
		// TODO Auto-generated method stub
		//�洢�������ļ���Ϣ
		String str = dir.getName() + "\n";
		
		//��������
		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("TEMP\\log.txt",true)));
		
		
		System.out.println(dir.getName());
		count ++;
		File[] files = dir.listFiles();
		if(files != null)  //��׳�ж�NULLPOINT
		for(File f : files){
			if(f.isDirectory()){
				showDir(f, count);
			}
			else{
				str += getSpace(count) + f.getName();
				System.out.println(getSpace(count) + f.getName());
			}
		}
		
		bufw.write(str);
		bufw.newLine();
		bufw.flush();
		bufw.close();
	
		
		
	}
	
	/**
	 * @see GetSpace
	 * @param count
	 * @return String;
	 */
	private static String getSpace(int count){
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<count; i++){
			sb.append("|--");
		}
		
		return sb.toString();
	}

}
