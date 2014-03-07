/**
 * @Discribe:Date类的学习Demo_02格式化日期
 * @Date:2014/01/20
 * @Author:GongBiao
 */
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
class DateDemo_02{

	public static void main(String[] args){
	
		//判断时间的after befor
//		boolean b ; 
//		Date d1 = new Date(12347899);
//		Date d2 = new Date(23343455);
//
//		System.out.println("d1: " + d1);
//		System.out.println("d2: " + d2);
//
//		if(d1.after(d2))
//			System.out.println("之前");
//		else
//			System.out.println("之后");
//		System.out.println("is ok !");


		
		  //FormatDate

		/*
		 * 将日期对象转成指定格式的日期字符串
		 * 使用了DateFormat对象中的format的方法
		 */

		//格式化演示1
		DateFormatDemo1();
		System.out.println("--------------");

		//格式化演示2
		try{
		dateFormatDemo2();
		}catch(Exception e){};


	}

	public static void DateFormatDemo1(){
	
		Date d = new Date();
		//默认风格 
		
		DateFormat dateFormat = DateFormat.getDateInstance();
		//使用指定风格 
		dateFormat = DateFormat.getDateInstance(DateFormat.LONG);

		//使用指定风格，包含日期和时间

		dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		//格式化成自己想要的风格

		dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String str_date = dateFormat.format(d);


		
		System.out.println(d);
		System.out.println(str_date);
	}
	
	/**
	 * 日期字符串转成日期对象
	 * 为了获取其中的日期或者时间字D
	 * 解析使用是的DateFormat类中的pasrse方法
	 */

	public static void dateFormatDemo2() throws ParseException{

		//日期字符串
		String str_date = "2013-01-23";

		DateFormat dateFormat = DateFormat.getDateInstance();

		dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		Date date = dateFormat.parse(str_date);
		System.out.println(date);

	}

}
