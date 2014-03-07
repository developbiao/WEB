/*
 * 自定义抛出 
 * 异常是可以处理的
 * 处理方式：
 * 1、声明抛出，告诉调用者功能会有问题，通过throws关键字对问题声明在功能上。 
 */

class FushuException extends Exception
{
	private int num;
	FushuException()
	{
		super();
	}
	FushuException(String message)
	{
		super(message);
	
	}

	FushuException(int num)
	{
		this.num = num;
	}

	public int getNum()
	{
		return num;
	}
	
	

}

class Demo
{
	public int div(int a , int b ) throws FushuException,ArithmeticException
	{
		if(b<0)
	//		throw new FushuException("负数不允许！");
			throw new FushuException(b);
		if(b==0) //要想手动抛出一个异常对象，需要用到throw关键字
			throw new ArithmeticException("玩完蛋了，零都被除了！");
		return a/b;
	}

}

class ExceptionDemo2
{
	public static void main(String[] args) throws Exception
	{
		Demo d = new Demo();

		try
		{
		int x = d.div(4,-1);
		System.out.println("x="+x);
		}
		catch(FushuException e)  //负数的处理
		{
			System.out.println("message:"+e.getMessage());
			System.out.println("负数是:"+e.toString());
			System.out.println(e.getNum());
			e.printStackTrace();
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
