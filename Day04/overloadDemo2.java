/*
 *Project: OverLoad Demo02 对函数的重载 
 *Author: Gongbiao
 *Date: 2013-8-31
 */
class overloadDemo02
{
	public static void main(String[] args)
	{
		int sum =  Add(3, 10 );
		System.out.println("Is Add sum ="+ sum);
		

	}

	/*下面是函数部分*/


	public static double Add(double num1, int num2)
	{
		return num1 + num2;	//double overload
	}

	public static int Add(int num1, int num2)
	{
		return num1 + num2; 	//int overload
	
	}
	

	public static int Add(int num1, int num2, int num3)
	{
		return Add(num1,num2) + num3;	//three overload  这是一种重载的技巧，函数里面调用函数减少了代码量.
	}
}
