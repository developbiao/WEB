/*
 * Practice:�쳣������ϰ
 * ����ʦ�õ����Ͽ�
 * ���������������漰��������
 * ����ʦ������
 * �������е�����
 * �������������ð������
 */

class LanPingException extends Exception
{
	LanPingException(String msg)
	{
		super(msg);
	}
}

class MaoYanException extends Exception
{
	MaoYanException(String msg)
	{
		super(msg);
	}

}

class NoPlanException extends Exception
{
	NoPlanException(String msg)
	{
		super(msg);
	}
}

class Computer
{
	private int state = 2;
	public void run() throws LanPingException,MaoYanException
	{
		if (state==1)
			throw new LanPingException("��������������");
		if (state==2)
			throw new LanPingException("����������!!");

		System.out.println("��������");
	}

	public void reset()
	{
		state = 0;
		System.out.println("��������");
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

	public void prelect() throws NoPlanException
	{
		try
		{
			comp.run();

			System.out.println(name+"����");
		}

		catch (LanPingException e)
		{
			System.out.println(e.toString());
			comp.reset();
			prelect();
		}

		catch (MaoYanException e)
		{
			System.out.println(e.toString());
			test();
			//�ɶԵ��Խ���ά��

			throw new NoPlanException("��ʱ���ȷ���ɣ�ԭ��:"+e.getMessage());
		}

	
	}
		public void test()
		{
			System.out.println("�����ϰ");
		}
}

class ExceptionTest
{
	public static void main(String[] args)
	{
		Teacher t = new Teacher("����ʦ");

		try
		{
			t.prelect();
		}

		catch(NoPlanException e)
		{
			System.out.println(e.toString()+".....");
			System.out.println("����");
		}

	}

}


