/*
 *  ����Ʊ�����Ӹ�д��runnable�ӿڵķ�ʽ
 *  �����̷߳�ʽ��:
 *  1������һ����ʵ��Runnable�ӿ�
 *  2������Runnable�ӿ��е�run������
 *  3�������ýӿڵ��������
 *  4��ͨ��ѧϰThread�����̵߳Ĵ���������Runnable�ӿڵ����������ΪThread��Ĺ��캯����ʵ���д���.
 */

class Ticket implements Runnable
{
	private int num = 100;

	public void run()
	{
		while(true)
		{
			if(num > 0)
			{
				System.out.println(Thread.currentThread().getName()+"----"+num--);
			}
			else
			break;
		}
	}
}

class TicketDemo2
{
	public static void main(String[] args)
	{
		Ticket t = new Ticket();

		//�����̶߳���

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);

			t1.start();
			t2.start();
			t3.start();


	}
}
