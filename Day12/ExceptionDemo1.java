/*
 * Practice:Exception finally
 * Author:Gongbiao
 * Date:2013-10-6
 */

class Demo
{
	public int div(int a , int b) throws Exception
	{
		return a/b;
	}
}

class ExceptionDemo1
{
	public static void main(String[] args)
	{
		Demo d = new Demo();
		try
		{
			int num = d.div(4,0);
		}
		catch(Exception e )
		{
			System.out.println(e.toString());
			System.exit(0);  //exit jvm
		}
		finally
		{
			System.out.println("finally run");
		}

		System.out.println("over");
	}
}
