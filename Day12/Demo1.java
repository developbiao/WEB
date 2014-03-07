class LanPingException extends Exception
{
	LanPingException()
	{
		super();
	}
	LanPingExeption(String message)
	{
		super(message);
	}
}

class Computer
{
	private int state = 1;
	public void run()
	{
		if (state==2)
			 throw new LanPingException(" 电脑蓝屏了!")
		if (state==1)
			throw new LanPingException("电脑冒烟了！");
		System.out.println("电脑运行");


	}

		public void reset()
		{
			//reset computer
			System.out.println("电脑重启中！");
		}

		public void maoyan()
		{
			System.out.println("换电脑!");
		}
	
}

class Teacher
{
	private String name;
	private Computer comp;
	Teacher(String name)
	{
		this.name = name;
		comp = new Computer();
	}

	public void prelect() throw MaoyanException
	{
		try
		{
		comp.run();
		System.out.println(name+"讲课");
		}
		catch (LanPingException e)
		{
			//重启电脑
			comp.reset();
			prelect();
		
		}

		catch (MaoYanException e)
		{
			//comp.maoyan();
			throw new;
			prelect();	
		}
	}
}

class Noplan extends Exception
{
	
}

class ExceptionTest
{
	public static void main(String[] args)
	{
		Teacher t = new Teacher("毕老师");
		t.prelect();
	}	
}
