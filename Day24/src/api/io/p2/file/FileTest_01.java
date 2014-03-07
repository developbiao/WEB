/**
 * @Discribe:获取指定目录中所有内容包含子目录
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
		
		File dir = new File("D:TEMP\\"); // 遍历一个目录 
		File dis = new File("TEMP\\log.txt");  //目标位置日志文件
		if(!dis.exists()){
			System.out.println(">>警告目标不存在！");
			dis.createNewFile();   //如果不存在就创建它
			System.out.println(">>重新创建成功！");
		}
		
		//创建一个输入流
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
	 * @see 打印tree
	 * @param dir
	 * @param count
	 * @throws IOException 
	 */
	private static void showDir(File dir, int count) throws IOException {
		// TODO Auto-generated method stub
		//存储遍历到文件信息
		String str = dir.getName() + "\n";
		
		//创建对象
		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("TEMP\\log.txt",true)));
		
		
		System.out.println(dir.getName());
		count ++;
		File[] files = dir.listFiles();
		if(files != null)  //健壮判断NULLPOINT
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
