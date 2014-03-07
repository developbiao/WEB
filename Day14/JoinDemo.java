class Demo implements Runnable
{
	public synchronized void run()
	{
		show();
	}

	public void show()
	{
		for (int x=0; x<50; x++)
		{
			System.out.println(Thread.currentThread().toString()+"......");
			Thread.yield();
		}

	}
}

class JoinDemo
{
	public static void main(String[] args) throws Exception
	{
		Demo d = new Demo();
		Demo d1 = new Class.get();

		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);

		// 开户线程
		t1.start();
		t2.start();

	}
}
