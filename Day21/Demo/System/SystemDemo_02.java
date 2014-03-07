/**
 * @Discribe: System练习02
 * @Date:2014-01-16
 * @Author:GongBiao
 */

import java.util.Set;
import java.util.Properties;

public class SystemDemo_02{

	public static void main(String[] args){
	
		//将系统中的属性信息获取到存储到了Propertices集合中

		Properties prop = System.getProperties();
		
		Set<String> Setname = prop.stringPropertyNames();
		for(String name : Setname){
		
			String value = prop.getProperty(name);
			System.out.println(name + "--->>" + value);
		}

		System.out.println("is ok !");
	}
}

