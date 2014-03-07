class Demo implements Runnable
{
	public void run()
	{
		for(int x=0; x<50; x++)
		{
			System.out.println(Thread.currentThread().toString()+"...."+x);
			Thread.yield();
		}
	}
}

class JoinDemo
{
	public static void main(String[] args) throws Exception
	{
		Demo d = new Demo();

		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);

		t2.start();
		t1.join();   //  线程要申请加入进来，运行。临时加入一个线和运算时可以join方法



		
	}
}
