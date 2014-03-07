class Resource
{
	private String name;
	private int count = 1;
	private boolean flag = false;  //���λ
	public synchronized void set (String name)
	{
		while(flag)
		
			try{this.wait();}catch(InterruptedException e){}

			this.name = name + count; 
			count ++;
			
			System.out.println(Thread.currentThread().getName()+"....������...."+this.name);
			flag = true;
			notifyAll();
		


	}

	public synchronized void out()
	{
		while (!flag)
		
			try{this.wait();}catch(InterruptedException e){}
			System.out.println(Thread.currentThread().getName()+"......������......"+this.name);
			flag = false;
			notifyAll();
		
	}
}

/*������*/
class Producer implements Runnable
{
	private Resource r;
	Producer(Resource r)
	{
		this.r = r;
	}

	public void run()
	{
		while(true)
		{
			r.set("��ͷ");
		}
	}
}

/* ������ */

class Consumer implements Runnable
{
	private Resource r;
	Consumer(Resource r)
	{
		this.r = r;
	}

	public void run()
	{
		while(true)
		{
			r.out();
		}
	}
}

/*���������*/

class ProducerConsumerDemo
{
	public static void main(String args[])
	{
		Resource r = new Resource();
		Producer pro = new Producer(r);
		Consumer con = new Consumer(r);

		Thread t1 = new Thread(pro);
		Thread t2 = new Thread(con);

		t1.start();
		t2.start();
	}
}
