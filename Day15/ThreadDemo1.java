class ThreadDemo1
{
	public static void main(String[] args)
	{
		Demo d1 = new Demo("Сǿ");
		Demo d2 = new Demo("С��");
		
		//�����߳�
		d1.start();
		try{d1.join();}catch(InterruptedException e){};    //�����ߺͽ���ִ��
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
