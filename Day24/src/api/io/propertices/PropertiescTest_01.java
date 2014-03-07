/**
 * @Discribe:Properties 练习:软件的试用期
 * @Author:GongBiao
 * @Date:2014/02/06
 */
package api.io.propertices;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiescTest_01 {
	
	public static void main(String[] args) throws IOException{
		
		if(countDemo()){
			System.out.println("程序运行中！");
		}else{
			
			System.out.println("试用期到，请注册！");
		}
		
		
		System.out.println("is ok !");
	}
	
	public static boolean countDemo() throws IOException{
		Properties prop = new Properties();
		
		int count = 0;
		
		//配置文件
		File confile = new File("TEMP\\config.ini");
		if(!confile.exists())
			confile.createNewFile();
		FileInputStream fis = new FileInputStream(confile);
		
		//将文件中的数据加载到prop中
		prop.load(fis);
		
		//获取配置文件中的次数
		String value = prop.getProperty("count");
		if(value != null){
			count = Integer.parseInt(value);
			if(count >= 5){
				
				//System.out.println("试用期到，请付费！");
				return false;
			}
		}
		count ++;
		System.out.println("运行" + count + "次");
		
		//将具体的数据存储到集合中
		prop.setProperty("count", String.valueOf(count));
		
		//将集合中的数据写入到文件中存储
		FileOutputStream fos = new FileOutputStream(confile,true);
		prop.store(fos,"UserLocaL");
		
		fos.close();
		fis.close();
		return true;
	}

}
