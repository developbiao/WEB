/**
 * @Discribe: java Date�������ѧϰ
 * @Date:2014/01/20
 * @Author:GongBiao
 */

import java.util.Date;
class DateDemo_01{

	public static void main(String[] args){

		
		//��ȡ��ǰ���ڶ���ֱ��new Date����

		Date d = new Date(132343242);  //ͨ�����캯����ֵ
		d.setTime(153233558);  //ͨ������setTime();
		System.out.println(d);

		//��ӡ����
		dateMethodDemo();
	
		System.out.println("is ok !");
	}

	//���ڶ���ͺ���֮���ת��
	
	public static void dateMethodDemo(){

		Date d = new Date();
		long time = d.getTime();
		System.out.println(time);

	
	}
}
