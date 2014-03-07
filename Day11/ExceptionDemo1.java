/*
 * 异常是可以处理的
 * 处理方式：
 * 1、声明抛出，告诉调用者功能会有问题，通过throws关键字对问题声明在功能上。 
 */
class Demo
{
	public int div(int a , int b ) throws Exception
	{
		if(b==0) //要想手动抛出一个异常对象，需要用到throw关键字
			throw new ArithmeticException("玩完蛋了，零都被除了！");
		return a/b;
	}

}

class ExceptionDemo1
{
	public static void main(String[] args) throws Exception
	{
		Demo d = new Demo();
		try
		{
		int x = d.div(4,0);
		System.out.println("x="+x);
		}
		catch(Exception e)
		{
			System.out.println("有，异常了！");
		//	System.out.println("Message:"+e.getMessage());
		//	System.out.println("ToString:"+e.toString());
			e.printStackTrace();//print异常的信息和名字+位置
			
		}
		System.out.println("Over");
	}
}
