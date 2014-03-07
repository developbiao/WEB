/**
 * @Discribe:�ļ������Է�����ʹ��
 * @Author:GongBiao
 * @Date:2014/02/05
 */
package api.io.p1.file;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public class FileDemo_02 {
	
	public static void main(String[] args) throws IOException{
		
		//methodDemo_01();  //Ŀ¼·����������
		//methodDemo_02(); //�ļ���С��Ϣ
		//methodDemo_03(); //�޸�����
		methodDemo_04(); //�ж����ļ�����Ŀ¼
		
		System.out.println("is ok !");
	}
	
	/**
	 * see �ж����ļ�����Ŀ¼����
	 * @throws IOException 
	 */
	private static void methodDemo_04() throws IOException {
		
		File file = new File("TEMP\\demo7.txt");
		//boolean b = file.isFile();�ж��ǲ����ļ�
		//boolean b = file.isDirectory(); //�ж��ǲ���Ŀ¼
		//boolean b = file.exists(); //�ж��ļ��Ƿ����
		//boolean b = file.createNewFile();//����
		//boolean b = file.delete();  //delete
		
		//�����ļ���
		File dir = new File("TEMP\\hacker");
		boolean b = dir.delete();//ɾ���ļ���
		//boolean b = dir.mkdir();//�����ļ���
		//boolean b = dir.mkdirs();//mkdir -p
		
		
		
		System.out.println(b);
		
	}

	/**
	 * @see �ļ����޸�����
	 */

	private static void methodDemo_03() {
		//Date
		File file = new File("TEMP\\pic3321.jpg");
		long time =  file.lastModified();
		
		//����תDate����
		
		Date d = new Date(time);
		DateFormat format = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		String str_time = format.format(d);
		System.out.println("����޸�ʱ�䣺" + str_time);
		
		
		
	}

	/**
	 * @see �ڶ��������ļ��Ĵ�С������
	 */
	private static void methodDemo_02() {
		// �ļ��Ĵ�С��Ϣ
		
		File file = new File("TEMP\\mortar-app.zip");
		long len = file.length();
		long total = file.getTotalSpace();
		long Space = file.getFreeSpace();
		
		System.out.println("�ļ��Ĵ�С:" + len + " Bytes");
		System.out.println("����Total:" + total + " Bytes");
		System.out.println("����Free:" + Space + " Bytes");
		
		
	}

	/**
	 * @see �ļ���·��������
	 */
	private static void methodDemo_01() {
		// ��һ����������ʾѧϰ
		File file = new File("TEMP:\\pic3321.jpg");
		String name = file.getName();  //��ȡ����
		String absPath = file.getAbsolutePath(); //��ȡ����·��
		String path = file.getPath(); //��ȡ·��,��ȡ����file�з�յ�����
		String dir = file.getParent(); //��ȡParentĿ¼
		
		System.out.println("name: " + name );
		System.out.println("absPath: " + absPath);
		System.out.println("path: " + path);
		System.out.println("Parent: " + dir);
		
	}

}
