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

	  // 日期查表法
	public static String getWeek(int week){
		//week = 0; //测试异常

		if(week >7 || week < 1)
			throw new NoWeekException("没有这个星期");
	
		String[] Weeks ={"","星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
		return Weeks[week];
	}
}
