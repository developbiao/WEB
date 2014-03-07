/**
 * @Discribe:获取系统中的换行符
 * @Date:2014-01-16
 * @Author:GongBiao
 */
import java.util.Properties;

class SystemDemo_04{

	public static void main(String[] args){
		//line_Sparator


		  String LINE_SPARATOR = System.getProperty("line.separator");
		System.out.println("换行符是：" + LINE_SPARATOR + "world");
	
		System.out.println("is ok !");
	}
}

