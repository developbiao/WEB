/**
 * @Discribe:Date���ѧϰDemo_02��ʽ������
 * @Date:2014/01/20
 * @Author:GongBiao
 */
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
class DateDemo_02{

	public static void main(String[] args){
	
		//�ж�ʱ���after befor
//		boolean b ; 
//		Date d1 = new Date(12347899);
//		Date d2 = new Date(23343455);
//
//		System.out.println("d1: " + d1);
//		System.out.println("d2: " + d2);
//
//		if(d1.after(d2))
//			System.out.println("֮ǰ");
//		else
//			System.out.println("֮��");
//		System.out.println("is ok !");


		
		  //FormatDate

		/*
		 * �����ڶ���ת��ָ����ʽ�������ַ���
		 * ʹ����DateFormat�����е�format�ķ���
		 */

		//��ʽ����ʾ1
		DateFormatDemo1();
		System.out.println("--------------");

		//��ʽ����ʾ2
		try{
		dateFormatDemo2();
		}catch(Exception e){};


	}

	public static void DateFormatDemo1(){
	
		Date d = new Date();
		//Ĭ�Ϸ�� 
		
		DateFormat dateFormat = DateFormat.getDateInstance();
		//ʹ��ָ����� 
		dateFormat = DateFormat.getDateInstance(DateFormat.LONG);

		//ʹ��ָ����񣬰������ں�ʱ��

		dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		//��ʽ�����Լ���Ҫ�ķ��

		dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String str_date = dateFormat.format(d);


		
		System.out.println(d);
		System.out.println(str_date);
	}
	
	/**
	 * �����ַ���ת�����ڶ���
	 * Ϊ�˻�ȡ���е����ڻ���ʱ����D
	 * ����ʹ���ǵ�DateFormat���е�pasrse����
	 */

	public static void dateFormatDemo2() throws ParseException{

		//�����ַ���
		String str_date = "2013-01-23";

		DateFormat dateFormat = DateFormat.getDateInstance();

		dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		Date date = dateFormat.parse(str_date);
		System.out.println(date);

	}

}
