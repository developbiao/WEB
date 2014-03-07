/**
 * @Discribe: 时间对象练习，比较两个时间相差时间
 * @Date:2014/01/21
 * @Author:GongBiao
 */

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class DateTest_01{
	public static void main(String[] args) throws Exception{

		String str_date1 = "2013/6/13";
		String str_date2 = "2014/01/21";

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		//对日期对象进行解析

		Date date_1 = dateFormat.parse(str_date1);
		Date date_2 = dateFormat.parse(str_date2);

		long time_1 = date_1.getTime();
		long time_2 = date_2.getTime();
		long time = time_1 - time_2;
		
		System.out.println(time /1000/60/60/24);
	
		System.out.println("is ok !");
	}
}


