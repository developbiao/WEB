/*
 *Project: OverLoad Demo02 �Ժ��������� 
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

	/*�����Ǻ�������*/


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
		return Add(num1,num2) + num3;	//three overload  ����һ�����صļ��ɣ�����������ú��������˴�����.
	}
}
