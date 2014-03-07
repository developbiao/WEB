/**
 * @Discribe:获取系统中的指定信息
 * @Date:2014-01-16
 * @Author:GongBiao
 */
import java.util.Properties;
import java.util.Set;

class SystemDemo_03{

	public static void main(String[] args){

		systemMethodDemo_01();
	
		System.out.println("is ok !");
	}

	public static void systemMethodDemo_01(){

		Properties prop = System.getProperties();

		//获取系统中的操作系统

		String value = prop.getProperty("os.name");
		System.out.println( "你当前的操作系统是："+value);
		
	}
}
