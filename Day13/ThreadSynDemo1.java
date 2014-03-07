/*
 * Practice:ͬ����ǰ�᣺
 * ����Ҫ��֤��ͬ�����ж���̣߳���Ϊͬ����ֻ��һ���߳����ͬ����û������
 * ����Ҫ��֤����߳���ͬ����ʹ�õ���ͬһ����
 * ���뱣֤����߳�ʹ�õ�����ͬһ��
 * ���ǲų�Ϊ����߳���ͬ���ˡ�
 */

class Ticket implements Runnable
{
	private int num = 200;
	Object obj = new Object();  //����Ҫ��һ������
	public void run()
	{
		while(true)
		{
			synchronized(obj)
			{
				if (num>0)
				{
					try{Thread.sleep(10);}
					catch(InterruptedException e)
					{
						
					}

					System.out.println(Thread.currentThread().getName()+"......sale......"+num--);
				}
				else
				break;
			}
		}
	}
}

class ThreadSynDemo1
{
	public static void main(String[] args)
	{
	
		Ticket t = new Ticket();

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		
		//�����߳�
		t1.start();
		t2.start();
		t3.start();
	}
}
