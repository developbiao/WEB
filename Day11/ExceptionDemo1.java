/*
 * �쳣�ǿ��Դ����
 * ����ʽ��
 * 1�������׳������ߵ����߹��ܻ������⣬ͨ��throws�ؼ��ֶ����������ڹ����ϡ� 
 */
class Demo
{
	public int div(int a , int b ) throws Exception
	{
		if(b==0) //Ҫ���ֶ��׳�һ���쳣������Ҫ�õ�throw�ؼ���
			throw new ArithmeticException("���군�ˣ��㶼�����ˣ�");
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
			System.out.println("�У��쳣�ˣ�");
		//	System.out.println("Message:"+e.getMessage());
		//	System.out.println("ToString:"+e.toString());
			e.printStackTrace();//print�쳣����Ϣ������+λ��
			
		}
		System.out.println("Over");
	}
}
