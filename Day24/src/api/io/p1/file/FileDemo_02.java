/**
 * @Discribe:文件的属性方法的使用
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
		
		//methodDemo_01();  //目录路径方法名称
		//methodDemo_02(); //文件大小信息
		//methodDemo_03(); //修改日期
		methodDemo_04(); //判断是文件还是目录
		
		System.out.println("is ok !");
	}
	
	/**
	 * see 判断是文件还是目录方法
	 * @throws IOException 
	 */
	private static void methodDemo_04() throws IOException {
		
		File file = new File("TEMP\\demo7.txt");
		//boolean b = file.isFile();判断是不是文件
		//boolean b = file.isDirectory(); //判断是不是目录
		//boolean b = file.exists(); //判断文件是否存在
		//boolean b = file.createNewFile();//创建
		//boolean b = file.delete();  //delete
		
		//创建文件夹
		File dir = new File("TEMP\\hacker");
		boolean b = dir.delete();//删除文件夹
		//boolean b = dir.mkdir();//创建文件夹
		//boolean b = dir.mkdirs();//mkdir -p
		
		
		
		System.out.println(b);
		
	}

	/**
	 * @see 文件的修改日期
	 */

	private static void methodDemo_03() {
		//Date
		File file = new File("TEMP\\pic3321.jpg");
		long time =  file.lastModified();
		
		//毫秒转Date对象
		
		Date d = new Date(time);
		DateFormat format = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		String str_time = format.format(d);
		System.out.println("最后修改时间：" + str_time);
		
		
		
	}

	/**
	 * @see 第二个方法文件的大小和属性
	 */
	private static void methodDemo_02() {
		// 文件的大小信息
		
		File file = new File("TEMP\\mortar-app.zip");
		long len = file.length();
		long total = file.getTotalSpace();
		long Space = file.getFreeSpace();
		
		System.out.println("文件的大小:" + len + " Bytes");
		System.out.println("磁盘Total:" + total + " Bytes");
		System.out.println("磁盘Free:" + Space + " Bytes");
		
		
	}

	/**
	 * @see 文件的路径和名称
	 */
	private static void methodDemo_01() {
		// 第一个方法的演示学习
		File file = new File("TEMP:\\pic3321.jpg");
		String name = file.getName();  //获取名称
		String absPath = file.getAbsolutePath(); //获取绝对路径
		String path = file.getPath(); //获取路径,获取的是file中封闭的内容
		String dir = file.getParent(); //获取Parent目录
		
		System.out.println("name: " + name );
		System.out.println("absPath: " + absPath);
		System.out.println("path: " + path);
		System.out.println("Parent: " + dir);
		
	}

}
