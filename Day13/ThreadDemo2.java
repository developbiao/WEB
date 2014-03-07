class MyThread extends Thread
{
	public void run()
	{
		int i = 0;
		while (true)
		{
			System.out.println(getName()+"----------"+(++i));
			if (i > 100)break;
			yield();
		}	
	}
}

public class ThreadDemo2
{
	public static void main(String[] args)
	{
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();

		t1.setname("t1");
		t2.setname("t2");

		t1.start();
		t2.start();

		
	}
}
