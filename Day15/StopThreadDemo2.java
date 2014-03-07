/*
 * Practice: StopThreadDemo2
 * Project: 线程的终止
 */

class StopThread implements Runnable
{

	private boolean flag = true;
	public synchronized void run()
	{
		while(flag)
		{
			try{
				wait();  //t0 t1  wait...
			}
			catch(InterruptedException e)
			{
				System.out.println(Thread.currentThread().getName()+"...."+e);
				flag = false;
			}
		}

		
	}

	
}

class StopThreadDemo2
{
	public static void main(String[] args)
	{
	StopThread st = new StopThread();
	
	Thread t1 = new Thread(st);
	Thread t2 = new Thread(st);
	t1.start();
	t2.setDaemon(true);  //守护线程
	t2.start();

	int num = 1;
	while(true)
	{
		if(++num==50)
		{
			//System.out.println(Thread.currentThread().getName());	
			t1.interrupt();   //stop Thread
			break;
		}
		System.out.println("main...."+num);
	}

	System.out.println("over");
	}

}


