/**
 * @Discribe:Calendarѧϰ01
 * @Date:2014/01/22
 * @Author:GongBiao
 */

import java.util.Calendar;

public class CalendarDemo_01{

	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		//����������������ָ�����ڵ��趨
		//c.set(2010,10,6);
		//System.out.println(c);

		//��ָ����������ƫ��

		//c.add(Calendar.DAY_OF_MONTH, -1);
		
		//System.out.println(c);
		 show(c);

		System.out.println("is ok!");
	}

	//show Calendar����
	
	public static void show(Calendar c){
	
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		String week = getWeek(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(year + "��" + month + "��" + day + "��" + week);
	}

	public static String getWeek(int week){
		if(week > 7 || week < 1)
			throw new NoWeekException("û���������!");
		String[] weeks = {"", "������", "����һ", "���ڶ�", "������", "������", "������", "������"};
		return weeks[week];
	}
}
