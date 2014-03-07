/**
 * @Discribe:Propertices属性集合的学习
 * @Author:GongBiao
 * @Date:2014/02/06
 */
package api.io.propertices;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Set;

public class ProperticesDemo_01 {
	
	public static void main(String[] args) throws IOException{
		
		//methodDemo_01();  //基本演示
		//methodDemo_02();  //IO技术结合
		//methodDemo_03(); //Properties load
		methodDemo_04(); //读取配置文件
		
		
		System.out.println("is ok !");
	}

	//读取配置文件练习04
	private static void methodDemo_04() throws IOException {
		
		Properties prop = new Properties();
		//BufferedReader bufr = new BufferedReader(new InputStreamReader(new FileInputStream("TEMP\\info.ini")));
		BufferedReader bufr = new BufferedReader(new FileReader("TEMP\\info.ini"));
		
		String line = null;
		while((line = bufr.readLine()) != null){
			
			//String[] strs = new String[1024];
			
			String[] strs = line.split("=");  //内存溢出问题
			
			prop.setProperty(strs[0], strs[1]);
		}
		
		bufr.close();
		prop.list(System.out);
		
	}

	// Properties load 方法三
	private static void methodDemo_03() throws IOException {
		
		Properties prop = new Properties();
		
		File file = new File("TEMP\\info.ini");
		if(!file.exists())
			file.createNewFile();
		
		FileInputStream fis = new FileInputStream("TEMP\\info.ini");
		
		//1、创建元素
		
//		prop.setProperty("小狗","19");
//		prop.setProperty("小炮","13");
//		prop.setProperty("大炮","17");
		
		//2、将流中的数据加载到集合load方法
		
		prop.load(fis);
		//prop.list(System.out);  //开发中测试数据
		
		//3、修改集合中的数据
		prop.setProperty("caicai", "29");
		prop.setProperty("xiaopao","17");
		//prop.list(System.out);
		
		
		//4、将集合中的数据储存到文件中
		
		FileOutputStream fos = new FileOutputStream("TEMP\\info.ini",true);
		
		prop.store(fos, "Perosn");
		fos.close(); 
		fis.close();
		
		
		
		
		
		
	}

	//Properties方法练习二IO结合
	private static void methodDemo_02() {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		
		prop.setProperty("张三","18");
		prop.setProperty("王麻子","22");
		prop.setProperty("条子", "33");
		
		prop.list(System.out);
		
		
	}

	//Propertices方法练习一基本演示
	private static void methodDemo_01() {
		
		//1、创建Propertices对象
		Properties prop = new Properties();
		
		//2、储存元素
		prop.setProperty("张三","18");
		prop.setProperty("王麻子","22");
		prop.setProperty("条子", "33");
		
		//3、取元素,所有
		Set<String> nameset = prop.stringPropertyNames();
		
		for(String name : nameset){
			
			String value = prop.getProperty(name);
			System.out.println(name + ":" + value);
		}
		
		
		
	}
	
	

}
