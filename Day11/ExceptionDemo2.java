/*
 * �Զ����׳� 
 * �쳣�ǿ��Դ����
 * ����ʽ��
 * 1�������׳������ߵ����߹��ܻ������⣬ͨ��throws�ؼ��ֶ����������ڹ����ϡ� 
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
	//		throw new FushuException("����������");
			throw new FushuException(b);
		if(b==0) //Ҫ���ֶ��׳�һ���쳣������Ҫ�õ�throw�ؼ���
			throw new ArithmeticException("���군�ˣ��㶼�����ˣ�");
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
		catch(FushuException e)  //�����Ĵ���
		{
			System.out.println("message:"+e.getMessage());
			System.out.println("������:"+e.toString());
			System.out.println(e.getNum());
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("�У��쳣�ˣ�");
		//	System.out.println("Message:"+e.getMessage());
		//	System.out.println("ToString:"+e.toString());
			e.printStackTrace();//print�쳣����Ϣ������+λ��
			
		}
		System.out.println("Over");
	}
}
