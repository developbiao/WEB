/**
 * @Discribe:Calendar学习01
 * @Date:2014/01/22
 * @Author:GongBiao
 */

import java.util.Calendar;

public class CalendarDemo_01{

	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		//对这个日历对象进行指定日期的设定
		//c.set(2010,10,6);
		//System.out.println(c);

		//在指定的日期上偏移

		//c.add(Calendar.DAY_OF_MONTH, -1);
		
		//System.out.println(c);
		 show(c);

		System.out.println("is ok!");
	}

	//show Calendar日期
	
	public static void show(Calendar c){
	
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		String week = getWeek(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(year + "年" + month + "月" + day + "日" + week);
	}

	public static String getWeek(int week){
		if(week > 7 || week < 1)
			throw new NoWeekException("没有这个星期!");
		String[] weeks = {"", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
		return weeks[week];
	}
}
