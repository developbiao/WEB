/**
 * @Discribe:��ȡϵͳ�е�ָ����Ϣ
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

		//��ȡϵͳ�еĲ���ϵͳ

		String value = prop.getProperty("os.name");
		System.out.println( "�㵱ǰ�Ĳ���ϵͳ�ǣ�"+value);
		
	}
}
