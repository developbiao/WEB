class Ticket implements Runnable 
{
	private int num = 200;
	Object obj = new Object();
	public void run()
	{
		
		synchronized(obj)
		{
			while(num>0)
			{
				try{Thread.sleep(10);}
				catch(InterruptedException e)
				{};
				System.out.println(Thread.currentThread().getName()+"-----"+num--);
			}
		}
	}


}

class ThreadSynDemo2
{
	public static void main(String[] args)
	{
		Ticket t = new Ticket();
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t5 = new Thread(t);
		Thread t4 = new Thread(t);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}
}
