package base03.com;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpDemo {

	public static void main(String[] args) throws UnknownHostException {
		
		//��ȡ����������IP
		InetAddress ip = InetAddress.getLocalHost();
		
		//��ȡָ��������IP��ַ����
		ip = InetAddress.getByName("www.google.cn");
		String str_ip = ip.getHostAddress();
		//String str_name = ip.getHostName();
		
		
		
		
		
		
		
		System.out.println(str_ip);
		//System.out.println(str_name);
	}
}
