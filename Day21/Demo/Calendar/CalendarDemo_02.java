/**
 * @Discribe: CalendarDemo_02
 * @Date:2014/01/22
 * @Author:GongBiao
 */

import java.util.Calendar;

public class CalendarDemo_02{

	public static void main(String[] args){

		Calendar c = Calendar.getInstance();

		String week = getWeek(c.get(Calendar.DAY_OF_WEEK));
		//int week = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);

	
		System.out.println("is ok !");
	}

	  // ���ڲ��
	public static String getWeek(int week){
		//week = 0; //�����쳣

		if(week >7 || week < 1)
			throw new NoWeekException("û���������");
	
		String[] Weeks ={"","������", "����һ", "���ڶ�", "������", "������", "������", "������"};
		return Weeks[week];
	}
}
