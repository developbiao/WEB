/*
 * Practice:同步的前提：
 * 必须要保证在同步中有多个线程，因为同步中只有一个线程序该同步是没有意义
 * 必须要保证多个线程在同步中使用的是同一个锁
 * 必须保证多个线程使用的锁是同一个
 * 这是才成为多个线程序被同步了。
 */

class Ticket implements Runnable
{
	private int num = 200;
	Object obj = new Object();  //必须要放一个对象
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
		
		//开启线程
		t1.start();
		t2.start();
		t3.start();
	}
}
