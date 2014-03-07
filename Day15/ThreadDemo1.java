class ThreadDemo1
{
	public static void main(String[] args)
	{
		Demo d1 = new Demo("小强");
		Demo d2 = new Demo("小丽");
		
		//开启线程
		d1.start();
		try{d1.join();}catch(InterruptedException e){};    //加入线和进来执行
		//d2.setDaemon(true);

		d2.start();
		//d2.setPriority(Thread.MAX_PRIORITY);

		for (int i = 0 ; i<50; i++)
			System.out.println(Thread.currentThread().getName()+"......"+i);
	
	}
}

class Demo extends Thread
{
	private String name;
	Demo(String name)
	{
		//this.name = name;	
		super(name);
	}
	public void run()
	{
		for (int i =0; i<20; i++)
		{
			System.out.println(i+"......"+ Thread.currentThread().getName().toString());
		}
	}
	
}
