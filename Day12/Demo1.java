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
			 throw new LanPingException(" ����������!")
		if (state==1)
			throw new LanPingException("����ð���ˣ�");
		System.out.println("��������");


	}

		public void reset()
		{
			//reset computer
			System.out.println("���������У�");
		}

		public void maoyan()
		{
			System.out.println("������!");
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
		System.out.println(name+"����");
		}
		catch (LanPingException e)
		{
			//��������
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
		Teacher t = new Teacher("����ʦ");
		t.prelect();
	}	
}
