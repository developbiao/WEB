/*If Demo 判断季节*/
class IfDemo
{
	public static void main(String[] args)
	{
		int month = 12;
		if (month>12 || month<1)
			System.out.println(month+"月份不存在季节");
		else if (month>=3 && month<=5)
			System.out.println(month+"现在是春节");
		else if(month>=6 && month<=8)
			System.out.println(month+"现在是夏季");
		else if (month>=9 && month<=11)
			System.out.println("现在是秋季");
		else
			System.out.println(month+"现在是冬天");
	}
}
