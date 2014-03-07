/**
 * @Discribe: java Date日期类的学习
 * @Date:2014/01/20
 * @Author:GongBiao
 */

import java.util.Date;
class DateDemo_01{

	public static void main(String[] args){

		
		//获取当前日期对象直接new Date即可

		Date d = new Date(132343242);  //通过构造函数传值
		d.setTime(153233558);  //通过方法setTime();
		System.out.println(d);

		//打印毫秒
		dateMethodDemo();
	
		System.out.println("is ok !");
	}

	//日期对象和毫秒之间的转换
	
	public static void dateMethodDemo(){

		Date d = new Date();
		long time = d.getTime();
		System.out.println(time);

	
	}
}
