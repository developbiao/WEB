/**
 * @Discribe:��ȡ����һ��Ķ��·��ж�����
 * @Date:2014/01/22
 * @Author:GongBiao
 */

import java.util.Calendar;
public class CalendarDemo_03{

	public static void main(String[] args){ 
		Calendar c = Calendar.getInstance();
		c = getDays(2014);

		int day = c.get(Calendar.DAY_OF_MONTH);
			System.out.println(day);
		
	
		System.out.println("is ok !");
	}

	//get Day
	
	public static Calendar getDays(int year){
	
		Calendar c = Calendar.getInstance();
		c.set(year,2,1);
		c.add(Calendar.DAY_OF_MONTH, -1);

		return c;
	}
}


/*
 * -------------------------------------------
 *  С��:��ȡ����һ��Ķ��·��ж������õ�����ʱ���ƫ��
 *  ------------------------------------------
 */
